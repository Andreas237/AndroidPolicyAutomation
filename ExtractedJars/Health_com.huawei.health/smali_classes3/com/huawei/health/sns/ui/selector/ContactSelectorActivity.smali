.class public Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;
.super Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity$a;
    }
.end annotation


# instance fields
.field private A:Landroid/view/View;

.field protected C:Landroid/widget/LinearLayout;

.field private E:Lo/bio;

.field private F:Z

.field private G:Landroid/widget/TextView;

.field private H:Lo/egd;

.field private I:Lo/egd;

.field private J:Landroid/os/Handler;

.field private K:Landroid/widget/AdapterView$OnItemClickListener;

.field private L:Landroid/widget/TextView;

.field private N:Landroid/view/View;

.field protected j:Lo/bni;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 56
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;-><init>()V

    .line 93
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->F:Z

    .line 108
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->N:Landroid/view/View;

    .line 118
    new-instance v0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity$a;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity$a;-><init>(Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->J:Landroid/os/Handler;

    .line 378
    new-instance v0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity$2;-><init>(Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->K:Landroid/widget/AdapterView$OnItemClickListener;

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;)V
    .locals 0

    .line 56
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->y()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;Landroid/os/Message;)V
    .locals 0

    .line 56
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->b(Landroid/os/Message;)V

    return-void
.end method

.method private a(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;)V"
        }
    .end annotation

    .line 260
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 262
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->b(Z)V

    .line 264
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->G:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 265
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->L:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 267
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->z:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 268
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->y:Lo/bnd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/bnd;->setVisibility(I)V

    .line 269
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->q:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 273
    :cond_1
    iget v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->r:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 275
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->b(Z)V

    .line 277
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->z:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 278
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->y:Lo/bnd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bnd;->setVisibility(I)V

    .line 279
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->q:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 282
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->w:Lo/bjd;

    invoke-virtual {v0, p1}, Lo/bjd;->b(Ljava/util/List;)V

    .line 283
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->w:Lo/bjd;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->v:[J

    invoke-virtual {v0, v1}, Lo/bjd;->e([J)V

    .line 284
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->w:Lo/bjd;

    invoke-virtual {v0}, Lo/bjd;->notifyDataSetChanged()V

    .line 285
    return-void
.end method

.method private b(Landroid/os/Message;)V
    .locals 5

    .line 185
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v3

    .line 186
    if-eqz v3, :cond_1

    .line 188
    const-string v0, "keyContactMatchResult"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v4

    .line 190
    if-nez v4, :cond_0

    .line 193
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->m()V

    goto :goto_0

    .line 197
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->y()V

    .line 198
    const-string v0, "ContactSelectorActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Contact match result is:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 200
    :goto_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->x()V

    .line 202
    :cond_1
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;)V
    .locals 0

    .line 56
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->x()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;)V
    .locals 0

    .line 56
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->w()V

    return-void
.end method

.method private c(Ljava/lang/Object;)V
    .locals 1

    .line 556
    if-nez p1, :cond_0

    .line 558
    return-void

    .line 560
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 561
    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->e(Ljava/lang/String;)V

    .line 562
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;)Landroid/view/View;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->A:Landroid/view/View;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;Landroid/os/Message;)V
    .locals 0

    .line 56
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->e(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;Ljava/lang/Object;)V
    .locals 0

    .line 56
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->c(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;Ljava/util/ArrayList;)V
    .locals 0

    .line 56
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->a(Ljava/util/ArrayList;)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;)Landroid/os/Handler;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->J:Landroid/os/Handler;

    return-object v0
.end method

.method private e(Landroid/os/Message;)V
    .locals 3

    .line 581
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v1

    .line 582
    const/4 v2, 0x0

    .line 583
    if-eqz v1, :cond_1

    .line 585
    const-string v0, "keySearchContactMatchList"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    .line 586
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 588
    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->e(Ljava/util/ArrayList;)V

    goto :goto_0

    .line 592
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->c(Z)V

    .line 595
    :cond_1
    :goto_0
    return-void
.end method

.method private m()V
    .locals 3

    .line 235
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->p()Lo/brd;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->J:Landroid/os/Handler;

    invoke-static {v2}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->d(Landroid/os/Handler;)Lo/brc;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/brb;->b(Lo/brd;Lo/brc;)Lo/bqy;

    .line 236
    return-void
.end method

