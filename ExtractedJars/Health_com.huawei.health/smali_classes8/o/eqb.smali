.class public Lo/eqb;
.super Lo/erc;
.source "SourceFile"


# instance fields
.field a:Lo/eqk;

.field b:Lo/eqm;

.field c:Lo/epy;

.field d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/epx;>;"
        }
    .end annotation
.end field

.field e:Lo/eqj;

.field private f:Lo/epz;

.field g:Landroid/widget/LinearLayout;

.field h:Lo/eqd;

.field i:Lo/eql;

.field k:Lo/eqh;

.field private l:Lo/eqg;

.field private m:Z

.field private n:Landroid/content/BroadcastReceiver;

.field private o:Landroid/support/v7/widget/helper/ItemTouchHelper;

.field private p:Z


# direct methods
.method constructor <init>(Landroid/view/View;Landroid/content/Context;Z)V
    .locals 9

    .line 128
    invoke-direct {p0, p1, p2, p3}, Lo/erc;-><init>(Landroid/view/View;Landroid/content/Context;Z)V

    .line 49
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eqb;->d:Ljava/util/List;

    .line 64
    new-instance v0, Lo/eqb$4;

    invoke-direct {v0, p0}, Lo/eqb$4;-><init>(Lo/eqb;)V

    iput-object v0, p0, Lo/eqb;->n:Landroid/content/BroadcastReceiver;

    .line 129
    const-string v0, "FunctionSetCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "FunctionSetCardViewHolder called"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    invoke-direct {p0}, Lo/eqb;->k()V

    .line 131
    sget v0, Lcom/huawei/ui/homehealth/R$id;->navigation_spots:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/eqb;->g:Landroid/widget/LinearLayout;

    .line 132
    invoke-direct {p0}, Lo/eqb;->g()V

    .line 133
    new-instance v7, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-direct {v7, p2}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 134
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Landroid/support/v7/widget/LinearLayoutManager;->setOrientation(I)V

    .line 135
    sget v0, Lcom/huawei/ui/homehealth/R$id;->function_set_view:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/epz;

    iput-object v0, p0, Lo/eqb;->f:Lo/epz;

    .line 136
    new-instance v0, Lo/epy;

    iget-object v1, p0, Lo/eqb;->d:Ljava/util/List;

    iget-object v2, p0, Lo/eqb;->f:Lo/epz;

    invoke-direct {v0, v1, p2, v2}, Lo/epy;-><init>(Ljava/util/List;Landroid/content/Context;Lo/epz;)V

    iput-object v0, p0, Lo/eqb;->c:Lo/epy;

    .line 137
    iget-object v0, p0, Lo/eqb;->f:Lo/epz;

    invoke-virtual {v0, v7}, Lo/epz;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 138
    iget-object v0, p0, Lo/eqb;->f:Lo/epz;

    iget-object v1, p0, Lo/eqb;->c:Lo/epy;

    invoke-virtual {v0, v1}, Lo/epz;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 140
    new-instance v8, Lo/eqc;

    iget-object v0, p0, Lo/eqb;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v8, v0}, Lo/eqc;-><init>(I)V

    .line 143
    invoke-static {p2}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 144
    iget-object v0, p0, Lo/eqb;->f:Lo/epz;

    invoke-virtual {v8, v0}, Lo/eqc;->attachToRecyclerView(Landroid/support/v7/widget/RecyclerView;)V

    .line 147
    :cond_0
    new-instance v0, Lo/eqg;

    iget-object v1, p0, Lo/eqb;->c:Lo/epy;

    iget-object v2, p0, Lo/eqb;->f:Lo/epz;

    invoke-direct {v0, v1, v2}, Lo/eqg;-><init>(Lo/epy;Lo/epz;)V

    iput-object v0, p0, Lo/eqb;->l:Lo/eqg;

    .line 148
    new-instance v0, Landroid/support/v7/widget/helper/ItemTouchHelper;

    iget-object v1, p0, Lo/eqb;->l:Lo/eqg;

    invoke-direct {v0, v1}, Landroid/support/v7/widget/helper/ItemTouchHelper;-><init>(Landroid/support/v7/widget/helper/ItemTouchHelper$Callback;)V

    iput-object v0, p0, Lo/eqb;->o:Landroid/support/v7/widget/helper/ItemTouchHelper;

    .line 149
    iget-object v0, p0, Lo/eqb;->o:Landroid/support/v7/widget/helper/ItemTouchHelper;

    iget-object v1, p0, Lo/eqb;->f:Lo/epz;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/helper/ItemTouchHelper;->attachToRecyclerView(Landroid/support/v7/widget/RecyclerView;)V

    .line 151
    iget-object v0, p0, Lo/eqb;->f:Lo/epz;

    new-instance v1, Lo/eqe;

    iget-object v2, p0, Lo/eqb;->c:Lo/epy;

    iget-object v3, p0, Lo/eqb;->d:Ljava/util/List;

    .line 152
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    iget-object v6, p0, Lo/eqb;->g:Landroid/widget/LinearLayout;

    move-object v3, p2

    move-object v4, v8

    invoke-direct/range {v1 .. v6}, Lo/eqe;-><init>(Lo/epy;Landroid/content/Context;Lo/eqc;ILandroid/widget/LinearLayout;)V

    .line 151
    invoke-virtual {v0, v1}, Lo/epz;->setOnScrollListener(Landroid/support/v7/widget/RecyclerView$OnScrollListener;)V

    .line 153
    return-void
.end method

