.class public Lo/fha;
.super Landroid/widget/ListView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fha$c;,
        Lo/fha$b;,
        Lo/fha$a;,
        Lo/fha$d;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:Ljava/lang/Object;>Landroid/widget/ListView;"
    }
.end annotation


# instance fields
.field private a:I

.field private b:Z

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<TT;>;"
        }
    .end annotation
.end field

.field private d:I

.field private e:I

.field private f:I

.field private g:Ljava/lang/String;

.field private h:I

.field private i:I

.field private k:I

.field private l:Z

.field private m:Landroid/graphics/Paint;

.field private n:Lo/fha$d;

.field private o:Lo/fha$c;

.field private p:Lo/fha;

.field private q:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Ljava/util/List<TT;>;>;"
        }
    .end annotation
.end field

.field private r:Lo/fha$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/fha$a<TT;>;"
        }
    .end annotation
.end field

.field private s:Landroid/os/Handler;

.field private t:Lo/fgt;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/fgt<TT;>;"
        }
    .end annotation
.end field

.field private u:Lo/fha$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/fha$b<TT;>;"
        }
    .end annotation
.end field

.field private x:Landroid/widget/AbsListView$OnScrollListener;

.field private y:Landroid/view/View$OnTouchListener;

.field private z:Landroid/widget/AdapterView$OnItemClickListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 152
    invoke-direct {p0, p1}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    .line 52
    const/4 v0, 0x0

    iput v0, p0, Lo/fha;->a:I

    .line 53
    const/4 v0, 0x3

    iput v0, p0, Lo/fha;->e:I

    .line 54
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fha;->b:Z

    .line 55
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fha;->c:Ljava/util/List;

    .line 56
    const/4 v0, -0x1

    iput v0, p0, Lo/fha;->d:I

    .line 61
    const/4 v0, 0x0

    iput v0, p0, Lo/fha;->h:I

    .line 62
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fha;->l:Z

    .line 66
    sget-object v0, Lo/fha$d;->d:Lo/fha$d;

    iput-object v0, p0, Lo/fha;->n:Lo/fha$d;

    .line 80
    new-instance v0, Lo/fha$5;

    invoke-direct {v0, p0}, Lo/fha$5;-><init>(Lo/fha;)V

    iput-object v0, p0, Lo/fha;->s:Landroid/os/Handler;

    .line 102
    new-instance v0, Lo/fha$1;

    invoke-direct {v0, p0}, Lo/fha$1;-><init>(Lo/fha;)V

    iput-object v0, p0, Lo/fha;->z:Landroid/widget/AdapterView$OnItemClickListener;

    .line 111
    new-instance v0, Lo/fha$3;

    invoke-direct {v0, p0}, Lo/fha$3;-><init>(Lo/fha;)V

    iput-object v0, p0, Lo/fha;->y:Landroid/view/View$OnTouchListener;

    .line 119
    new-instance v0, Lo/fha$2;

    invoke-direct {v0, p0}, Lo/fha$2;-><init>(Lo/fha;)V

    iput-object v0, p0, Lo/fha;->x:Landroid/widget/AbsListView$OnScrollListener;

    .line 153
    invoke-direct {p0}, Lo/fha;->b()V

    .line 154
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 163
    invoke-direct {p0, p1, p2}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 52
    const/4 v0, 0x0

    iput v0, p0, Lo/fha;->a:I

    .line 53
    const/4 v0, 0x3

    iput v0, p0, Lo/fha;->e:I

    .line 54
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fha;->b:Z

    .line 55
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fha;->c:Ljava/util/List;

    .line 56
    const/4 v0, -0x1

    iput v0, p0, Lo/fha;->d:I

    .line 61
    const/4 v0, 0x0

    iput v0, p0, Lo/fha;->h:I

    .line 62
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fha;->l:Z

    .line 66
    sget-object v0, Lo/fha$d;->d:Lo/fha$d;

    iput-object v0, p0, Lo/fha;->n:Lo/fha$d;

    .line 80
    new-instance v0, Lo/fha$5;

    invoke-direct {v0, p0}, Lo/fha$5;-><init>(Lo/fha;)V

    iput-object v0, p0, Lo/fha;->s:Landroid/os/Handler;

    .line 102
    new-instance v0, Lo/fha$1;

    invoke-direct {v0, p0}, Lo/fha$1;-><init>(Lo/fha;)V

    iput-object v0, p0, Lo/fha;->z:Landroid/widget/AdapterView$OnItemClickListener;

    .line 111
    new-instance v0, Lo/fha$3;

    invoke-direct {v0, p0}, Lo/fha$3;-><init>(Lo/fha;)V

    iput-object v0, p0, Lo/fha;->y:Landroid/view/View$OnTouchListener;

    .line 119
    new-instance v0, Lo/fha$2;

    invoke-direct {v0, p0}, Lo/fha$2;-><init>(Lo/fha;)V

    iput-object v0, p0, Lo/fha;->x:Landroid/widget/AbsListView$OnScrollListener;

    .line 164
    invoke-direct {p0}, Lo/fha;->b()V

    .line 165
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 168
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 52
    const/4 v0, 0x0

    iput v0, p0, Lo/fha;->a:I

    .line 53
    const/4 v0, 0x3

    iput v0, p0, Lo/fha;->e:I

    .line 54
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fha;->b:Z

    .line 55
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fha;->c:Ljava/util/List;

    .line 56
    const/4 v0, -0x1

    iput v0, p0, Lo/fha;->d:I

    .line 61
    const/4 v0, 0x0

    iput v0, p0, Lo/fha;->h:I

    .line 62
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fha;->l:Z

    .line 66
    sget-object v0, Lo/fha$d;->d:Lo/fha$d;

    iput-object v0, p0, Lo/fha;->n:Lo/fha$d;

    .line 80
    new-instance v0, Lo/fha$5;

    invoke-direct {v0, p0}, Lo/fha$5;-><init>(Lo/fha;)V

    iput-object v0, p0, Lo/fha;->s:Landroid/os/Handler;

    .line 102
    new-instance v0, Lo/fha$1;

    invoke-direct {v0, p0}, Lo/fha$1;-><init>(Lo/fha;)V

    iput-object v0, p0, Lo/fha;->z:Landroid/widget/AdapterView$OnItemClickListener;

    .line 111
    new-instance v0, Lo/fha$3;

    invoke-direct {v0, p0}, Lo/fha$3;-><init>(Lo/fha;)V

    iput-object v0, p0, Lo/fha;->y:Landroid/view/View$OnTouchListener;

    .line 119
    new-instance v0, Lo/fha$2;

    invoke-direct {v0, p0}, Lo/fha$2;-><init>(Lo/fha;)V

    iput-object v0, p0, Lo/fha;->x:Landroid/widget/AbsListView$OnScrollListener;

    .line 169
    invoke-direct {p0}, Lo/fha;->b()V

    .line 170
    return-void