.method private static p()Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lo/brd<Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;>;"
        }
    .end annotation

    .line 245
    new-instance v0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity$3;

    invoke-direct {v0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity$3;-><init>()V

    return-object v0
.end method

.method private q()V
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi",
            "InflateParams"
        }
    .end annotation

    .line 321
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_contactselector_listview:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->setContentView(I)V

    .line 323
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->a()V

    .line 326
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->t()V

    .line 328
    sget v0, Lcom/huawei/android/sns/R$id;->no_contact_text:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->G:Landroid/widget/TextView;

    .line 329
    sget v0, Lcom/huawei/android/sns/R$id;->no_contact_text_suggest:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->L:Landroid/widget/TextView;

    .line 330
    sget v0, Lcom/huawei/android/sns/R$id;->sns_fast_search_list:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bnd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->y:Lo/bnd;

    .line 331
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->y:Lo/bnd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bnd;->setHasBottomBlank(Z)V

    .line 332
    new-instance v0, Lo/bjh;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    iget v2, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->r:I

    const/4 v3, 0x0

    if-ne v3, v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-direct {v0, v1, v2}, Lo/bjh;-><init>(Landroid/content/Context;Z)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->w:Lo/bjd;

    .line 333
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->y:Lo/bnd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/bnd;->setContact(Z)V

    .line 335
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->y:Lo/bnd;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->w:Lo/bjd;

    invoke-virtual {v0, v1}, Lo/bnd;->setAdapter(Landroid/widget/BaseAdapter;)V

    .line 336
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->y:Lo/bnd;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->K:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {v0, v1}, Lo/bnd;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 337
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "agree_upload_phone_digest_new"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v4

    .line 340
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "isMatchedContact"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v5

    .line 342
    if-nez v4, :cond_2

    .line 345
    if-eqz v5, :cond_1

    .line 347
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->u()V

    goto :goto_1

    .line 352
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->q:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 353
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->y:Lo/bnd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/bnd;->setVisibility(I)V

    .line 354
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->A:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 355
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->b(Z)V

    goto :goto_1

    .line 359
    :cond_2
    if-nez v5, :cond_3

    .line 361
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->q:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 362
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->y:Lo/bnd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/bnd;->setVisibility(I)V

    .line 363
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->A:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 364
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->b(Z)V

    .line 365
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->w()V

    goto :goto_1

    .line 370
    :cond_3
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->u()V

    .line 373
    :goto_1
    return-void
.end method

.method private r()V
    .locals 7

    .line 478
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->C:Landroid/widget/LinearLayout;

    if-nez v0, :cond_0

    .line 480
    return-void

    .line 483
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->C:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 484
    invoke-static {p0}, Lo/bph;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 486
    const/4 v0, 0x0

    iput v0, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 487
    const/4 v0, -0x1

    iput v0, v4, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 488
    const/4 v0, -0x1

    iput v0, v4, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 489
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->C:Landroid/widget/LinearLayout;

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    goto :goto_1

    .line 493
    :cond_1
    invoke-static {p0}, Lo/boi;->d(Landroid/app/Activity;)I

    move-result v5

    .line 494
    int-to-double v0, v5

    const-wide v2, 0x3fd3333333333333L    # 0.3

    mul-double/2addr v0, v2

    double-to-int v0, v0

    .line 495
    invoke-static {p0}, Lo/boi;->i(Landroid/app/Activity;)I

    move-result v1

    sub-int/2addr v0, v1

    invoke-static {p0}, Lo/boi;->k(Landroid/app/Activity;)I

    move-result v1

    sub-int v6, v0, v1

    .line 497
    if-gez v6, :cond_2

    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    move v0, v6

    :goto_0
    move v6, v0

    .line 498
    iput v6, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 499
    const/4 v0, -0x1

    iput v0, v4, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 500
    const/4 v0, -0x2

    iput v0, v4, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 501
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->C:Landroid/widget/LinearLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 503
    :goto_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->C:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 504
    return-void
.end method

.method private s()V
    .locals 2

    .line 470
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->H:Lo/egd;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->I:Lo/egd;

    invoke-static {p0, v0, v1}, Lo/bph;->c(Landroid/app/Activity;Landroid/view/View;Landroid/view/View;)V

    .line 471
    return-void
.end method