.method static synthetic a(Lo/eqb;)Landroid/content/Context;
    .locals 1

    .line 46
    iget-object v0, p0, Lo/eqb;->u:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic b(Lo/eqb;)Landroid/content/Context;
    .locals 1

    .line 46
    iget-object v0, p0, Lo/eqb;->u:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic c(Lo/eqb;)Landroid/content/Context;
    .locals 1

    .line 46
    iget-object v0, p0, Lo/eqb;->u:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic d(Lo/eqb;)Landroid/content/Context;
    .locals 1

    .line 46
    iget-object v0, p0, Lo/eqb;->u:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic e(Lo/eqb;)Landroid/content/Context;
    .locals 1

    .line 46
    iget-object v0, p0, Lo/eqb;->u:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic f(Lo/eqb;)Z
    .locals 1

    .line 46
    iget-boolean v0, p0, Lo/eqb;->m:Z

    return v0
.end method

.method private g()V
    .locals 3

    .line 576
    iget-object v0, p0, Lo/eqb;->g:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/homehealth/R$id;->function_set_navigation_spot_second:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/ImageView;

    .line 579
    iget-object v0, p0, Lo/eqb;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x6

    if-gt v0, v1, :cond_0

    .line 580
    const/16 v0, 0x8

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 582
    :cond_0
    return-void
.end method

.method static synthetic g(Lo/eqb;)Z
    .locals 1

    .line 46
    iget-boolean v0, p0, Lo/eqb;->p:Z

    return v0
.end method

.method static synthetic h(Lo/eqb;)Landroid/content/Context;
    .locals 1

    .line 46
    iget-object v0, p0, Lo/eqb;->u:Landroid/content/Context;

    return-object v0
.end method