.end method

.method private a(F)I
    .locals 2

    .line 526
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    .line 527
    float-to-int v0, p1

    return v0

    .line 528
    :cond_0
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v1, 0x41400000    # 12.0f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    .line 529
    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_1

    const/4 v0, 0x2

    goto :goto_0

    :cond_1
    const/4 v0, -0x2

    :goto_0
    return v0

    .line 531
    :cond_2
    const/high16 v0, 0x40c00000    # 6.0f

    div-float v0, p1, v0

    float-to-int v0, v0

    return v0
.end method

.method static synthetic a(Lo/fha;)Ljava/util/List;
    .locals 1

    .line 50
    iget-object v0, p0, Lo/fha;->c:Ljava/util/List;

    return-object v0
.end method

.method private a()V
    .locals 7

    .line 267
    iget-object v0, p0, Lo/fha;->n:Lo/fha$d;

    invoke-virtual {p0}, Lo/fha;->getWidth()I

    move-result v1

    iget v2, p0, Lo/fha;->a:I

    iget v3, p0, Lo/fha;->e:I

    mul-int/2addr v2, v3

    iget-object v3, p0, Lo/fha;->o:Lo/fha$c;

    iget v4, p0, Lo/fha;->e:I

    iget v5, p0, Lo/fha;->a:I

    invoke-static/range {v0 .. v5}, Lo/fgs;->c(Lo/fha$d;IILo/fha$c;II)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    .line 268
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    .line 269
    invoke-virtual {p0, v6}, Lo/fha;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 271
    :cond_0
    invoke-virtual {p0, v6}, Lo/fha;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 273
    :goto_0
    return-void