.method private t()V
    .locals 3

    .line 410
    sget v0, Lcom/huawei/android/sns/R$id;->page_guide_fragment:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->A:Landroid/view/View;

    .line 411
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->A:Landroid/view/View;

    sget v1, Lcom/huawei/android/sns/R$id;->content_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->C:Landroid/widget/LinearLayout;

    .line 413
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->A:Landroid/view/View;

    sget v1, Lcom/huawei/android/sns/R$id;->guild_scrollview:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/ScrollView;

    .line 414
    if-eqz v2, :cond_0

    .line 416
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Landroid/widget/ScrollView;->setOverScrollMode(I)V

    .line 419
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$id;->layout_two:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->N:Landroid/view/View;

    .line 420
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 423
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->N:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 427
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->N:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 430
    :goto_0
    sget v0, Lcom/huawei/android/sns/R$id;->ignore_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->H:Lo/egd;

    .line 431
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->H:Lo/egd;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_cancel:I

    invoke-virtual {v0, v1}, Lo/egd;->setText(I)V

    .line 432
    sget v0, Lcom/huawei/android/sns/R$id;->match_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->I:Lo/egd;

    .line 433
    sget v0, Lcom/huawei/android/sns/R$id;->network_error_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bni;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->j:Lo/bni;

    .line 434
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->H:Lo/egd;

    new-instance v1, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity$1;-><init>(Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 442
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->I:Lo/egd;

    new-instance v1, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity$4;-><init>(Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 460
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->s()V

    .line 461
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->r()V

    .line 462
    return-void
.end method

.method private u()V
    .locals 2

    .line 398
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->q:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 399
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->y:Lo/bnd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bnd;->setVisibility(I)V

    .line 400
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->A:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 401
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->m()V

    .line 402
    return-void
.end method

.method private w()V
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 510
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "agree_upload_phone_digest"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 513
    :goto_0
    if-eqz v3, :cond_1

    .line 515
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "agree_upload_phone_digest"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/bcb;->e(Ljava/lang/String;Z)Z

    .line 518
    :cond_1
    invoke-static {}, Lo/brg;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 520
    const/4 v0, 0x3

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "android.permission.READ_CONTACTS"

    const/4 v1, 0x0

    aput-object v0, v4, v1

    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v1, 0x1

    aput-object v0, v4, v1

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v1, 0x2

    aput-object v0, v4, v1

    .line 523
    invoke-static {p0, v4}, Lo/biq;->a(Landroid/content/Context;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    .line 526
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.READ_CONTACTS"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {p0, v0}, Lo/biq;->d(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->F:Z

    .line 530
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 532
    .line 533
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {v5, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    .line 532
    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->requestPermissions([Ljava/lang/String;I)V

    goto :goto_1

    .line 539
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->n()V

    .line 541
    :goto_1
    goto :goto_2

    .line 545
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->n()V

    .line 547
    :goto_2
    return-void
.end method

.method private x()V
    .locals 1

    .line 627
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->E:Lo/bio;

    if-eqz v0, :cond_0

    .line 629
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->E:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->c()V

    .line 631
    :cond_0
    return-void
.end method

.method private y()V
    .locals 2

    .line 638
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->j:Lo/bni;

    new-instance v1, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity$5;-><init>(Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;)V

    invoke-virtual {v0, v1}, Lo/bni;->setCallBack(Lo/bni$d;)V

    .line 647
    return-void
.end method


# virtual methods
.method a(Lcom/huawei/health/sns/model/user/User;)V
    .locals 0

    .line 390
    return-void
.end method

.method protected d(Ljava/lang/String;)V
    .locals 2

    .line 571
    new-instance v0, Lo/avs;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->J:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/avs;-><init>(Landroid/os/Handler;)V

    invoke-virtual {v0, p1}, Lo/avs;->e(Ljava/lang/String;)V

    .line 572
    return-void
.end method

.method protected e()V
    .locals 2

    .line 226
    invoke-super {p0}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->e()V

    .line 227
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->s:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_user_contact_selector:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 228
    return-void
.end method

.method g()Z
    .locals 1

    .line 668
    const/4 v0, 0x0

    return v0
.end method

.method protected l()V
    .locals 4

    .line 602
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->E:Lo/bio;

    if-nez v0, :cond_0

    .line 605
    new-instance v0, Lo/bio;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_match_contact_dialog_title:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, p0, v2, v1, v3}, Lo/bio;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->E:Lo/bio;

    .line 608
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->E:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->a()V

    .line 609
    return-void
.end method

.method protected n()V
    .locals 2

    .line 617
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->l()V

    .line 618
    invoke-static {}, Lo/arw;->c()Lo/asb;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->J:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Lo/asb;->b(Landroid/os/Handler;)V

    .line 619
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 660
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 661
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->s()V

    .line 662
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->r()V

    .line 663
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 207
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->onCreate(Landroid/os/Bundle;)V

    .line 210
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->c()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 215
    goto :goto_0

    .line 212
    :catch_0
    move-exception v2

    .line 214
    const-string v0, "ContactSelectorActivity"

    const-string v1, "ContactSelectorActivity get intent data exception "

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 217
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->e()V

    .line 218
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->q()V

    .line 220
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->d()V

    .line 221
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 652
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->x()V

    .line 653
    invoke-static {}, Lo/arw;->c()Lo/asb;

    move-result-object v0

    invoke-virtual {v0}, Lo/asb;->c()V

    .line 654
    invoke-super {p0}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->onDestroy()V

    .line 655
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 3

    .line 290
    const/4 v0, 0x1

    if-ne p1, v0, :cond_3

    .line 292
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->F:Z

    if-eqz v0, :cond_0

    .line 295
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->n()V

    goto :goto_2

    .line 297
    :cond_0
    if-eqz p2, :cond_3

    if-eqz p3, :cond_3

    .line 299
    const/4 v2, 0x0

    :goto_0
    array-length v0, p2

    if-ge v2, v0, :cond_3

    .line 301
    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    aget-object v1, p2, v2

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    array-length v0, p3

    if-ge v2, v0, :cond_1

    aget v0, p3, v2

    if-nez v0, :cond_1

    .line 304
    invoke-static {}, Lo/bpk;->b()Lo/bpk;

    move-result-object v0

    invoke-virtual {v0}, Lo/bpk;->c()V

    goto :goto_1

    .line 306
    :cond_1
    const-string v0, "android.permission.READ_CONTACTS"

    aget-object v1, p2, v2

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    array-length v0, p3

    if-ge v2, v0, :cond_2

    aget v0, p3, v2

    if-nez v0, :cond_2

    .line 310
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/ContactSelectorActivity;->n()V

    .line 299
    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 315
    :cond_3
    :goto_2
    return-void
.end method