.method private k()V
    .locals 24

    .line 341
    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 342
    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 344
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqb;->u:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->v(Landroid/content/Context;)Z

    move-result v0

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lo/eqb;->m:Z

    .line 345
    invoke-static {}, Lo/dbf;->f()Z

    move-result v0

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lo/eqb;->p:Z

    .line 347
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 350
    const/4 v4, 0x0

    .line 351
    const/4 v5, 0x1

    .line 352
    const/4 v6, 0x2

    .line 353
    const/4 v7, 0x3

    .line 354
    const/4 v8, 0x4

    .line 355
    const/4 v9, 0x5

    .line 356
    const/4 v10, 0x6

    goto :goto_0

    .line 358
    :cond_0
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/eqb;->m:Z

    if-nez v0, :cond_1

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/eqb;->p:Z

    if-nez v0, :cond_1

    .line 359
    const/4 v4, 0x0

    .line 360
    const/4 v5, 0x1

    .line 361
    const/4 v6, 0x2

    .line 362
    const/4 v7, 0x3

    .line 363
    const/4 v10, 0x4

    goto :goto_0

    .line 366
    :cond_1
    const/4 v4, 0x0

    .line 367
    const/4 v5, 0x1

    .line 368
    const/4 v7, 0x2

    .line 369
    const/4 v10, 0x3

    .line 372
    :goto_0
    const-string v11, ""

    const-string v12, ""

    const-string v13, ""

    const-string v14, ""

    .line 373
    const-string v15, ""

    const-string v16, ""

    const-string v17, ""

    .line 376
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqb;->u:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lo/eqq$c;->t:Lo/eqq$c;

    invoke-virtual {v2}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 377
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqb;->u:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lo/eqq$c;->q:Lo/eqq$c;

    invoke-virtual {v2}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 378
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/eqb;->m:Z

    if-nez v0, :cond_3

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/eqb;->p:Z

    if-nez v0, :cond_3

    .line 379
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqb;->u:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lo/eqq$c;->y:Lo/eqq$c;

    invoke-virtual {v2}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 381
    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqb;->u:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lo/eqq$c;->w:Lo/eqq$c;

    invoke-virtual {v2}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 382
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_4

    .line 384
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqb;->u:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lo/eqq$c;->s:Lo/eqq$c;

    invoke-virtual {v2}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 385
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqb;->u:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lo/eqq$c;->r:Lo/eqq$c;

    invoke-virtual {v2}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 387
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqb;->u:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lo/eqq$c;->z:Lo/eqq$c;

    invoke-virtual {v2}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    .line 388
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, ""

    .line 389
    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, ""

    .line 390
    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, ""

    .line 391
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, ""

    .line 392
    invoke-virtual {v14, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, ""

    .line 393
    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, ""

    .line 394
    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, ""

    .line 395
    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 396
    :cond_5
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, ""

    .line 397
    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, ""

    .line 398
    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, ""

    .line 399
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, ""

    .line 400
    invoke-virtual {v14, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, ""

    .line 401
    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 402
    :cond_6
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_c

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/eqb;->m:Z

    if-nez v0, :cond_7

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/eqb;->p:Z

    if-eqz v0, :cond_c

    :cond_7
    const-string v0, ""

    .line 404
    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    const-string v0, ""

    .line 405
    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    const-string v0, ""

    .line 406
    invoke-virtual {v14, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    const-string v0, ""

    .line 407
    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    .line 408
    :cond_8
    new-instance v0, Lo/epx$d;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqb;->u:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_sleep:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/epx$d;-><init>(Ljava/lang/String;)V

    sget-object v1, Lo/eqa;->a:Lo/eqa;

    .line 409
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Lo/eqa;)Lo/epx$d;

    move-result-object v0

    sget-object v1, Lo/epx$c;->b:Lo/epx$c;

    .line 410
    invoke-virtual {v0, v1}, Lo/epx$d;->c(Lo/epx$c;)Lo/epx$d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqb;->u:Landroid/content/Context;

    .line 411
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_sleep_description:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/epx$d;->d(Ljava/lang/String;)Lo/epx$d;

    move-result-object v0

    .line 412
    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Lo/epx$d;->a(I)Lo/epx$d;

    move-result-object v0

    .line 413
    invoke-static {v11}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/epx$d;->c(I)Lo/epx$d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqb;->u:Landroid/content/Context;

    .line 414
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Landroid/content/Context;)Lo/epx$d;

    move-result-object v0

    .line 415
    invoke-virtual {v0}, Lo/epx$d;->d()Lo/epx;

    move-result-object v18

    .line 417
    new-instance v0, Lo/epx$d;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqb;->u:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_weight:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/epx$d;-><init>(Ljava/lang/String;)V

    sget-object v1, Lo/eqa;->c:Lo/eqa;

    .line 418
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Lo/eqa;)Lo/epx$d;

    move-result-object v0

    sget-object v1, Lo/epx$c;->b:Lo/epx$c;

    .line 419
    invoke-virtual {v0, v1}, Lo/epx$d;->c(Lo/epx$c;)Lo/epx$d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqb;->u:Landroid/content/Context;

    .line 420
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_weight_description:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/epx$d;->d(Ljava/lang/String;)Lo/epx$d;

    move-result-object v0

    .line 421
    const/16 v1, 0x65

    invoke-virtual {v0, v1}, Lo/epx$d;->a(I)Lo/epx$d;

    move-result-object v0

    .line 422
    invoke-static {v12}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/epx$d;->c(I)Lo/epx$d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqb;->u:Landroid/content/Context;

    .line 423
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Landroid/content/Context;)Lo/epx$d;

    move-result-object v0

    .line 424
    invoke-virtual {v0}, Lo/epx$d;->d()Lo/epx;

    move-result-object v19

    .line 425
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_9

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/eqb;->m:Z

    if-nez v0, :cond_a

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/eqb;->p:Z

    if-nez v0, :cond_a

    .line 426
    :cond_9
    new-instance v0, Lo/epx$d;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqb;->u:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_settings_one_level_menu_settings_item_text_id14:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/epx$d;-><init>(Ljava/lang/String;)V

    sget-object v1, Lo/eqa;->b:Lo/eqa;

    .line 427
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Lo/eqa;)Lo/epx$d;

    move-result-object v0

    sget-object v1, Lo/epx$c;->b:Lo/epx$c;

    .line 428
    invoke-virtual {v0, v1}, Lo/epx$d;->c(Lo/epx$c;)Lo/epx$d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqb;->u:Landroid/content/Context;

    .line 429
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_card_stress:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/epx$d;->d(Ljava/lang/String;)Lo/epx$d;

    move-result-object v0

    .line 430
    const/16 v1, 0x66

    invoke-virtual {v0, v1}, Lo/epx$d;->a(I)Lo/epx$d;

    move-result-object v0

    .line 431
    invoke-static {v13}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/epx$d;->c(I)Lo/epx$d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqb;->u:Landroid/content/Context;

    .line 432
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Landroid/content/Context;)Lo/epx$d;

    move-result-object v0

    .line 433
    invoke-virtual {v0}, Lo/epx$d;->d()Lo/epx;

    move-result-object v20

    .line 435
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqb;->d:Ljava/util/List;

    move-object/from16 v1, v20

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 437
    :cond_a
    new-instance v0, Lo/epx$d;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqb;->u:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_health_show_healthdata_heart_bmp:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/epx$d;-><init>(Ljava/lang/String;)V

    sget-object v1, Lo/eqa;->d:Lo/eqa;

    .line 438
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Lo/eqa;)Lo/epx$d;

    move-result-object v0

    sget-object v1, Lo/epx$c;->b:Lo/epx$c;

    .line 439
    invoke-virtual {v0, v1}, Lo/epx$d;->c(Lo/epx$c;)Lo/epx$d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqb;->u:Landroid/content/Context;

    .line 440
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_health_show_healthdata_heart_description:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/epx$d;->d(Ljava/lang/String;)Lo/epx$d;

    move-result-object v0

    .line 441
    const/16 v1, 0x67

    invoke-virtual {v0, v1}, Lo/epx$d;->a(I)Lo/epx$d;

    move-result-object v0

    .line 442
    invoke-static {v14}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/epx$d;->c(I)Lo/epx$d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqb;->u:Landroid/content/Context;

    .line 443
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Landroid/content/Context;)Lo/epx$d;

    move-result-object v0

    .line 444
    invoke-virtual {v0}, Lo/epx$d;->d()Lo/epx;

    move-result-object v20

    .line 447
    new-instance v0, Lo/epx$d;

    const-string v1, ""

    invoke-direct {v0, v1}, Lo/epx$d;-><init>(Ljava/lang/String;)V

    sget-object v1, Lo/eqa;->f:Lo/eqa;

    .line 448
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Lo/eqa;)Lo/epx$d;

    move-result-object v0

    sget-object v1, Lo/epx$c;->c:Lo/epx$c;

    .line 449
    invoke-virtual {v0, v1}, Lo/epx$d;->c(Lo/epx$c;)Lo/epx$d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqb;->u:Landroid/content/Context;

    .line 450
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_card_management:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/epx$d;->d(Ljava/lang/String;)Lo/epx$d;

    move-result-object v0

    .line 451
    const/16 v1, 0x6a

    invoke-virtual {v0, v1}, Lo/epx$d;->a(I)Lo/epx$d;

    move-result-object v0

    .line 452
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/epx$d;->c(I)Lo/epx$d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqb;->u:Landroid/content/Context;

    .line 453
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Landroid/content/Context;)Lo/epx$d;

    move-result-object v0

    .line 454
    invoke-virtual {v0}, Lo/epx$d;->d()Lo/epx;

    move-result-object v21

    .line 456
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqb;->d:Ljava/util/List;

    move-object/from16 v1, v18

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 457
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqb;->d:Ljava/util/List;

    move-object/from16 v1, v19

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 458
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqb;->d:Ljava/util/List;

    move-object/from16 v1, v20

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 459
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_b

    .line 461
    new-instance v0, Lo/epx$d;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqb;->u:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_bloodpressure:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/epx$d;-><init>(Ljava/lang/String;)V

    sget-object v1, Lo/eqa;->h:Lo/eqa;

    .line 462
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Lo/eqa;)Lo/epx$d;

    move-result-object v0

    sget-object v1, Lo/epx$c;->b:Lo/epx$c;

    .line 463
    invoke-virtual {v0, v1}, Lo/epx$d;->c(Lo/epx$c;)Lo/epx$d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqb;->u:Landroid/content/Context;

    .line 464
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_bloodpressure_description:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/epx$d;->d(Ljava/lang/String;)Lo/epx$d;

    move-result-object v0

    .line 465
    const/16 v1, 0x68

    invoke-virtual {v0, v1}, Lo/epx$d;->a(I)Lo/epx$d;

    move-result-object v0

    .line 466
    invoke-static {v15}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/epx$d;->c(I)Lo/epx$d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqb;->u:Landroid/content/Context;

    .line 467
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Landroid/content/Context;)Lo/epx$d;

    move-result-object v0

    .line 468
    invoke-virtual {v0}, Lo/epx$d;->d()Lo/epx;

    move-result-object v22

    .line 470
    new-instance v0, Lo/epx$d;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqb;->u:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_bloodsugar:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/epx$d;-><init>(Ljava/lang/String;)V

    sget-object v1, Lo/eqa;->i:Lo/eqa;

    .line 471
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Lo/eqa;)Lo/epx$d;

    move-result-object v0

    sget-object v1, Lo/epx$c;->b:Lo/epx$c;

    .line 472
    invoke-virtual {v0, v1}, Lo/epx$d;->c(Lo/epx$c;)Lo/epx$d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqb;->u:Landroid/content/Context;

    .line 473
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_bloodsugar_description:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/epx$d;->d(Ljava/lang/String;)Lo/epx$d;

    move-result-object v0

    .line 474
    const/16 v1, 0x69

    invoke-virtual {v0, v1}, Lo/epx$d;->a(I)Lo/epx$d;

    move-result-object v0

    .line 475
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/epx$d;->c(I)Lo/epx$d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqb;->u:Landroid/content/Context;

    .line 476
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Landroid/content/Context;)Lo/epx$d;

    move-result-object v0

    .line 477
    invoke-virtual {v0}, Lo/epx$d;->d()Lo/epx;

    move-result-object v23

    .line 479
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqb;->d:Ljava/util/List;

    move-object/from16 v1, v22

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 480
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqb;->d:Ljava/util/List;

    move-object/from16 v1, v23

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 482
    :cond_b
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqb;->d:Ljava/util/List;

    move-object/from16 v1, v21

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 484
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqb;->d:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 485
    goto/16 :goto_1

    .line 487
    :cond_c
    new-instance v0, Lo/epx$d;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqb;->u:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_sleep:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/epx$d;-><init>(Ljava/lang/String;)V

    sget-object v1, Lo/eqa;->a:Lo/eqa;

    .line 488
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Lo/eqa;)Lo/epx$d;

    move-result-object v0

    sget-object v1, Lo/epx$c;->b:Lo/epx$c;

    .line 489
    invoke-virtual {v0, v1}, Lo/epx$d;->c(Lo/epx$c;)Lo/epx$d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqb;->u:Landroid/content/Context;

    .line 490
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_sleep_description:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/epx$d;->d(Ljava/lang/String;)Lo/epx$d;

    move-result-object v0

    .line 491
    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Lo/epx$d;->a(I)Lo/epx$d;

    move-result-object v0

    .line 492
    invoke-virtual {v0, v4}, Lo/epx$d;->c(I)Lo/epx$d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqb;->u:Landroid/content/Context;

    .line 493
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Landroid/content/Context;)Lo/epx$d;

    move-result-object v0

    .line 494
    invoke-virtual {v0}, Lo/epx$d;->d()Lo/epx;

    move-result-object v18

    .line 496
    new-instance v0, Lo/epx$d;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqb;->u:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_weight:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/epx$d;-><init>(Ljava/lang/String;)V

    sget-object v1, Lo/eqa;->c:Lo/eqa;

    .line 497
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Lo/eqa;)Lo/epx$d;

    move-result-object v0

    sget-object v1, Lo/epx$c;->b:Lo/epx$c;

    .line 498
    invoke-virtual {v0, v1}, Lo/epx$d;->c(Lo/epx$c;)Lo/epx$d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqb;->u:Landroid/content/Context;

    .line 499
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_weight_description:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/epx$d;->d(Ljava/lang/String;)Lo/epx$d;

    move-result-object v0

    .line 500
    const/16 v1, 0x65

    invoke-virtual {v0, v1}, Lo/epx$d;->a(I)Lo/epx$d;

    move-result-object v0

    .line 501
    invoke-virtual {v0, v5}, Lo/epx$d;->c(I)Lo/epx$d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqb;->u:Landroid/content/Context;

    .line 502
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Landroid/content/Context;)Lo/epx$d;

    move-result-object v0

    .line 503
    invoke-virtual {v0}, Lo/epx$d;->d()Lo/epx;

    move-result-object v19

    .line 504
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_d

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/eqb;->m:Z

    if-nez v0, :cond_e

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/eqb;->p:Z

    if-nez v0, :cond_e

    .line 505
    :cond_d
    new-instance v0, Lo/epx$d;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqb;->u:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_settings_one_level_menu_settings_item_text_id14:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/epx$d;-><init>(Ljava/lang/String;)V

    sget-object v1, Lo/eqa;->b:Lo/eqa;

    .line 506
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Lo/eqa;)Lo/epx$d;

    move-result-object v0

    sget-object v1, Lo/epx$c;->b:Lo/epx$c;

    .line 507
    invoke-virtual {v0, v1}, Lo/epx$d;->c(Lo/epx$c;)Lo/epx$d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqb;->u:Landroid/content/Context;

    .line 508
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_card_stress:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/epx$d;->d(Ljava/lang/String;)Lo/epx$d;

    move-result-object v0

    .line 509
    const/16 v1, 0x66

    invoke-virtual {v0, v1}, Lo/epx$d;->a(I)Lo/epx$d;

    move-result-object v0

    .line 510
    invoke-virtual {v0, v6}, Lo/epx$d;->c(I)Lo/epx$d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqb;->u:Landroid/content/Context;

    .line 511
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Landroid/content/Context;)Lo/epx$d;

    move-result-object v0

    .line 512
    invoke-virtual {v0}, Lo/epx$d;->d()Lo/epx;

    move-result-object v20

    .line 513
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqb;->u:Landroid/content/Context;

    sget-object v1, Lo/eqq$c;->y:Lo/eqq$c;

    invoke-virtual {v1}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v20

    invoke-virtual {v2, v0, v1, v6}, Lo/epx;->b(Landroid/content/Context;Ljava/lang/String;I)V

    .line 514
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqb;->d:Ljava/util/List;

    move-object/from16 v1, v20

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 516
    :cond_e
    new-instance v0, Lo/epx$d;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqb;->u:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_health_show_healthdata_heart_bmp:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/epx$d;-><init>(Ljava/lang/String;)V

    sget-object v1, Lo/eqa;->d:Lo/eqa;

    .line 517
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Lo/eqa;)Lo/epx$d;

    move-result-object v0

    sget-object v1, Lo/epx$c;->b:Lo/epx$c;

    .line 518
    invoke-virtual {v0, v1}, Lo/epx$d;->c(Lo/epx$c;)Lo/epx$d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqb;->u:Landroid/content/Context;

    .line 519
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_health_show_healthdata_heart_description:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/epx$d;->d(Ljava/lang/String;)Lo/epx$d;

    move-result-object v0

    .line 520
    const/16 v1, 0x67

    invoke-virtual {v0, v1}, Lo/epx$d;->a(I)Lo/epx$d;

    move-result-object v0

    .line 521
    invoke-virtual {v0, v7}, Lo/epx$d;->c(I)Lo/epx$d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqb;->u:Landroid/content/Context;

    .line 522
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Landroid/content/Context;)Lo/epx$d;

    move-result-object v0

    .line 523
    invoke-virtual {v0}, Lo/epx$d;->d()Lo/epx;

    move-result-object v20

    .line 526
    new-instance v0, Lo/epx$d;

    const-string v1, ""

    invoke-direct {v0, v1}, Lo/epx$d;-><init>(Ljava/lang/String;)V

    sget-object v1, Lo/eqa;->f:Lo/eqa;

    .line 527
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Lo/eqa;)Lo/epx$d;

    move-result-object v0

    sget-object v1, Lo/epx$c;->c:Lo/epx$c;

    .line 528
    invoke-virtual {v0, v1}, Lo/epx$d;->c(Lo/epx$c;)Lo/epx$d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqb;->u:Landroid/content/Context;

    .line 529
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_card_management:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/epx$d;->d(Ljava/lang/String;)Lo/epx$d;

    move-result-object v0

    .line 530
    const/16 v1, 0x6a

    invoke-virtual {v0, v1}, Lo/epx$d;->a(I)Lo/epx$d;

    move-result-object v0

    .line 531
    invoke-virtual {v0, v10}, Lo/epx$d;->c(I)Lo/epx$d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqb;->u:Landroid/content/Context;

    .line 532
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Landroid/content/Context;)Lo/epx$d;

    move-result-object v0

    .line 533
    invoke-virtual {v0}, Lo/epx$d;->d()Lo/epx;

    move-result-object v21

    .line 536
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqb;->u:Landroid/content/Context;

    sget-object v1, Lo/eqq$c;->t:Lo/eqq$c;

    invoke-virtual {v1}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v18

    invoke-virtual {v2, v0, v1, v4}, Lo/epx;->b(Landroid/content/Context;Ljava/lang/String;I)V

    .line 537
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqb;->u:Landroid/content/Context;

    sget-object v1, Lo/eqq$c;->q:Lo/eqq$c;

    invoke-virtual {v1}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v19

    invoke-virtual {v2, v0, v1, v5}, Lo/epx;->b(Landroid/content/Context;Ljava/lang/String;I)V

    .line 538
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqb;->u:Landroid/content/Context;

    sget-object v1, Lo/eqq$c;->w:Lo/eqq$c;

    invoke-virtual {v1}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v20

    invoke-virtual {v2, v0, v1, v7}, Lo/epx;->b(Landroid/content/Context;Ljava/lang/String;I)V

    .line 539
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqb;->u:Landroid/content/Context;

    sget-object v1, Lo/eqq$c;->z:Lo/eqq$c;

    invoke-virtual {v1}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v21

    invoke-virtual {v2, v0, v1, v10}, Lo/epx;->b(Landroid/content/Context;Ljava/lang/String;I)V

    .line 541
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqb;->d:Ljava/util/List;

    move-object/from16 v1, v18

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 542
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqb;->d:Ljava/util/List;

    move-object/from16 v1, v19

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 544
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqb;->d:Ljava/util/List;

    move-object/from16 v1, v20

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 545
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_f

    .line 546
    new-instance v0, Lo/epx$d;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqb;->u:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_bloodpressure:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/epx$d;-><init>(Ljava/lang/String;)V

    sget-object v1, Lo/eqa;->h:Lo/eqa;

    .line 547
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Lo/eqa;)Lo/epx$d;

    move-result-object v0

    sget-object v1, Lo/epx$c;->b:Lo/epx$c;

    .line 548
    invoke-virtual {v0, v1}, Lo/epx$d;->c(Lo/epx$c;)Lo/epx$d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqb;->u:Landroid/content/Context;

    .line 549
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_bloodpressure_description:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/epx$d;->d(Ljava/lang/String;)Lo/epx$d;

    move-result-object v0

    .line 550
    const/16 v1, 0x68

    invoke-virtual {v0, v1}, Lo/epx$d;->a(I)Lo/epx$d;

    move-result-object v0

    .line 551
    invoke-virtual {v0, v8}, Lo/epx$d;->c(I)Lo/epx$d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqb;->u:Landroid/content/Context;

    .line 552
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Landroid/content/Context;)Lo/epx$d;

    move-result-object v0

    .line 553
    invoke-virtual {v0}, Lo/epx$d;->d()Lo/epx;

    move-result-object v22

    .line 555
    new-instance v0, Lo/epx$d;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqb;->u:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_bloodsugar:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/epx$d;-><init>(Ljava/lang/String;)V

    sget-object v1, Lo/eqa;->i:Lo/eqa;

    .line 556
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Lo/eqa;)Lo/epx$d;

    move-result-object v0

    sget-object v1, Lo/epx$c;->b:Lo/epx$c;

    .line 557
    invoke-virtual {v0, v1}, Lo/epx$d;->c(Lo/epx$c;)Lo/epx$d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqb;->u:Landroid/content/Context;

    .line 558
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_bloodsugar_description:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/epx$d;->d(Ljava/lang/String;)Lo/epx$d;

    move-result-object v0

    .line 559
    const/16 v1, 0x69

    invoke-virtual {v0, v1}, Lo/epx$d;->a(I)Lo/epx$d;

    move-result-object v0

    .line 560
    invoke-virtual {v0, v9}, Lo/epx$d;->c(I)Lo/epx$d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eqb;->u:Landroid/content/Context;

    .line 561
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Landroid/content/Context;)Lo/epx$d;

    move-result-object v0

    .line 562
    invoke-virtual {v0}, Lo/epx$d;->d()Lo/epx;

    move-result-object v23

    .line 564
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqb;->u:Landroid/content/Context;

    sget-object v1, Lo/eqq$c;->s:Lo/eqq$c;

    invoke-virtual {v1}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v22

    invoke-virtual {v2, v0, v1, v8}, Lo/epx;->b(Landroid/content/Context;Ljava/lang/String;I)V

    .line 565
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqb;->u:Landroid/content/Context;

    sget-object v1, Lo/eqq$c;->r:Lo/eqq$c;

    invoke-virtual {v1}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v23

    invoke-virtual {v2, v0, v1, v9}, Lo/epx;->b(Landroid/content/Context;Ljava/lang/String;I)V

    .line 567
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqb;->d:Ljava/util/List;

    move-object/from16 v1, v22

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 568
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqb;->d:Ljava/util/List;

    move-object/from16 v1, v23

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 570
    :cond_f
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqb;->d:Ljava/util/List;

    move-object/from16 v1, v21

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 571
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eqb;->d:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 573
    :goto_1
    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 203
    const-string v0, "FunctionSetCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readCardData called"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    new-instance v0, Lo/eqj;

    iget-object v1, p0, Lo/eqb;->u:Landroid/content/Context;

    iget-object v2, p0, Lo/eqb;->c:Lo/epy;

    iget-object v3, p0, Lo/eqb;->d:Ljava/util/List;

    invoke-direct {v0, v1, v2, v3}, Lo/eqj;-><init>(Landroid/content/Context;Lo/epy;Ljava/util/List;)V

    invoke-virtual {v0}, Lo/eqj;->b()Lo/eqj;

    move-result-object v0

    iput-object v0, p0, Lo/eqb;->e:Lo/eqj;

    .line 205
    new-instance v0, Lo/eqk;

    iget-object v1, p0, Lo/eqb;->u:Landroid/content/Context;

    iget-object v2, p0, Lo/eqb;->c:Lo/epy;

    iget-object v3, p0, Lo/eqb;->d:Ljava/util/List;

    invoke-direct {v0, v1, v2, v3}, Lo/eqk;-><init>(Landroid/content/Context;Lo/epy;Ljava/util/List;)V

    invoke-virtual {v0}, Lo/eqk;->b()Lo/eqk;

    move-result-object v0

    iput-object v0, p0, Lo/eqb;->a:Lo/eqk;

    .line 206
    new-instance v0, Lo/eqm;

    iget-object v1, p0, Lo/eqb;->u:Landroid/content/Context;

    iget-object v2, p0, Lo/eqb;->c:Lo/epy;

    iget-object v3, p0, Lo/eqb;->d:Ljava/util/List;

    invoke-direct {v0, v1, v2, v3}, Lo/eqm;-><init>(Landroid/content/Context;Lo/epy;Ljava/util/List;)V

    invoke-virtual {v0}, Lo/eqm;->a()Lo/eqm;

    move-result-object v0

    iput-object v0, p0, Lo/eqb;->b:Lo/eqm;

    .line 207
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 209
    new-instance v0, Lo/eqh;

    iget-object v1, p0, Lo/eqb;->u:Landroid/content/Context;

    iget-object v2, p0, Lo/eqb;->c:Lo/epy;

    iget-object v3, p0, Lo/eqb;->d:Ljava/util/List;

    invoke-direct {v0, v1, v2, v3}, Lo/eqh;-><init>(Landroid/content/Context;Lo/epy;Ljava/util/List;)V

    invoke-virtual {v0}, Lo/eqh;->a()Lo/eqh;

    move-result-object v0

    iput-object v0, p0, Lo/eqb;->k:Lo/eqh;

    .line 210
    new-instance v0, Lo/eqd;

    iget-object v1, p0, Lo/eqb;->u:Landroid/content/Context;

    iget-object v2, p0, Lo/eqb;->c:Lo/epy;

    iget-object v3, p0, Lo/eqb;->d:Ljava/util/List;

    invoke-direct {v0, v1, v2, v3}, Lo/eqd;-><init>(Landroid/content/Context;Lo/epy;Ljava/util/List;)V

    invoke-virtual {v0}, Lo/eqd;->b()Lo/eqd;

    move-result-object v0

    iput-object v0, p0, Lo/eqb;->h:Lo/eqd;

    .line 213
    :cond_0
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lo/eqb;->m:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lo/eqb;->p:Z

    if-nez v0, :cond_2

    .line 214
    :cond_1
    new-instance v0, Lo/eql;

    iget-object v1, p0, Lo/eqb;->u:Landroid/content/Context;

    iget-object v2, p0, Lo/eqb;->c:Lo/epy;

    iget-object v3, p0, Lo/eqb;->d:Ljava/util/List;

    invoke-direct {v0, v1, v2, v3}, Lo/eql;-><init>(Landroid/content/Context;Lo/epy;Ljava/util/List;)V

    invoke-virtual {v0}, Lo/eql;->c()Lo/eql;

    move-result-object v0

    iput-object v0, p0, Lo/eqb;->i:Lo/eql;

    .line 216
    :cond_2
    return-void