.end method

.method private a(Landroid/view/View;Landroid/widget/TextView;IFF)V
    .locals 1

    .line 641
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 642
    const/4 v0, 0x1

    invoke-virtual {p2, v0, p4}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 643
    invoke-virtual {p1, p5}, Landroid/view/View;->setAlpha(F)V

    .line 644
    return-void
.end method

.method private a(Z)V
    .locals 8

    .line 541
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/fha;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    iget v0, p0, Lo/fha;->a:I

    if-nez v0, :cond_1

    .line 542
    :cond_0
    return-void

    .line 544
    :cond_1
    invoke-virtual {p0}, Lo/fha;->getFirstVisiblePosition()I

    move-result v6

    .line 545
    iget-boolean v0, p0, Lo/fha;->b:Z

    if-eqz v0, :cond_2

    if-nez v6, :cond_2

    .line 546
    return-void

    .line 548
    :cond_2
    const/4 v7, 0x0

    .line 549
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/fha;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getY()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    iget v2, p0, Lo/fha;->a:I

    int-to-double v2, v2

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    div-double/2addr v2, v4

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_3

    .line 550
    move v7, v6

    goto :goto_0

    .line 552
    :cond_3
    add-int/lit8 v7, v6, 0x1

    .line 554
    :goto_0
    iget v0, p0, Lo/fha;->e:I

    div-int/lit8 v0, v0, 0x2

    add-int/2addr v0, v7

    iget v1, p0, Lo/fha;->e:I

    div-int/lit8 v1, v1, 0x2

    invoke-direct {p0, v6, v0, v1}, Lo/fha;->b(III)V

    .line 556
    iget-boolean v0, p0, Lo/fha;->b:Z

    if-eqz v0, :cond_4

    .line 557
    iget v0, p0, Lo/fha;->e:I

    div-int/lit8 v0, v0, 0x2

    add-int/2addr v0, v7

    invoke-virtual {p0}, Lo/fha;->getWheelCount()I

    move-result v1

    rem-int v7, v0, v1

    .line 559
    :cond_4
    iget v0, p0, Lo/fha;->d:I

    if-ne v7, v0, :cond_5

    if-nez p1, :cond_5

    .line 560
    return-void

    .line 562
    :cond_5
    iput v7, p0, Lo/fha;->d:I

    .line 563
    iget-object v0, p0, Lo/fha;->t:Lo/fgt;

    invoke-virtual {v0, v7}, Lo/fgt;->c(I)V

    .line 564
    iget-object v0, p0, Lo/fha;->s:Landroid/os/Handler;

    const/16 v1, 0x100

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 565
    iget-object v0, p0, Lo/fha;->s:Landroid/os/Handler;

    const/16 v1, 0x100

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 568
    return-void
.end method

.method static synthetic b(Lo/fha;)Lo/fha$b;
    .locals 1

    .line 50
    iget-object v0, p0, Lo/fha;->u:Lo/fha$b;

    return-object v0
.end method

.method private b()V
    .locals 2

    .line 195
    iget-object v0, p0, Lo/fha;->o:Lo/fha$c;

    if-nez v0, :cond_0

    .line 196
    new-instance v0, Lo/fha$c;

    invoke-direct {v0}, Lo/fha$c;-><init>()V

    iput-object v0, p0, Lo/fha;->o:Lo/fha$c;

    .line 199
    :cond_0
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/fha;->m:Landroid/graphics/Paint;

    .line 201
    const-string v0, "com.wx.wheelview"

    invoke-virtual {p0, v0}, Lo/fha;->setTag(Ljava/lang/Object;)V

    .line 202
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/fha;->setVerticalScrollBarEnabled(Z)V

    .line 203
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/fha;->setScrollingCacheEnabled(Z)V

    .line 204
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/fha;->setCacheColorHint(I)V

    .line 205
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/fha;->setFadingEdgeLength(I)V

    .line 206
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lo/fha;->setOverScrollMode(I)V

    .line 207
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/fha;->setDividerHeight(I)V

    .line 208
    iget-object v0, p0, Lo/fha;->z:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {p0, v0}, Lo/fha;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 209
    iget-object v0, p0, Lo/fha;->x:Landroid/widget/AbsListView$OnScrollListener;

    invoke-virtual {p0, v0}, Lo/fha;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 210
    iget-object v0, p0, Lo/fha;->y:Landroid/view/View$OnTouchListener;

    invoke-virtual {p0, v0}, Lo/fha;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 211
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_1

    .line 212
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/fha;->setNestedScrollingEnabled(Z)V

    .line 214
    :cond_1
    invoke-direct {p0}, Lo/fha;->e()V

    .line 215
    return-void
