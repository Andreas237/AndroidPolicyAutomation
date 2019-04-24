.class public Lcom/huawei/health/sns/ui/photo/PhotoListActivity;
.super Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/photo/PhotoListActivity$b;,
        Lcom/huawei/health/sns/ui/photo/PhotoListActivity$a;
    }
.end annotation


# static fields
.field private static final h:Ljava/lang/String;


# instance fields
.field protected f:Lcom/huawei/health/sns/ui/photo/PhotoListActivity$b;

.field private k:Landroid/content/Context;

.field private q:Ljava/lang/String;

.field private r:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private u:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 53
    const-class v0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->h:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 51
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;-><init>()V

    .line 93
    new-instance v0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity$a;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/photo/PhotoListActivity$a;-><init>(Lcom/huawei/health/sns/ui/photo/PhotoListActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->u:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/photo/PhotoListActivity;)Lo/bns;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->l:Lo/bns;

    return-object v0
.end method

.method private a()V
    .locals 3

    .line 157
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 158
    if-eqz v2, :cond_1

    .line 161
    const-string v0, "totalList"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->getStringArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->r:Ljava/util/ArrayList;

    .line 162
    iget-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->r:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 165
    const-string v0, "position"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->s:I

    .line 166
    const-string v0, "origin_url"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->q:Ljava/lang/String;

    .line 167
    iget-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->q:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 168
    iget-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->r:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->q:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->d(Ljava/util/ArrayList;Ljava/lang/String;)V

    goto :goto_0

    .line 170
    :cond_0
    sget-object v0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->h:Ljava/lang/String;

    const-string v1, "getIntentData originUrl is null"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 173
    :goto_0
    iget v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->s:I

    add-int/lit8 v0, v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->e(I)V

    .line 176
    :cond_1
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/photo/PhotoListActivity;I)V
    .locals 0

    .line 51
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->e(I)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/photo/PhotoListActivity;)Landroid/view/View;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->m:Landroid/view/View;

    return-object v0
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 376
    invoke-static {p2}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v4

    .line 378
    const-string v0, "/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 380
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Ljava/net/URI;->getAuthority()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 384
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "/"

    invoke-virtual {p2, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {p2, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 386
    :goto_0
    return-object v3
.end method

.method private b(Ljava/lang/String;)Z
    .locals 1

    .line 364
    const-string v0, "https"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "http"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/photo/PhotoListActivity;)I
    .locals 1

    .line 51
    iget v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->s:I

    return v0
.end method

.method private c(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 396
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v1

    invoke-virtual {v1}, Lo/bbh;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1}, Lo/bbj;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/photo/PhotoListActivity;I)I
    .locals 0

    .line 51
    iput p1, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->s:I

    return p1
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/photo/PhotoListActivity;)Landroid/view/View;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->m:Landroid/view/View;

    return-object v0
.end method

.method private static d(Lcom/huawei/health/sns/ui/photo/PhotoListActivity;Ljava/lang/String;)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/ui/photo/PhotoListActivity;Ljava/lang/String;)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 417
    new-instance v0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity$5;

    invoke-direct {v0, p0, p1}, Lcom/huawei/health/sns/ui/photo/PhotoListActivity$5;-><init>(Lcom/huawei/health/sns/ui/photo/PhotoListActivity;Ljava/lang/String;)V

    return-object v0
.end method

.method private d(Ljava/lang/String;)V
    .locals 2

    .line 440
    new-instance v1, Lo/atr;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->u:Landroid/os/Handler;

    invoke-direct {v1, p0, v0}, Lo/atr;-><init>(Landroid/content/Context;Landroid/os/Handler;)V

    .line 441
    invoke-virtual {v1, p1}, Lo/atr;->e(Ljava/lang/String;)V

    .line 442
    return-void
.end method

.method private d(Ljava/util/ArrayList;Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/String;>;Ljava/lang/String;)V"
        }
    .end annotation

    .line 342
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 344
    sget-object v0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->h:Ljava/lang/String;

    const-string v1, "dealWithUrl got origin Url is null"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 345
    return-void

    .line 347
    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_3

    .line 349
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 351
    invoke-direct {p0, v3}, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 353
    goto :goto_1

    .line 355
    :cond_1
    invoke-direct {p0, v3, p2}, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v2, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 347
    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 357
    :cond_3
    return-void
.end method

.method private e(I)V
    .locals 2

    .line 241
    iget-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->r:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 243
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->r:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->setTitle(Ljava/lang/CharSequence;)V

    .line 245
    :cond_0
    return-void
.end method

.method private e(Ljava/lang/String;)V
    .locals 2

    .line 406
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {p0, p1}, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->d(Lcom/huawei/health/sns/ui/photo/PhotoListActivity;Ljava/lang/String;)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 407
    return-void
.end method