.end method

.method public b()V
    .locals 2

    .line 251
    iget-object v0, p0, Lo/eqb;->o:Landroid/support/v7/widget/helper/ItemTouchHelper;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 252
    iget-object v0, p0, Lo/eqb;->o:Landroid/support/v7/widget/helper/ItemTouchHelper;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/helper/ItemTouchHelper;->attachToRecyclerView(Landroid/support/v7/widget/RecyclerView;)V

    .line 253
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eqb;->o:Landroid/support/v7/widget/helper/ItemTouchHelper;

    .line 256
    :cond_0
    iget-object v0, p0, Lo/eqb;->f:Lo/epz;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 257
    iget-object v0, p0, Lo/eqb;->f:Lo/epz;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/epz;->setOnScrollListener(Landroid/support/v7/widget/RecyclerView$OnScrollListener;)V

    .line 258
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eqb;->f:Lo/epz;

    .line 261
    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eqb;->k:Lo/eqh;

    .line 262
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eqb;->h:Lo/eqd;

    .line 263
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eqb;->b:Lo/eqm;

    .line 264
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eqb;->e:Lo/eqj;

    .line 265
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eqb;->l:Lo/eqg;

    .line 266
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eqb;->a:Lo/eqk;

    .line 268
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eqb;->c:Lo/epy;

    .line 269
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eqb;->g:Landroid/widget/LinearLayout;

    .line 270
    iget-object v0, p0, Lo/eqb;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 271
    return-void