.end method

.method private b(III)V
    .locals 4

    .line 579
    sub-int v1, p2, p3

    :goto_0
    add-int v0, p2, p3

    if-gt v1, v0, :cond_5

    .line 580
    sub-int v0, v1, p1

    invoke-virtual {p0, v0}, Lo/fha;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 581
    if-nez v2, :cond_0

    .line 582
    goto :goto_1

    .line 584
    :cond_0
    iget-object v0, p0, Lo/fha;->t:Lo/fgt;

    instance-of v0, v0, Lo/fgq;

    if-nez v0, :cond_1

    iget-object v0, p0, Lo/fha;->t:Lo/fgt;

    instance-of v0, v0, Lo/fgr;

    if-eqz v0, :cond_3

    .line 586
    .line 587
    :cond_1
    const/16 v0, 0x65

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/TextView;

    .line 588
    if-eqz v3, :cond_2

    .line 589
    invoke-direct {p0, v1, p2, v2, v3}, Lo/fha;->d(IILandroid/view/View;Landroid/widget/TextView;)V

    .line 591
    :cond_2
    goto :goto_1

    .line 592
    :cond_3
    invoke-static {v2}, Lo/fgx;->c(Landroid/view/View;)Landroid/widget/TextView;

    move-result-object v3

    .line 593
    if-eqz v3, :cond_4

    .line 594
    invoke-direct {p0, v1, p2, v2, v3}, Lo/fha;->d(IILandroid/view/View;Landroid/widget/TextView;)V

    .line 579
    :cond_4
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 598
    :cond_5
    return-void
.end method

.method static synthetic b(Lo/fha;I)V
    .locals 0

    .line 50
    invoke-super {p0, p1}, Landroid/widget/ListView;->setSelection(I)V

    return-void
.end method

.method static synthetic b(Lo/fha;Z)V
    .locals 0

    .line 50
    invoke-direct {p0, p1}, Lo/fha;->a(Z)V

    return-void
.end method

.method static synthetic c(Lo/fha;F)I
    .locals 1

    .line 50
    invoke-direct {p0, p1}, Lo/fha;->a(F)I

    move-result v0

    return v0
.end method

.method static synthetic c(Lo/fha;I)I
    .locals 0

    .line 50
    iput p1, p0, Lo/fha;->a:I

    return p1
.end method

.method static synthetic c(Lo/fha;)Lo/fha$a;
    .locals 1

    .line 50
    iget-object v0, p0, Lo/fha;->r:Lo/fha$a;

    return-object v0
.end method

.method static synthetic c(Lo/fha;III)V
    .locals 0

    .line 50
    invoke-direct {p0, p1, p2, p3}, Lo/fha;->b(III)V

    return-void
.end method

.method static synthetic d(Lo/fha;)Ljava/util/HashMap;
    .locals 1

    .line 50
    iget-object v0, p0, Lo/fha;->q:Ljava/util/HashMap;

    return-object v0
.end method

