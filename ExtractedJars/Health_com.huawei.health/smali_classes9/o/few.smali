.class public abstract Lo/few;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/few$b;,
        Lo/few$d;,
        Lo/few$a;,
        Lo/few$e;
    }
.end annotation


# instance fields
.field private a:Lo/fev;

.field private b:Lo/fev;

.field private c:Lo/fex;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/content/Context;

.field private f:Landroid/widget/ListView;

.field private g:I

.field private h:Landroid/support/v4/widget/SwipeRefreshLayout;

.field private i:Landroid/widget/LinearLayout;

.field private k:Landroid/widget/ListView;

.field private l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private n:Ljava/lang/String;

.field private o:Z

.field private p:Landroid/graphics/drawable/Drawable;

.field private q:Landroid/widget/BaseAdapter;

.field private r:I

.field private s:Lo/few$e;

.field private t:Landroid/widget/BaseAdapter;

.field private u:Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;

.field private v:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/util/ArrayList<Lo/fdf;>;>;"
        }
    .end annotation
.end field

.field private w:Lo/few$a;

.field private x:I

.field private z:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lo/fex;Landroid/widget/ListView;)V
    .locals 2

    .line 104
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    const/16 v0, 0x96

    iput v0, p0, Lo/few;->g:I

    .line 60
    const-string v0, ""

    iput-object v0, p0, Lo/few;->n:Ljava/lang/String;

    .line 75
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/few;->o:Z

    .line 79
    const/4 v0, 0x0

    iput v0, p0, Lo/few;->r:I

    .line 84
    new-instance v0, Lo/few$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/few$b;-><init>(Lo/few;Lo/few$1;)V

    iput-object v0, p0, Lo/few;->u:Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;

    .line 89
    new-instance v0, Lo/few$e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/few$e;-><init>(Lo/few;Lo/few$1;)V

    iput-object v0, p0, Lo/few;->s:Lo/few$e;

    .line 90
    new-instance v0, Lo/few$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/few$a;-><init>(Lo/few;Lo/few$1;)V

    iput-object v0, p0, Lo/few;->w:Lo/few$a;

    .line 97
    const/16 v0, 0x96

    iput v0, p0, Lo/few;->x:I

    .line 105
    iput-object p1, p0, Lo/few;->e:Landroid/content/Context;

    .line 106
    iput-object p2, p0, Lo/few;->c:Lo/fex;

    .line 107
    iput-object p3, p0, Lo/few;->k:Landroid/widget/ListView;

    .line 108
    return-void
.end method

.method static synthetic a(Lo/few;I)I
    .locals 1

    .line 32
    invoke-direct {p0, p1}, Lo/few;->c(I)I

    move-result v0

    return v0
.end method

.method static synthetic a(Lo/few;)Landroid/widget/ListView;
    .locals 1

    .line 32
    iget-object v0, p0, Lo/few;->f:Landroid/widget/ListView;

    return-object v0
.end method

.method static synthetic b(Lo/few;)Landroid/widget/ListView;
    .locals 1

    .line 32
    iget-object v0, p0, Lo/few;->k:Landroid/widget/ListView;

    return-object v0
.end method