.end method

.method public c()V
    .locals 5

    .line 187
    iget-object v0, p0, Lo/eqb;->n:Landroid/content/BroadcastReceiver;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 189
    :try_start_0
    iget-object v0, p0, Lo/eqb;->u:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v4

    .line 190
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 191
    iget-object v0, p0, Lo/eqb;->n:Landroid/content/BroadcastReceiver;

    invoke-virtual {v4, v0}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 192
    const-string v0, "FunctionSetCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHiBroadcasetReceiver unregister"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 194
    :cond_0
    const-string v0, "FunctionSetCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHiBroadcasetReceiver unregister fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 198
    :goto_0
    goto :goto_1

    .line 196
    :catch_0
    move-exception v4

    .line 197
    const-string v0, "FunctionSetCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IllegalArgumentException  mHiBroadcasetReceiver unregister"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 200
    :cond_1
    :goto_1
    return-void
.end method

.method public d()V
    .locals 4

    .line 219
    const-string v0, "FunctionSetCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unSubscribeCardData called"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 220
    iget-object v0, p0, Lo/eqb;->e:Lo/eqj;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 221
    iget-object v0, p0, Lo/eqb;->e:Lo/eqj;

    invoke-virtual {v0}, Lo/eqj;->e()V

    .line 224
    :cond_0
    iget-object v0, p0, Lo/eqb;->a:Lo/eqk;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 225
    iget-object v0, p0, Lo/eqb;->a:Lo/eqk;

    invoke-virtual {v0}, Lo/eqk;->a()V

    .line 228
    :cond_1
    iget-object v0, p0, Lo/eqb;->b:Lo/eqm;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 229
    iget-object v0, p0, Lo/eqb;->b:Lo/eqm;

    invoke-virtual {v0}, Lo/eqm;->c()V

    .line 232
    :cond_2
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_4

    .line 234
    iget-object v0, p0, Lo/eqb;->k:Lo/eqh;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 235
    iget-object v0, p0, Lo/eqb;->k:Lo/eqh;

    invoke-virtual {v0}, Lo/eqh;->b()V

    .line 238
    :cond_3
    iget-object v0, p0, Lo/eqb;->h:Lo/eqd;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 239
    iget-object v0, p0, Lo/eqb;->h:Lo/eqd;

    invoke-virtual {v0}, Lo/eqd;->c()V

    .line 243
    :cond_4
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-boolean v0, p0, Lo/eqb;->m:Z

    if-nez v0, :cond_6

    iget-boolean v0, p0, Lo/eqb;->p:Z

    if-nez v0, :cond_6

    .line 244
    :cond_5
    iget-object v0, p0, Lo/eqb;->i:Lo/eql;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 245
    iget-object v0, p0, Lo/eqb;->i:Lo/eql;

    invoke-virtual {v0}, Lo/eql;->e()V

    .line 248
    :cond_6
    return-void