.method private g()V
    .locals 2

    .line 192
    sget v0, Lcom/huawei/android/sns/R$id;->photo_contentView:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->a:Landroid/widget/RelativeLayout;

    .line 193
    sget v0, Lcom/huawei/android/sns/R$id;->view_pager:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bns;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->l:Lo/bns;

    .line 194
    sget v0, Lcom/huawei/android/sns/R$id;->navi_dark:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->m:Landroid/view/View;

    .line 195
    sget v0, Lcom/huawei/android/sns/R$id;->bottom_view:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->n:Landroid/view/View;

    .line 198
    iget-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->a:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/base/SNSBaseActivity$c;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity$c;-><init>(Lcom/huawei/health/sns/ui/base/SNSBaseActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 201
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->f()V

    .line 202
    return-void
.end method

.method private h()V
    .locals 2

    .line 180
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v1

    .line 181
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    invoke-static {}, Lo/brg;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 183
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 185
    :cond_0
    return-void
.end method

.method private k()V
    .locals 3

    .line 209
    iget-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->l:Lo/bns;

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    const/4 v2, -0x1

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v1}, Lo/bns;->setPageMarginDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 210
    new-instance v0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity$b;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->r:Ljava/util/ArrayList;

    invoke-direct {v0, p0, v1}, Lcom/huawei/health/sns/ui/photo/PhotoListActivity$b;-><init>(Lcom/huawei/health/sns/ui/photo/PhotoListActivity;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->f:Lcom/huawei/health/sns/ui/photo/PhotoListActivity$b;

    .line 211
    iget-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->l:Lo/bns;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->f:Lcom/huawei/health/sns/ui/photo/PhotoListActivity$b;

    invoke-virtual {v0, v1}, Lo/bns;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 212
    iget-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->l:Lo/bns;

    iget v1, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->s:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bns;->setCurrentItem(IZ)V

    .line 213
    iget-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->l:Lo/bns;

    new-instance v1, Lcom/huawei/health/sns/ui/photo/PhotoListActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/photo/PhotoListActivity$1;-><init>(Lcom/huawei/health/sns/ui/photo/PhotoListActivity;)V

    invoke-virtual {v0, v1}, Lo/bns;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 234
    return-void
.end method

.method private m()V
    .locals 3

    .line 509
    iget-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->r:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 511
    iget-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->r:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 513
    invoke-static {v2}, Lo/bbn;->b(Ljava/lang/String;)V

    .line 514
    goto :goto_0

    .line 516
    :cond_0
    return-void
.end method


# virtual methods
.method public f()V
    .locals 4

    .line 250
    iget-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->m:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/RelativeLayout$LayoutParams;

    .line 251
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 253
    iget-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->m:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 254
    invoke-static {p0}, Lo/boi;->e(Landroid/app/Activity;)I

    move-result v0

    iput v0, v3, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 255
    iget-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->m:Landroid/view/View;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$color;->sns_black_60_percent:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 256
    iget-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->m:Landroid/view/View;

    new-instance v1, Lcom/huawei/health/sns/ui/photo/PhotoListActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/photo/PhotoListActivity$2;-><init>(Lcom/huawei/health/sns/ui/photo/PhotoListActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 272
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->m:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 276
    :goto_0
    iget v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->i:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 278
    iget-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->m:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 281
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->m:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 282
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    .line 327
    invoke-super {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;->onBackPressed()V

    .line 328
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 141
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;->onCreate(Landroid/os/Bundle;)V

    .line 142
    iput-object p0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->k:Landroid/content/Context;

    .line 144
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->e()V

    .line 145
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_activity_photo_list:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->setContentView(I)V

    .line 146
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->a()V

    .line 147
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->h()V

    .line 148
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->g()V

    .line 149
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->k()V

    .line 150
    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 287
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$menu;->sns_photo_list_menu:I

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 288
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method public onDestroy()V
    .locals 0

    .line 333
    invoke-super {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;->onDestroy()V

    .line 334
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->m()V

    .line 335
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 4

    .line 294
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v2

    .line 296
    const v0, 0x102002c

    if-ne v2, v0, :cond_0

    .line 299
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->finish()V

    goto :goto_0

    .line 301
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$id;->menu_lp_send2friend:I

    if-ne v2, v0, :cond_1

    .line 304
    iget-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->r:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    .line 306
    iget-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->r:Ljava/util/ArrayList;

    iget v1, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->s:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 307
    invoke-direct {p0, v3}, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->e(Ljava/lang/String;)V

    .line 308
    goto :goto_0

    .line 310
    :cond_1
    sget v0, Lcom/huawei/android/sns/R$id;->menu_lp_save:I

    if-ne v2, v0, :cond_2

    .line 312
    iget-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->r:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    .line 314
    iget-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->r:Ljava/util/ArrayList;

    iget v1, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->s:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 316
    invoke-direct {p0, v3}, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->d(Ljava/lang/String;)V

    .line 321
    :cond_2
    :goto_0
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method