.method private b(Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 571
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 572
    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_0

    .line 573
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lo/few;->c(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 572
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 576
    :cond_0
    return-object v1
.end method

.method private b()V
    .locals 15

    .line 384
    iget-object v0, p0, Lo/few;->k:Landroid/widget/ListView;

    iget-object v1, p0, Lo/few;->t:Landroid/widget/BaseAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 385
    iget-object v0, p0, Lo/few;->k:Landroid/widget/ListView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVerticalScrollBarEnabled(Z)V

    .line 389
    iget-object v0, p0, Lo/few;->c:Lo/fex;

    iget-object v1, p0, Lo/few;->k:Landroid/widget/ListView;

    invoke-virtual {v0, v1}, Lo/fex;->removeView(Landroid/view/View;)V

    .line 392
    new-instance v5, Landroid/widget/LinearLayout;

    iget-object v0, p0, Lo/few;->e:Landroid/content/Context;

    invoke-direct {v5, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 393
    const/16 v0, 0x30

    invoke-direct {p0, v0}, Lo/few;->c(I)I

    move-result v0

    invoke-virtual {v5, v0}, Landroid/widget/LinearLayout;->setMinimumHeight(I)V

    .line 394
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 395
    invoke-static {}, Landroid/view/View;->generateViewId()I

    move-result v0

    invoke-virtual {v5, v0}, Landroid/widget/LinearLayout;->setId(I)V

    .line 397
    new-instance v0, Landroid/widget/TextView;

    iget-object v1, p0, Lo/few;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/few;->d:Landroid/widget/TextView;

    .line 398
    iget-object v0, p0, Lo/few;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lo/few;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->hw_show_color_text_50_persent_black:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 399
    iget-object v0, p0, Lo/few;->d:Landroid/widget/TextView;

    const/16 v1, 0x10

    invoke-direct {p0, v1}, Lo/few;->c(I)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 400
    iget-object v0, p0, Lo/few;->d:Landroid/widget/TextView;

    const/4 v1, 0x1

    const/high16 v2, 0x41700000    # 15.0f

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 401
    iget-object v0, p0, Lo/few;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lo/few;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 402
    iget-object v0, p0, Lo/few;->d:Landroid/widget/TextView;

    invoke-static {}, Landroid/view/View;->generateViewId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setId(I)V

    .line 403
    iget-object v0, p0, Lo/few;->d:Landroid/widget/TextView;

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 404
    new-instance v6, Landroid/widget/RelativeLayout$LayoutParams;

    iget v0, p0, Lo/few;->g:I

    const/4 v1, -0x2

    invoke-direct {v6, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 405
    iget-object v0, p0, Lo/few;->d:Landroid/widget/TextView;

    invoke-virtual {v5, v0, v6}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 406
    const/high16 v0, 0x5000000

    invoke-virtual {v5, v0}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    .line 407
    const/16 v0, 0x10

    invoke-virtual {v5, v0}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 410
    new-instance v0, Landroid/widget/LinearLayout;

    iget-object v1, p0, Lo/few;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/few;->i:Landroid/widget/LinearLayout;

    .line 411
    iget-object v0, p0, Lo/few;->i:Landroid/widget/LinearLayout;

    const/16 v1, 0x30

    invoke-direct {p0, v1}, Lo/few;->c(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setMinimumHeight(I)V

    .line 412
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x1

    invoke-direct {v7, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 413
    iget-object v0, p0, Lo/few;->i:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v7}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 415
    new-instance v0, Lo/fev;

    iget-object v1, p0, Lo/few;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/fev;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/few;->b:Lo/fev;

    .line 416
    iget-object v0, p0, Lo/few;->b:Lo/fev;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fev;->setHorizontalScrollBarEnabled(Z)V

    .line 417
    iget-object v0, p0, Lo/few;->b:Lo/fev;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/fev;->setOverScrollMode(I)V

    .line 418
    iget-object v0, p0, Lo/few;->b:Lo/fev;

    iget-object v1, p0, Lo/few;->i:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Lo/fev;->addView(Landroid/view/View;)V

    .line 419
    iget-object v0, p0, Lo/few;->b:Lo/fev;

    invoke-static {}, Landroid/view/View;->generateViewId()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/fev;->setId(I)V

    .line 420
    new-instance v8, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x2

    invoke-direct {v8, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 421
    iget-object v0, p0, Lo/few;->b:Lo/fev;

    invoke-virtual {v5, v0, v8}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 422
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x2

    invoke-direct {v9, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 423
    iget-object v0, p0, Lo/few;->c:Lo/fex;

    invoke-virtual {v0, v5, v9}, Lo/fex;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 427
    new-instance v10, Landroid/widget/LinearLayout;

    iget-object v0, p0, Lo/few;->e:Landroid/content/Context;

    invoke-direct {v10, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 428
    const/4 v0, 0x0

    invoke-virtual {v10, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 429
    invoke-static {}, Landroid/view/View;->generateViewId()I

    move-result v0

    invoke-virtual {v10, v0}, Landroid/widget/LinearLayout;->setId(I)V

    .line 430
    const/4 v0, 0x6

    invoke-direct {p0, v0}, Lo/few;->c(I)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v10, v1, v2, v3, v0}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 432
    new-instance v0, Landroid/widget/ListView;

    iget-object v1, p0, Lo/few;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/few;->f:Landroid/widget/ListView;

    .line 433
    iget-object v0, p0, Lo/few;->f:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setFastScrollEnabled(Z)V

    .line 435
    iget-object v0, p0, Lo/few;->f:Landroid/widget/ListView;

    invoke-static {}, Landroid/view/View;->generateViewId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setId(I)V

    .line 436
    iget-object v0, p0, Lo/few;->f:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVerticalScrollBarEnabled(Z)V

    .line 437
    iget-object v0, p0, Lo/few;->f:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setDividerHeight(I)V

    .line 438
    iget-object v0, p0, Lo/few;->f:Landroid/widget/ListView;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOverScrollMode(I)V

    .line 439
    iget-object v0, p0, Lo/few;->k:Landroid/widget/ListView;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOverScrollMode(I)V

    .line 441
    new-instance v11, Landroid/widget/RelativeLayout$LayoutParams;

    iget v0, p0, Lo/few;->g:I

    const/4 v1, -0x1

    invoke-direct {v11, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 442
    iget-object v0, p0, Lo/few;->f:Landroid/widget/ListView;

    invoke-virtual {v10, v0, v11}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 444
    new-instance v0, Lo/fev;

    iget-object v1, p0, Lo/few;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/fev;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/few;->a:Lo/fev;

    .line 445
    iget-object v0, p0, Lo/few;->a:Lo/fev;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fev;->setHorizontalScrollBarEnabled(Z)V

    .line 446
    iget-object v0, p0, Lo/few;->a:Lo/fev;

    iget-object v1, p0, Lo/few;->k:Landroid/widget/ListView;

    invoke-virtual {v0, v1}, Lo/fev;->addView(Landroid/view/View;)V

    .line 447
    iget-object v0, p0, Lo/few;->a:Lo/fev;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/fev;->setOverScrollMode(I)V

    .line 448
    new-instance v12, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x1

    invoke-direct {v12, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 449
    iget-object v0, p0, Lo/few;->h:Landroid/support/v4/widget/SwipeRefreshLayout;

    if-nez v0, :cond_0

    .line 450
    new-instance v0, Landroid/support/v4/widget/SwipeRefreshLayout;

    iget-object v1, p0, Lo/few;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/support/v4/widget/SwipeRefreshLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/few;->h:Landroid/support/v4/widget/SwipeRefreshLayout;

    .line 452
    :cond_0
    iget-object v0, p0, Lo/few;->h:Landroid/support/v4/widget/SwipeRefreshLayout;

    iget-object v1, p0, Lo/few;->a:Lo/fev;

    invoke-virtual {v0, v1, v12}, Landroid/support/v4/widget/SwipeRefreshLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 453
    iget-object v0, p0, Lo/few;->h:Landroid/support/v4/widget/SwipeRefreshLayout;

    iget-object v1, p0, Lo/few;->u:Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;)V

    .line 454
    const-string v0, "AbstractPanelListAdapter"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "reorganizeViewGroup: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/few;->u:Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 455
    new-instance v13, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x1

    invoke-direct {v13, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 456
    iget-object v0, p0, Lo/few;->h:Landroid/support/v4/widget/SwipeRefreshLayout;

    invoke-virtual {v10, v0, v13}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 457
    new-instance v14, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x2

    invoke-direct {v14, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 458
    invoke-virtual {v5}, Landroid/widget/LinearLayout;->getId()I

    move-result v0

    const/4 v1, 0x3

    invoke-virtual {v14, v1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 459
    iget-object v0, p0, Lo/few;->c:Lo/fex;

    invoke-virtual {v0, v10, v14}, Lo/fex;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 460
    iget v0, p0, Lo/few;->r:I

    if-nez v0, :cond_1

    .line 461
    iget-object v0, p0, Lo/few;->h:Landroid/support/v4/widget/SwipeRefreshLayout;

    iget-boolean v1, p0, Lo/few;->o:Z

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->setEnabled(Z)V

    .line 465
    :cond_1
    iget-object v0, p0, Lo/few;->c:Lo/fex;

    new-instance v1, Lo/few$1;

    invoke-direct {v1, p0}, Lo/few$1;-><init>(Lo/few;)V

    invoke-virtual {v0, v1}, Lo/fex;->post(Ljava/lang/Runnable;)Z

    .line 476
    return-void
.end method

.method private c(I)I
    .locals 3

    .line 566
    iget-object v0, p0, Lo/few;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    .line 567
    int-to-float v0, p1

    mul-float/2addr v0, v2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method static synthetic c(Lo/few;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Lo/few;->g()V

    return-void
.end method

.method static synthetic d(Lo/few;)I
    .locals 1

    .line 32
    iget v0, p0, Lo/few;->r:I

    return v0
.end method

.method private d(Ljava/util/List;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/util/ArrayList<Lo/fdf;>;>;)Ljava/util/List<Ljava/util/ArrayList<Lo/fdf;>;>;"
        }
    .end annotation

    .line 358
    const/4 v4, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ge v4, v0, :cond_2

    .line 359
    const/4 v5, 0x1

    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr v0, v4

    if-ge v5, v0, :cond_1

    .line 361
    add-int/lit8 v0, v5, -0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fdf;

    invoke-virtual {v0}, Lo/fdf;->b()J

    move-result-wide v0

    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/fdf;

    invoke-virtual {v2}, Lo/fdf;->b()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 362
    add-int/lit8 v0, v5, -0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/ArrayList;

    .line 363
    add-int/lit8 v0, v5, -0x1

    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 364
    invoke-interface {p1, v5, v6}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 359
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 358
    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 368
    :cond_2
    return-object p1
.end method

.method static synthetic e(Lo/few;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Lo/few;->h()V

    return-void
.end method

.method private f()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 533
    iget-object v0, p0, Lo/few;->m:Ljava/util/List;

    if-nez v0, :cond_0

    .line 535
    :try_start_0
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "you must set your column data list by calling setColumnDataList(List<String>)"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 536
    :catch_0
    move-exception v4

    .line 537
    const-string v0, "AbstractPanelListAdapter"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getRowDataList()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "Exception = "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 541
    :cond_0
    iget-object v0, p0, Lo/few;->m:Ljava/util/List;

    return-object v0
.end method

.method static synthetic f(Lo/few;)Lo/fev;
    .locals 1

    .line 32
    iget-object v0, p0, Lo/few;->b:Lo/fev;

    return-object v0
.end method

.method private g()V
    .locals 2

    .line 479
    iget-object v0, p0, Lo/few;->f:Landroid/widget/ListView;

    invoke-virtual {p0}, Lo/few;->d()Landroid/widget/BaseAdapter;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 480
    iget-object v0, p0, Lo/few;->p:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 481
    iget-object v0, p0, Lo/few;->f:Landroid/widget/ListView;

    iget-object v1, p0, Lo/few;->p:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    .line 483
    :cond_0
    return-void
.end method

.method static synthetic g(Lo/few;)Z
    .locals 1

    .line 32
    iget-boolean v0, p0, Lo/few;->o:Z

    return v0
.end method

.method static synthetic h(Lo/few;)Landroid/support/v4/widget/SwipeRefreshLayout;
    .locals 1

    .line 32
    iget-object v0, p0, Lo/few;->h:Landroid/support/v4/widget/SwipeRefreshLayout;

    return-object v0
.end method

.method private h()V
    .locals 9

    .line 493
    invoke-direct {p0}, Lo/few;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-array v4, v0, [Ljava/lang/Integer;

    .line 494
    iget-object v0, p0, Lo/few;->z:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 495
    const/4 v5, 0x0

    :goto_0
    array-length v0, v4

    if-ge v5, v0, :cond_0

    .line 496
    iget-object v0, p0, Lo/few;->z:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    aput-object v0, v4, v5

    .line 495
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    goto :goto_1

    .line 500
    :cond_1
    :try_start_0
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "how can I set the row width if you don`t give me any reference"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 501
    :catch_0
    move-exception v5

    .line 502
    const-string v0, "AbstractPanelListAdapter"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initRowLayout() "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "Exception = "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 506
    :goto_1
    invoke-direct {p0}, Lo/few;->f()Ljava/util/List;

    move-result-object v5

    .line 507
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    .line 512
    const/4 v7, 0x0

    :goto_2
    if-ge v7, v6, :cond_2

    .line 513
    new-instance v8, Landroid/widget/TextView;

    iget-object v0, p0, Lo/few;->e:Landroid/content/Context;

    invoke-direct {v8, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 514
    const/16 v0, 0x10

    invoke-direct {p0, v0}, Lo/few;->c(I)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v8, v0, v1, v2, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 515
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 516
    const/4 v0, 0x1

    const/high16 v1, 0x41700000    # 15.0f

    invoke-virtual {v8, v0, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 517
    invoke-virtual {v8}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setFakeBoldText(Z)V

    .line 518
    aget-object v0, v4, v7

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setWidth(I)V

    .line 519
    iget-object v0, p0, Lo/few;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->hw_show_color_text_50_persent_black:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 520
    const/16 v0, 0x10

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 521
    iget-object v0, p0, Lo/few;->i:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v8}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 522
    iget-object v0, p0, Lo/few;->i:Landroid/widget/LinearLayout;

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 512
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 524
    :cond_2
    return-void
.end method

.method static synthetic i(Lo/few;)Lo/fev;
    .locals 1

    .line 32
    iget-object v0, p0, Lo/few;->a:Lo/fev;

    return-object v0
.end method

.method static synthetic k(Lo/few;)Landroid/content/Context;
    .locals 1

    .line 32
    iget-object v0, p0, Lo/few;->e:Landroid/content/Context;

    return-object v0
.end method

.method private k()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 554
    iget-object v0, p0, Lo/few;->l:Ljava/util/List;

    if-nez v0, :cond_0

    .line 555
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/few;->l:Ljava/util/List;

    .line 556
    iget-object v0, p0, Lo/few;->v:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    .line 557
    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    .line 558
    iget-object v0, p0, Lo/few;->v:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fdf;

    iget-wide v0, v0, Lo/fdf;->a:J

    invoke-static {v0, v1}, Lo/fee;->c(J)Ljava/lang/String;

    move-result-object v4

    .line 559
    iget-object v0, p0, Lo/few;->l:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 557
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 562
    :cond_0
    iget-object v0, p0, Lo/few;->l:Ljava/util/List;

    return-object v0
.end method

.method static synthetic o(Lo/few;)I
    .locals 1

    .line 32
    iget v0, p0, Lo/few;->g:I

    return v0
.end method

.method static synthetic p(Lo/few;)I
    .locals 1

    .line 32
    iget v0, p0, Lo/few;->x:I

    return v0
.end method


# virtual methods
.method a()V
    .locals 7

    .line 316
    invoke-virtual {p0}, Lo/few;->c()Landroid/widget/BaseAdapter;

    move-result-object v0

    iput-object v0, p0, Lo/few;->t:Landroid/widget/BaseAdapter;

    .line 318
    iget-object v0, p0, Lo/few;->t:Landroid/widget/BaseAdapter;

    if-nez v0, :cond_0

    .line 319
    new-instance v0, Lo/feu;

    iget-object v1, p0, Lo/few;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$layout;->item_content:I

    iget-object v3, p0, Lo/few;->v:Ljava/util/List;

    iget-object v4, p0, Lo/few;->z:Ljava/util/List;

    iget v5, p0, Lo/few;->x:I

    iget-object v6, p0, Lo/few;->k:Landroid/widget/ListView;

    invoke-direct/range {v0 .. v6}, Lo/feu;-><init>(Landroid/content/Context;ILjava/util/List;Ljava/util/List;ILandroid/widget/ListView;)V

    iput-object v0, p0, Lo/few;->t:Landroid/widget/BaseAdapter;

    .line 323
    :cond_0
    invoke-direct {p0}, Lo/few;->b()V

    .line 325
    iget-object v0, p0, Lo/few;->b:Lo/fev;

    iget-object v1, p0, Lo/few;->s:Lo/few$e;

    invoke-virtual {v0, v1}, Lo/fev;->setOnHorizontalScrollListener(Lo/fev$d;)V

    .line 326
    iget-object v0, p0, Lo/few;->a:Lo/fev;

    iget-object v1, p0, Lo/few;->s:Lo/few$e;

    invoke-virtual {v0, v1}, Lo/fev;->setOnHorizontalScrollListener(Lo/fev$d;)V

    .line 328
    iget-object v0, p0, Lo/few;->k:Landroid/widget/ListView;

    iget-object v1, p0, Lo/few;->w:Lo/few$a;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 329
    iget-object v0, p0, Lo/few;->f:Landroid/widget/ListView;

    iget-object v1, p0, Lo/few;->w:Lo/few$a;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 330
    return-void
.end method

.method public a(I)V
    .locals 1

    .line 114
    invoke-direct {p0, p1}, Lo/few;->c(I)I

    move-result v0

    iput v0, p0, Lo/few;->x:I

    .line 115
    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/util/ArrayList<Lo/fdf;>;>;)V"
        }
    .end annotation

    .line 118
    invoke-direct {p0, p1}, Lo/few;->d(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/few;->v:Ljava/util/List;

    .line 119
    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 274
    iput-boolean p1, p0, Lo/few;->o:Z

    .line 275
    return-void
.end method

.method protected abstract c()Landroid/widget/BaseAdapter;
.end method

.method public c(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 166
    iput-object p1, p0, Lo/few;->m:Ljava/util/List;

    .line 167
    return-void
.end method

.method public d()Landroid/widget/BaseAdapter;
    .locals 4

    .line 585
    iget-object v0, p0, Lo/few;->q:Landroid/widget/BaseAdapter;

    if-nez v0, :cond_0

    .line 586
    new-instance v0, Lo/few$d;

    iget-object v1, p0, Lo/few;->e:Landroid/content/Context;

    invoke-direct {p0}, Lo/few;->k()Ljava/util/List;

    move-result-object v2

    const v3, 0x1090003

    invoke-direct {v0, p0, v1, v3, v2}, Lo/few$d;-><init>(Lo/few;Landroid/content/Context;ILjava/util/List;)V

    iput-object v0, p0, Lo/few;->q:Landroid/widget/BaseAdapter;

    .line 588
    :cond_0
    iget-object v0, p0, Lo/few;->q:Landroid/widget/BaseAdapter;

    return-object v0
.end method

.method public d(I)V
    .locals 0

    .line 238
    iput p1, p0, Lo/few;->r:I

    .line 239
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 131
    iput-object p1, p0, Lo/few;->n:Ljava/lang/String;

    .line 132
    return-void
.end method

.method public e()V
    .locals 6

    .line 341
    const-string v0, "AbstractPanelListAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "refreshListview, mBloodsugarlist.size()="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/few;->v:Ljava/util/List;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 342
    iget-object v0, p0, Lo/few;->t:Landroid/widget/BaseAdapter;

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 343
    iget-object v0, p0, Lo/few;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 344
    iget-object v0, p0, Lo/few;->v:Ljava/util/List;

    invoke-direct {p0, v0}, Lo/few;->d(Ljava/util/List;)Ljava/util/List;

    .line 345
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lo/few;->v:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_0

    .line 346
    iget-object v0, p0, Lo/few;->v:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fdf;

    iget-wide v0, v0, Lo/fdf;->a:J

    invoke-static {v0, v1}, Lo/fee;->c(J)Ljava/lang/String;

    move-result-object v5

    .line 347
    iget-object v0, p0, Lo/few;->l:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 345
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 349
    :cond_0
    iget-object v0, p0, Lo/few;->q:Landroid/widget/BaseAdapter;

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 350
    return-void
.end method

.method public e(I)V
    .locals 1

    .line 149
    invoke-direct {p0, p1}, Lo/few;->c(I)I

    move-result v0

    iput v0, p0, Lo/few;->g:I

    .line 150
    return-void
.end method

.method public e(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 122
    invoke-direct {p0, p1}, Lo/few;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/few;->z:Ljava/util/List;

    .line 123
    return-void
.end method