.end method

.method public e()V
    .locals 6

    .line 175
    iget-object v0, p0, Lo/eqb;->u:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v4

    .line 176
    new-instance v5, Landroid/content/IntentFilter;

    invoke-direct {v5}, Landroid/content/IntentFilter;-><init>()V

    .line 177
    const-string v0, "com.huawei.hihealth.action_data_refresh"

    invoke-virtual {v5, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 178
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 179
    iget-object v0, p0, Lo/eqb;->n:Landroid/content/BroadcastReceiver;

    invoke-virtual {v4, v0, v5}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 180
    const-string v0, "FunctionSetCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHiBroadcasetReceiver  registe success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 182
    :cond_0
    const-string v0, "FunctionSetCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHiBroadcasetReceiver  registe fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    :goto_0
    return-void
.end method

.method public i()V
    .locals 6

    .line 274
    const-string v0, "FunctionSetCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshList called"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 275
    iget-object v0, p0, Lo/eqb;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/epx;

    .line 276
    invoke-virtual {v5}, Lo/epx;->f()V

    .line 277
    goto :goto_0

    .line 279
    :cond_0
    iget-object v0, p0, Lo/eqb;->e:Lo/eqj;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 280
    iget-object v0, p0, Lo/eqb;->e:Lo/eqj;

    invoke-virtual {v0}, Lo/eqj;->d()V

    .line 283
    :cond_1
    iget-object v0, p0, Lo/eqb;->a:Lo/eqk;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 284
    iget-object v0, p0, Lo/eqb;->a:Lo/eqk;

    invoke-virtual {v0}, Lo/eqk;->d()V

    .line 289
    :cond_2
    iget-object v0, p0, Lo/eqb;->h:Lo/eqd;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 290
    iget-object v0, p0, Lo/eqb;->h:Lo/eqd;

    invoke-virtual {v0}, Lo/eqd;->d()V

    .line 292
    :cond_3
    iget-object v0, p0, Lo/eqb;->k:Lo/eqh;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 293
    iget-object v0, p0, Lo/eqb;->k:Lo/eqh;

    invoke-virtual {v0}, Lo/eqh;->d()V

    .line 295
    :cond_4
    iget-object v0, p0, Lo/eqb;->b:Lo/eqm;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 296
    iget-object v0, p0, Lo/eqb;->b:Lo/eqm;

    invoke-virtual {v0}, Lo/eqm;->d()V

    .line 298
    :cond_5
    iget-object v0, p0, Lo/eqb;->i:Lo/eql;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 299
    iget-object v0, p0, Lo/eqb;->i:Lo/eql;

    invoke-virtual {v0}, Lo/eql;->d()V

    .line 302
    :cond_6
    iget-object v0, p0, Lo/eqb;->d:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 304
    iget-object v0, p0, Lo/eqb;->f:Lo/epz;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    .line 305
    iget-object v0, p0, Lo/eqb;->f:Lo/epz;

    invoke-virtual {v0}, Lo/epz;->getScrollState()I

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, p0, Lo/eqb;->f:Lo/epz;

    .line 306
    invoke-virtual {v0}, Lo/epz;->isComputingLayout()Z

    move-result v0

    if-nez v0, :cond_7

    .line 307
    iget-object v0, p0, Lo/eqb;->f:Lo/epz;

    invoke-virtual {v0}, Lo/epz;->getRecycledViewPool()Landroid/support/v7/widget/RecyclerView$RecycledViewPool;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$RecycledViewPool;->clear()V

    .line 308
    iget-object v0, p0, Lo/eqb;->c:Lo/epy;

    invoke-virtual {v0}, Lo/epy;->notifyDataSetChanged()V

    .line 311
    :cond_7
    return-void
.end method