.method private d(IILandroid/view/View;Landroid/widget/TextView;)V
    .locals 10

    .line 610
    if-ne p2, p1, :cond_5

    .line 611
    iget-object v0, p0, Lo/fha;->o:Lo/fha$c;

    iget v0, v0, Lo/fha$c;->e:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lo/fha;->o:Lo/fha$c;

    iget v6, v0, Lo/fha$c;->e:I

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo/fha;->o:Lo/fha$c;

    iget v0, v0, Lo/fha$c;->b:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lo/fha;->o:Lo/fha$c;

    iget v6, v0, Lo/fha$c;->b:I

    goto :goto_0

    :cond_1
    const/high16 v6, -0x1000000

    .line 614
    :goto_0
    iget-object v0, p0, Lo/fha;->o:Lo/fha$c;

    iget v0, v0, Lo/fha$c;->c:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lo/fha;->o:Lo/fha$c;

    iget v0, v0, Lo/fha$c;->c:I

    int-to-float v7, v0

    goto :goto_1

    :cond_2
    const/high16 v7, 0x41900000    # 18.0f

    .line 615
    :goto_1
    iget-object v0, p0, Lo/fha;->o:Lo/fha$c;

    iget v0, v0, Lo/fha$c;->f:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Lo/fha;->o:Lo/fha$c;

    iget v0, v0, Lo/fha$c;->f:I

    int-to-float v8, v0

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lo/fha;->o:Lo/fha$c;

    iget v0, v0, Lo/fha$c;->i:F

    const/high16 v1, -0x40800000    # -1.0f

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_4

    iget-object v0, p0, Lo/fha;->o:Lo/fha$c;

    iget v0, v0, Lo/fha$c;->i:F

    mul-float v8, v7, v0

    goto :goto_2

    :cond_4
    move v8, v7

    .line 618
    :goto_2
    move-object v0, p0

    move-object v1, p3

    move-object v2, p4

    move v3, v6

    move v4, v8

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-direct/range {v0 .. v5}, Lo/fha;->a(Landroid/view/View;Landroid/widget/TextView;IFF)V

    .line 619
    goto :goto_6

    .line 620
    :cond_5
    iget-object v0, p0, Lo/fha;->o:Lo/fha$c;

    iget v0, v0, Lo/fha$c;->b:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_6

    iget-object v0, p0, Lo/fha;->o:Lo/fha$c;

    iget v6, v0, Lo/fha$c;->b:I

    goto :goto_3

    :cond_6
    const/high16 v6, -0x1000000

    .line 622
    :goto_3
    iget-object v0, p0, Lo/fha;->o:Lo/fha$c;

    iget v0, v0, Lo/fha$c;->c:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_7

    iget-object v0, p0, Lo/fha;->o:Lo/fha$c;

    iget v0, v0, Lo/fha$c;->c:I

    int-to-float v7, v0

    goto :goto_4

    :cond_7
    const/high16 v7, 0x41700000    # 15.0f

    .line 624
    :goto_4
    sub-int v0, p1, p2

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v8

    .line 625
    iget-object v0, p0, Lo/fha;->o:Lo/fha$c;

    iget v0, v0, Lo/fha$c;->h:F

    const/high16 v1, -0x40800000    # -1.0f

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_8

    iget-object v0, p0, Lo/fha;->o:Lo/fha$c;

    iget v0, v0, Lo/fha$c;->h:F

    float-to-double v0, v0

    goto :goto_5

    :cond_8
    const-wide v0, 0x3fe6666660000000L    # 0.699999988079071

    :goto_5
    int-to-double v2, v8

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    double-to-float v9, v0

    .line 627
    move-object v0, p0

    move-object v1, p3

    move-object v2, p4

    move v3, v6

    move v4, v7

    move v5, v9

    invoke-direct/range {v0 .. v5}, Lo/fha;->a(Landroid/view/View;Landroid/widget/TextView;IFF)V

    .line 629
    :goto_6
    return-void
.end method

.method static synthetic d(Lo/fha;I)V
    .locals 0

    .line 50
    invoke-super {p0, p1}, Landroid/widget/ListView;->setSelection(I)V

    return-void
.end method

.method private e(I)I
    .locals 4

    .line 417
    iget-object v0, p0, Lo/fha;->c:Ljava/util/List;

    invoke-static {v0}, Lo/fgx;->a(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 418
    const/4 v0, 0x0

    return v0

    .line 420
    :cond_0
    iget-boolean v0, p0, Lo/fha;->b:Z

    if-eqz v0, :cond_1

    .line 421
    iget-object v0, p0, Lo/fha;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const v1, 0x3fffffff    # 1.9999999f

    div-int v3, v1, v0

    .line 422
    iget-object v0, p0, Lo/fha;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    mul-int/2addr v0, v3

    add-int/2addr v0, p1

    iget v1, p0, Lo/fha;->e:I

    div-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    return v0

    .line 424
    :cond_1
    return p1
.end method

.method static synthetic e(Lo/fha;I)I
    .locals 1

    .line 50
    invoke-direct {p0, p1}, Lo/fha;->e(I)I

    move-result v0

    return v0
.end method

.method static synthetic e(Lo/fha;)Lo/fha;
    .locals 1

    .line 50
    iget-object v0, p0, Lo/fha;->p:Lo/fha;

    return-object v0
.end method

.method private e()V
    .locals 2

    .line 218
    invoke-virtual {p0}, Lo/fha;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lo/fha$4;

    invoke-direct {v1, p0}, Lo/fha$4;-><init>(Lo/fha;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 242
    return-void
.end method

.method static synthetic f(Lo/fha;)I
    .locals 1

    .line 50
    iget v0, p0, Lo/fha;->e:I

    return v0
.end method

.method static synthetic h(Lo/fha;)I
    .locals 1

    .line 50
    iget v0, p0, Lo/fha;->a:I

    return v0
.end method

.method static synthetic k(Lo/fha;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Lo/fha;->a()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<TT;>;)V"
        }
    .end annotation

    .line 347
    invoke-static {p1}, Lo/fgx;->a(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 348
    new-instance v0, Lo/fhf;

    const-string v1, "join map data is error."

    invoke-direct {v0, v1}, Lo/fhf;-><init>(Ljava/lang/String;)V

    throw v0

    .line 350
    :cond_0
    new-instance v0, Lo/fha$7;

    invoke-direct {v0, p0, p1}, Lo/fha$7;-><init>(Lo/fha;Ljava/util/List;)V

    const-wide/16 v1, 0xa

    invoke-virtual {p0, v0, v1, v2}, Lo/fha;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 358
    return-void
.end method

.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 8

    .line 648
    invoke-super {p0, p1}, Landroid/widget/ListView;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 649
    iget-object v0, p0, Lo/fha;->g:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 650
    new-instance v5, Landroid/graphics/Rect;

    iget v0, p0, Lo/fha;->a:I

    iget v1, p0, Lo/fha;->e:I

    div-int/lit8 v1, v1, 0x2

    mul-int/2addr v0, v1

    .line 651
    invoke-virtual {p0}, Lo/fha;->getWidth()I

    move-result v1

    iget v2, p0, Lo/fha;->a:I

    iget v3, p0, Lo/fha;->e:I

    div-int/lit8 v3, v3, 0x2

    add-int/lit8 v3, v3, 0x1

    mul-int/2addr v2, v3

    const/4 v3, 0x0

    invoke-direct {v5, v3, v0, v1, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 652
    iget-object v0, p0, Lo/fha;->m:Landroid/graphics/Paint;

    iget v1, p0, Lo/fha;->k:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 653
    iget-object v0, p0, Lo/fha;->m:Landroid/graphics/Paint;

    iget v1, p0, Lo/fha;->i:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 654
    iget-object v0, p0, Lo/fha;->m:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v6

    .line 655
    iget v0, v5, Landroid/graphics/Rect;->bottom:I

    iget v1, v5, Landroid/graphics/Rect;->top:I

    add-int/2addr v0, v1

    iget v1, v6, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    sub-int/2addr v0, v1

    iget v1, v6, Landroid/graphics/Paint$FontMetricsInt;->top:I

    sub-int/2addr v0, v1

    div-int/lit8 v7, v0, 0x2

    .line 657
    iget-object v0, p0, Lo/fha;->m:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 658
    iget-object v0, p0, Lo/fha;->g:Ljava/lang/String;

    invoke-virtual {v5}, Landroid/graphics/Rect;->centerX()I

    move-result v1

    iget v2, p0, Lo/fha;->f:I

    add-int/2addr v1, v2

    int-to-float v1, v1

    int-to-float v2, v7

    iget-object v3, p0, Lo/fha;->m:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 661
    :cond_0
    return-void
.end method

.method public getCurrentPosition()I
    .locals 1

    .line 433
    iget v0, p0, Lo/fha;->d:I

    return v0
.end method

.method public getSelection()I
    .locals 1

    .line 366
    iget v0, p0, Lo/fha;->h:I

    return v0
.end method

.method public getSelectionItem()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 442
    invoke-virtual {p0}, Lo/fha;->getCurrentPosition()I

    move-result v1

    .line 443
    if-gez v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    move v1, v0

    .line 444
    iget-object v0, p0, Lo/fha;->c:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/fha;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v1, :cond_1

    .line 445
    iget-object v0, p0, Lo/fha;->c:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 447
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSkin()Lo/fha$d;
    .locals 1

    .line 281
    iget-object v0, p0, Lo/fha;->n:Lo/fha$d;

    return-object v0
.end method

.method public getStyle()Lo/fha$c;
    .locals 1

    .line 250
    iget-object v0, p0, Lo/fha;->o:Lo/fha$c;

    return-object v0
.end method

.method public getWheelCount()I
    .locals 1

    .line 516
    iget-object v0, p0, Lo/fha;->c:Ljava/util/List;

    invoke-static {v0}, Lo/fgx;->a(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/fha;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic setAdapter(Landroid/widget/Adapter;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 50
    move-object v0, p1

    check-cast v0, Landroid/widget/ListAdapter;

    invoke-virtual {p0, v0}, Lo/fha;->setAdapter(Landroid/widget/ListAdapter;)V

    return-void
.end method

.method public setAdapter(Landroid/widget/ListAdapter;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 458
    if-eqz p1, :cond_0

    instance-of v0, p1, Lo/fgt;

    if-eqz v0, :cond_0

    .line 459
    move-object v0, p1

    check-cast v0, Lo/fgt;

    invoke-virtual {p0, v0}, Lo/fha;->setWheelAdapter(Lo/fgt;)V

    goto :goto_0

    .line 461
    :cond_0
    new-instance v0, Lo/fhf;

    const-string v1, "please invoke setWheelAdapter method."

    invoke-direct {v0, v1}, Lo/fhf;-><init>(Ljava/lang/String;)V

    throw v0

    .line 464
    :goto_0
    return-void
.end method

.method public setExtraText(Ljava/lang/String;III)V
    .locals 0

    .line 504
    iput-object p1, p0, Lo/fha;->g:Ljava/lang/String;

    .line 505
    iput p2, p0, Lo/fha;->i:I

    .line 506
    iput p3, p0, Lo/fha;->k:I

    .line 507
    iput p4, p0, Lo/fha;->f:I

    .line 508
    return-void
.end method

.method public setLoop(Z)V
    .locals 1

    .line 317
    iget-boolean v0, p0, Lo/fha;->b:Z

    if-eq p1, v0, :cond_0

    .line 318
    iput-boolean p1, p0, Lo/fha;->b:Z

    .line 319
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/fha;->setSelection(I)V

    .line 320
    iget-object v0, p0, Lo/fha;->t:Lo/fgt;

    if-eqz v0, :cond_0

    .line 321
    iget-object v0, p0, Lo/fha;->t:Lo/fgt;

    invoke-virtual {v0, p1}, Lo/fgt;->d(Z)Lo/fgt;

    .line 324
    :cond_0
    return-void
.end method

.method public setOnWheelItemClickListener(Lo/fha$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/fha$b<TT;>;)V"
        }
    .end annotation

    .line 188
    iput-object p1, p0, Lo/fha;->u:Lo/fha$b;

    .line 189
    return-void
.end method

.method public setOnWheelItemSelectedListener(Lo/fha$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/fha$a<TT;>;)V"
        }
    .end annotation

    .line 179
    iput-object p1, p0, Lo/fha;->r:Lo/fha$a;

    .line 180
    return-void
.end method

.method public setSelection(I)V
    .locals 3

    .line 376
    iput p1, p0, Lo/fha;->h:I

    .line 377
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lo/fha;->setVisibility(I)V

    .line 378
    new-instance v0, Lo/fha$8;

    invoke-direct {v0, p0, p1}, Lo/fha$8;-><init>(Lo/fha;I)V

    const-wide/16 v1, 0x1f4

    invoke-virtual {p0, v0, v1, v2}, Lo/fha;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 386
    return-void
.end method

.method public setSkin(Lo/fha$d;)V
    .locals 1

    .line 290
    invoke-static {p1}, Lo/fjd;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fha$d;

    iput-object v0, p0, Lo/fha;->n:Lo/fha$d;

    .line 292
    return-void
.end method

.method public final setStyle(Lo/fha$c;)V
    .locals 1

    .line 260
    invoke-static {p1}, Lo/fjd;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fha$c;

    iput-object v0, p0, Lo/fha;->o:Lo/fha$c;

    .line 261
    return-void
.end method

.method public setWheelAdapter(Lo/fgt;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/fgt<TT;>;)V"
        }
    .end annotation

    .line 473
    invoke-super {p0, p1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 474
    iput-object p1, p0, Lo/fha;->t:Lo/fgt;

    .line 475
    iget-object v0, p0, Lo/fha;->t:Lo/fgt;

    iget-object v1, p0, Lo/fha;->c:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/fgt;->c(Ljava/util/List;)Lo/fgt;

    move-result-object v0

    iget v1, p0, Lo/fha;->e:I

    invoke-virtual {v0, v1}, Lo/fgt;->b(I)Lo/fgt;

    move-result-object v0

    iget-boolean v1, p0, Lo/fha;->b:Z

    invoke-virtual {v0, v1}, Lo/fgt;->d(Z)Lo/fgt;

    move-result-object v0

    iget-boolean v1, p0, Lo/fha;->l:Z

    invoke-virtual {v0, v1}, Lo/fgt;->a(Z)Lo/fgt;

    .line 476
    return-void
.end method

.method public setWheelClickable(Z)V
    .locals 1

    .line 333
    iget-boolean v0, p0, Lo/fha;->l:Z

    if-eq p1, v0, :cond_0

    .line 334
    iput-boolean p1, p0, Lo/fha;->l:Z

    .line 335
    iget-object v0, p0, Lo/fha;->t:Lo/fgt;

    if-eqz v0, :cond_0

    .line 336
    iget-object v0, p0, Lo/fha;->t:Lo/fgt;

    invoke-virtual {v0, p1}, Lo/fgt;->a(Z)Lo/fgt;

    .line 339
    :cond_0
    return-void
.end method

.method public setWheelData(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<TT;>;)V"
        }
    .end annotation

    .line 485
    invoke-static {p1}, Lo/fgx;->a(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 486
    new-instance v0, Lo/fhf;

    const-string v1, "wheel datas are error."

    invoke-direct {v0, v1}, Lo/fhf;-><init>(Ljava/lang/String;)V

    throw v0

    .line 488
    :cond_0
    iput-object p1, p0, Lo/fha;->c:Ljava/util/List;

    .line 489
    iget-object v0, p0, Lo/fha;->t:Lo/fgt;

    if-eqz v0, :cond_1

    .line 490
    iget-object v0, p0, Lo/fha;->t:Lo/fgt;

    invoke-virtual {v0, p1}, Lo/fgt;->c(Ljava/util/List;)Lo/fgt;

    .line 492
    :cond_1
    return-void
.end method

.method public setWheelSize(I)V
    .locals 2

    .line 301
    and-int/lit8 v0, p1, 0x1

    if-nez v0, :cond_0

    .line 302
    new-instance v0, Lo/fhf;

    const-string v1, "wheel size must be an odd number."

    invoke-direct {v0, v1}, Lo/fhf;-><init>(Ljava/lang/String;)V

    throw v0

    .line 304
    :cond_0
    iput p1, p0, Lo/fha;->e:I

    .line 305
    iget-object v0, p0, Lo/fha;->t:Lo/fgt;

    if-eqz v0, :cond_1

    .line 306
    iget-object v0, p0, Lo/fha;->t:Lo/fgt;

    invoke-virtual {v0, p1}, Lo/fgt;->b(I)Lo/fgt;

    .line 308
    :cond_1
    return-void
.end method
