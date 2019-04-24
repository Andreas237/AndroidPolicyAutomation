.class public abstract Lo/eih;
.super Lo/eie;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/eih$f;,
        Lo/eih$p;,
        Lo/eih$b;,
        Lo/eih$d;,
        Lo/eih$a;,
        Lo/eih$k;,
        Lo/eih$o;,
        Lo/eih$i;,
        Lo/eih$e;,
        Lo/eih$m;,
        Lo/eih$g;,
        Lo/eih$l;,
        Lo/eih$u;,
        Lo/eih$q;,
        Lo/eih$r;,
        Lo/eih$s;,
        Lo/eih$t;,
        Lo/eih$n;,
        Lo/eih$h;,
        Lo/eih$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:Lo/eik<+Lo/ejl<+Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;>;>;>Lo/eie<TT;>;"
    }
.end annotation


# instance fields
.field private a:Lo/eix;

.field protected aA:F

.field private aB:Z

.field private aC:Lo/eih$d;

.field private aD:Lo/eih$a;

.field private aE:Lo/eih$o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/eih<TT;>.o;"
        }
    .end annotation
.end field

.field private aF:Z

.field private aG:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/eih$m;>;"
        }
    .end annotation
.end field

.field private aH:Lo/eih$p;

.field private ab:Lo/eih$i;

.field protected as:Lo/eih$h;

.field protected au:Z

.field protected av:Lo/eih$c;

.field protected aw:F

.field protected ax:Lo/ekj;

.field protected ay:Lo/ekj;

.field private az:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 68
    invoke-direct {p0, p1}, Lo/eie;-><init>(Landroid/content/Context;)V

    .line 51
    sget-object v0, Lo/eix;->b:Lo/eix;

    iput-object v0, p0, Lo/eih;->a:Lo/eix;

    .line 57
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eih;->au:Z

    .line 71
    sget-object v0, Lo/eih$c;->a:Lo/eih$c;

    iput-object v0, p0, Lo/eih;->av:Lo/eih$c;

    .line 106
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eih;->as:Lo/eih$h;

    .line 156
    const/4 v0, 0x0

    iput v0, p0, Lo/eih;->az:I

    .line 463
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eih;->aB:Z

    .line 464
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eih;->aF:Z

    .line 866
    const v0, -0x800001

    iput v0, p0, Lo/eih;->aw:F

    .line 867
    const v0, -0x800001

    iput v0, p0, Lo/eih;->aA:F

    .line 972
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eih;->aG:Ljava/util/List;

    .line 1296
    new-instance v0, Lo/ekj;

    invoke-direct {v0}, Lo/ekj;-><init>()V

    iput-object v0, p0, Lo/eih;->ay:Lo/ekj;

    .line 1298
    new-instance v0, Lo/ekj;

    invoke-direct {v0}, Lo/ekj;-><init>()V

    iput-object v0, p0, Lo/eih;->ax:Lo/ekj;

    .line 1300
    new-instance v0, Lo/eih$o;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/eih$o;-><init>(Lo/eih;Lo/eih$4;)V

    iput-object v0, p0, Lo/eih;->aE:Lo/eih$o;

    .line 1353
    new-instance v0, Lo/eih$1;

    invoke-direct {v0, p0}, Lo/eih$1;-><init>(Lo/eih;)V

    iput-object v0, p0, Lo/eih;->aD:Lo/eih$a;

    .line 1360
    new-instance v0, Lo/eih$3;

    invoke-direct {v0, p0}, Lo/eih$3;-><init>(Lo/eih;)V

    iput-object v0, p0, Lo/eih;->aC:Lo/eih$d;

    .line 1748
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eih;->aH:Lo/eih$p;

    .line 69
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 64
    invoke-direct {p0, p1, p2}, Lo/eie;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 51
    sget-object v0, Lo/eix;->b:Lo/eix;

    iput-object v0, p0, Lo/eih;->a:Lo/eix;

    .line 57
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eih;->au:Z

    .line 71
    sget-object v0, Lo/eih$c;->a:Lo/eih$c;

    iput-object v0, p0, Lo/eih;->av:Lo/eih$c;

    .line 106
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eih;->as:Lo/eih$h;

    .line 156
    const/4 v0, 0x0

    iput v0, p0, Lo/eih;->az:I

    .line 463
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eih;->aB:Z

    .line 464
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eih;->aF:Z

    .line 866
    const v0, -0x800001

    iput v0, p0, Lo/eih;->aw:F

    .line 867
    const v0, -0x800001

    iput v0, p0, Lo/eih;->aA:F

    .line 972
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eih;->aG:Ljava/util/List;

    .line 1296
    new-instance v0, Lo/ekj;

    invoke-direct {v0}, Lo/ekj;-><init>()V

    iput-object v0, p0, Lo/eih;->ay:Lo/ekj;

    .line 1298
    new-instance v0, Lo/ekj;

    invoke-direct {v0}, Lo/ekj;-><init>()V

    iput-object v0, p0, Lo/eih;->ax:Lo/ekj;

    .line 1300
    new-instance v0, Lo/eih$o;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/eih$o;-><init>(Lo/eih;Lo/eih$4;)V

    iput-object v0, p0, Lo/eih;->aE:Lo/eih$o;

    .line 1353
    new-instance v0, Lo/eih$1;

    invoke-direct {v0, p0}, Lo/eih$1;-><init>(Lo/eih;)V

    iput-object v0, p0, Lo/eih;->aD:Lo/eih$a;

    .line 1360
    new-instance v0, Lo/eih$3;

    invoke-direct {v0, p0}, Lo/eih$3;-><init>(Lo/eih;)V

    iput-object v0, p0, Lo/eih;->aC:Lo/eih$d;

    .line 1748
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eih;->aH:Lo/eih$p;

    .line 65
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 60
    invoke-direct {p0, p1, p2, p3}, Lo/eie;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 51
    sget-object v0, Lo/eix;->b:Lo/eix;

    iput-object v0, p0, Lo/eih;->a:Lo/eix;

    .line 57
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eih;->au:Z

    .line 71
    sget-object v0, Lo/eih$c;->a:Lo/eih$c;

    iput-object v0, p0, Lo/eih;->av:Lo/eih$c;

    .line 106
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eih;->as:Lo/eih$h;

    .line 156
    const/4 v0, 0x0

    iput v0, p0, Lo/eih;->az:I

    .line 463
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eih;->aB:Z

    .line 464
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eih;->aF:Z

    .line 866
    const v0, -0x800001

    iput v0, p0, Lo/eih;->aw:F

    .line 867
    const v0, -0x800001

    iput v0, p0, Lo/eih;->aA:F

    .line 972
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eih;->aG:Ljava/util/List;

    .line 1296
    new-instance v0, Lo/ekj;

    invoke-direct {v0}, Lo/ekj;-><init>()V

    iput-object v0, p0, Lo/eih;->ay:Lo/ekj;

    .line 1298
    new-instance v0, Lo/ekj;

    invoke-direct {v0}, Lo/ekj;-><init>()V

    iput-object v0, p0, Lo/eih;->ax:Lo/ekj;

    .line 1300
    new-instance v0, Lo/eih$o;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/eih$o;-><init>(Lo/eih;Lo/eih$4;)V

    iput-object v0, p0, Lo/eih;->aE:Lo/eih$o;

    .line 1353
    new-instance v0, Lo/eih$1;

    invoke-direct {v0, p0}, Lo/eih$1;-><init>(Lo/eih;)V

    iput-object v0, p0, Lo/eih;->aD:Lo/eih$a;

    .line 1360
    new-instance v0, Lo/eih$3;

    invoke-direct {v0, p0}, Lo/eih$3;-><init>(Lo/eih;)V

    iput-object v0, p0, Lo/eih;->aC:Lo/eih$d;

    .line 1748
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eih;->aH:Lo/eih$p;

    .line 61
    return-void
.end method

.method static synthetic b(Lo/eih;)Lo/ln;
    .locals 1

    .line 48
    iget-object v0, p0, Lo/eih;->H:Lo/ln;

    return-object v0
.end method

.method private b(II)V
    .locals 2

    .line 150
    iput p2, p0, Lo/eih;->az:I

    .line 151
    iget-object v0, p0, Lo/eih;->av:Lo/eih$c;

    sget-object v1, Lo/eih$c;->e:Lo/eih$c;

    if-ne v0, v1, :cond_0

    .line 152
    iget-object v0, p0, Lo/eih;->x:Lo/nu;

    check-cast v0, Lo/eil;

    invoke-virtual {v0, p1, p2}, Lo/eil;->e(II)V

    .line 154
    :cond_0
    return-void
.end method

.method static synthetic c(Lo/eih;)Lo/ln;
    .locals 1

    .line 48
    iget-object v0, p0, Lo/eih;->H:Lo/ln;

    return-object v0
.end method

.method static synthetic d(Lo/eih;)Lo/ln;
    .locals 1

    .line 48
    iget-object v0, p0, Lo/eih;->H:Lo/ln;

    return-object v0
.end method

.method static synthetic e(Lo/eih;)Lo/eih$o;
    .locals 1

    .line 48
    iget-object v0, p0, Lo/eih;->aE:Lo/eih$o;

    return-object v0
.end method

.method private g(Z)I
    .locals 2

    .line 1185
    invoke-virtual {p0}, Lo/eih;->ac()Z

    move-result v1

    .line 1187
    if-nez v1, :cond_1

    .line 1188
    if-nez p1, :cond_0

    .line 1189
    invoke-virtual {p0}, Lo/eih;->getCurrentPagerStartX()I

    move-result v0

    goto :goto_0

    .line 1191
    :cond_0
    invoke-virtual {p0}, Lo/eih;->getNextPagerStartX()I

    move-result v0

    .line 1193
    :goto_0
    return v0

    .line 1196
    :cond_1
    if-nez p1, :cond_2

    .line 1197
    invoke-virtual {p0}, Lo/eih;->getLastPagerStartX()I

    move-result v0

    goto :goto_1

    .line 1199
    :cond_2
    invoke-virtual {p0}, Lo/eih;->getNextPagerStartX()I

    move-result v0

    .line 1201
    :goto_1
    return v0
.end method

.method private h(I)I
    .locals 9

    .line 1837
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 1838
    int-to-long v0, p1

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 1840
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1841
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1842
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1843
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1844
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1846
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v5, v0

    .line 1848
    const/4 v0, 0x2

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 1849
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v6, v0

    .line 1851
    sub-int v0, v5, p1

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v7

    .line 1852
    sub-int v0, v6, p1

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v8

    .line 1854
    if-gt v7, v8, :cond_1

    .line 1855
    int-to-float v0, v7

    const/high16 v1, 0x40a00000    # 5.0f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 1856
    return v5

    .line 1858
    :cond_0
    return p1

    .line 1860
    :cond_1
    int-to-float v0, v8

    const/high16 v1, 0x40a00000    # 5.0f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    .line 1861
    return v6

    .line 1863
    :cond_2
    return p1
.end method


# virtual methods
.method protected F()V
    .locals 11

    .line 476
    iget-object v0, p0, Lo/eih;->av:Lo/eih$c;

    sget-object v1, Lo/eih$c;->a:Lo/eih$c;

    if-ne v0, v1, :cond_0

    .line 477
    invoke-super {p0}, Lo/eie;->F()V

    .line 478
    return-void

    .line 482
    :cond_0
    iget-object v0, p0, Lo/eih;->O:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->f()F

    move-result v4

    .line 483
    iget-object v0, p0, Lo/eih;->O:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->h()F

    move-result v5

    .line 485
    const/4 v0, 0x4

    new-array v6, v0, [F

    const/4 v0, 0x0

    aput v4, v6, v0

    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v6, v1

    const/4 v0, 0x2

    aput v5, v6, v0

    const/4 v0, 0x0

    const/4 v1, 0x3

    aput v0, v6, v1

    .line 488
    iget-object v0, p0, Lo/eih;->aj:Lo/eim;

    invoke-virtual {v0, v6}, Lo/eim;->d([F)V

    .line 490
    const/4 v0, 0x0

    aget v7, v6, v0

    .line 491
    const/4 v0, 0x2

    aget v8, v6, v0

    .line 495
    cmpg-float v0, v7, v8

    if-gtz v0, :cond_1

    .line 496
    float-to-int v9, v7

    .line 497
    float-to-int v10, v8

    goto :goto_0

    .line 499
    :cond_1
    float-to-int v9, v8

    .line 500
    float-to-int v10, v7

    .line 503
    :goto_0
    iget-object v0, p0, Lo/eih;->ad:Lo/eit;

    invoke-virtual {v0}, Lo/eit;->B()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 504
    iget-object v0, p0, Lo/eih;->ae:Lo/eir;

    iget-object v1, p0, Lo/eih;->ad:Lo/eit;

    iget v1, v1, Lo/eit;->q:F

    iget-object v2, p0, Lo/eih;->ad:Lo/eit;

    iget v2, v2, Lo/eit;->u:F

    iget-object v3, p0, Lo/eih;->ad:Lo/eit;

    invoke-virtual {v3}, Lo/eit;->E()Z

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lo/eir;->d(FFZ)V

    .line 506
    :cond_2
    iget-object v0, p0, Lo/eih;->af:Lo/eit;

    invoke-virtual {v0}, Lo/eit;->B()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 507
    iget-object v0, p0, Lo/eih;->am:Lo/eir;

    iget-object v1, p0, Lo/eih;->af:Lo/eit;

    iget v1, v1, Lo/eit;->q:F

    iget-object v2, p0, Lo/eih;->af:Lo/eit;

    iget v2, v2, Lo/eit;->u:F

    iget-object v3, p0, Lo/eih;->af:Lo/eit;

    invoke-virtual {v3}, Lo/eit;->E()Z

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lo/eir;->d(FFZ)V

    .line 509
    :cond_3
    iget-object v0, p0, Lo/eih;->ah:Lo/eit;

    invoke-virtual {v0}, Lo/eit;->B()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 510
    iget-object v0, p0, Lo/eih;->ai:Lo/eir;

    iget-object v1, p0, Lo/eih;->ah:Lo/eit;

    iget v1, v1, Lo/eit;->q:F

    iget-object v2, p0, Lo/eih;->ah:Lo/eit;

    iget v2, v2, Lo/eit;->u:F

    iget-object v3, p0, Lo/eih;->ah:Lo/eit;

    invoke-virtual {v3}, Lo/eit;->E()Z

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lo/eir;->d(FFZ)V

    .line 512
    :cond_4
    iget-object v0, p0, Lo/eih;->H:Lo/ln;

    invoke-virtual {v0}, Lo/ln;->B()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 513
    iget-object v0, p0, Lo/eih;->x:Lo/nu;

    int-to-float v1, v9

    int-to-float v2, v10

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/nu;->d(FFZ)V

    .line 514
    :cond_5
    return-void
.end method

.method protected V()Z
    .locals 2

    .line 2123
    iget-object v0, p0, Lo/eih;->av:Lo/eih$c;

    sget-object v1, Lo/eih$c;->a:Lo/eih$c;

    if-ne v0, v1, :cond_0

    .line 2125
    const/4 v0, 0x0

    return v0

    .line 2128
    :cond_0
    iget-object v0, p0, Lo/eih;->as:Lo/eih$h;

    if-nez v0, :cond_1

    .line 2130
    const/4 v0, 0x1

    return v0

    .line 2132
    :cond_1
    invoke-super {p0}, Lo/eie;->V()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/eih;->as:Lo/eih$h;

    invoke-interface {v0}, Lo/eih$h;->h()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public Y()F
    .locals 1

    .line 874
    iget v0, p0, Lo/eih;->aw:F

    return v0
.end method

.method public Z()Lo/eih$c;
    .locals 1

    .line 517
    iget-object v0, p0, Lo/eih;->av:Lo/eih$c;

    return-object v0
.end method

.method public a(Lo/eih$e;)F
    .locals 5

    .line 1021
    invoke-virtual {p0}, Lo/eih;->getData()Lo/ma;

    move-result-object v1

    .line 1022
    invoke-virtual {v1}, Lo/ma;->h()Ljava/util/List;

    move-result-object v2

    .line 1023
    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 1024
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 1027
    :cond_1
    const/4 v0, 0x0

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/ejl;

    .line 1029
    invoke-interface {v3, p0, p1}, Lo/ejl;->e(Lo/eih;Lo/eih$e;)F

    move-result v4

    .line 1031
    return v4
.end method

.method protected a(I)I
    .locals 9

    .line 1809
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 1810
    int-to-long v0, p1

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 1811
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1812
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1813
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1814
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1816
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v5, v0

    .line 1818
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 1819
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v6, v0

    .line 1821
    sub-int v0, v5, p1

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v7

    .line 1822
    sub-int v0, v6, p1

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v8

    .line 1824
    if-gt v7, v8, :cond_1

    .line 1825
    int-to-float v0, v7

    const/high16 v1, 0x40a00000    # 5.0f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 1826
    return v5

    .line 1828
    :cond_0
    return p1

    .line 1830
    :cond_1
    int-to-float v0, v8

    const/high16 v1, 0x40a00000    # 5.0f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    .line 1831
    return v6

    .line 1833
    :cond_2
    return p1
.end method

.method public a(Lo/eih$k;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/eih<TT;>.k;)V"
        }
    .end annotation

    .line 1213
    iget-object v0, p0, Lo/eih;->aD:Lo/eih$a;

    iget-object v1, p0, Lo/eih;->aC:Lo/eih$d;

    invoke-virtual {p0, p1, v0, v1}, Lo/eih;->e(Lo/eih$k;Lo/eih$a;Lo/eih$d;)V

    .line 1214
    return-void
.end method

.method public a(Lo/eih$k;Lo/eih$a;Lo/eih$d;)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/eih<TT;>.k;Lo/eih$a;Lo/eih$d;)V"
        }
    .end annotation

    .line 1102
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eih;->aE:Lo/eih$o;

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Lo/eih$o;->b(Lo/eih$k;)V

    .line 1104
    move-object/from16 v0, p0

    iget-object v9, v0, Lo/eih;->a:Lo/eix;

    .line 1105
    sget-object v0, Lo/eix;->c:Lo/eix;

    if-ne v9, v0, :cond_0

    const/4 v10, 0x1

    goto :goto_0

    :cond_0
    const/4 v10, 0x0

    .line 1108
    :goto_0
    if-eqz v10, :cond_1

    .line 1109
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eih;->H:Lo/ln;

    check-cast v0, Lo/eio;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/eio;->k(Z)V

    .line 1112
    :cond_1
    new-instance v11, Lo/eih$9;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct {v11, v1, v0, v10, v2}, Lo/eih$9;-><init>(Lo/eih;Landroid/os/Handler;ZLo/eih$k;)V

    .line 1132
    new-instance v12, Lo/eki$e;

    invoke-direct {v12}, Lo/eki$e;-><init>()V

    .line 1133
    invoke-virtual {v11, v12}, Lo/eki;->d(Lo/eki$b;)V

    .line 1139
    move-object/from16 v0, p0

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/eih;->g(Z)I

    move-result v13

    .line 1141
    invoke-virtual/range {p0 .. p0}, Lo/eih;->getData()Lo/ma;

    move-result-object v14

    .line 1142
    invoke-virtual {v14}, Lo/ma;->h()Ljava/util/List;

    move-result-object v15

    .line 1143
    invoke-interface {v15}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_1
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Lo/ejl;

    .line 1144
    int-to-float v0, v13

    move-object/from16 v1, p0

    iget v1, v1, Lo/eih;->az:I

    add-int/2addr v1, v13

    int-to-float v1, v1

    move-object/from16 v2, v17

    invoke-interface {v2, v0, v1}, Lo/ejl;->a(FF)F

    move-result v18

    .line 1145
    int-to-float v0, v13

    move-object/from16 v1, p0

    iget v1, v1, Lo/eih;->az:I

    add-int/2addr v1, v13

    int-to-float v1, v1

    move-object/from16 v2, v17

    invoke-interface {v2, v0, v1}, Lo/ejl;->d(FF)F

    move-result v19

    .line 1147
    move-object/from16 v0, v17

    move-object/from16 v1, p0

    move/from16 v2, v18

    move/from16 v3, v19

    invoke-interface {v0, v1, v2, v3}, Lo/ejl;->c(Lo/eih;FF)F

    move-result v20

    .line 1148
    move-object/from16 v0, v17

    move-object/from16 v1, p0

    move/from16 v2, v18

    move/from16 v3, v19

    invoke-interface {v0, v1, v2, v3}, Lo/ejl;->b(Lo/eih;FF)F

    move-result v21

    .line 1150
    new-instance v22, Lo/eki$e;

    invoke-direct/range {v22 .. v22}, Lo/eki$e;-><init>()V

    .line 1151
    move-object/from16 v0, v22

    invoke-virtual {v11, v0}, Lo/eki;->d(Lo/eki$b;)V

    .line 1153
    move-object/from16 v0, p0

    invoke-interface/range {v17 .. v17}, Lo/ejl;->e()Lo/eit$b;

    move-result-object v1

    move/from16 v2, v20

    move/from16 v3, v21

    new-instance v5, Lo/eih$12;

    move-object/from16 v4, p0

    move-object/from16 v6, v22

    invoke-direct {v5, v4, v11, v6}, Lo/eih$12;-><init>(Lo/eih;Lo/eki;Lo/eki$e;)V

    move-object/from16 v6, p2

    move-object/from16 v4, p0

    iget v4, v4, Lo/eih;->aw:F

    float-to-int v4, v4

    sub-int v4, v13, v4

    .line 1159
    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v4

    move-object/from16 v7, p3

    invoke-interface {v7, v4}, Lo/eih$d;->e(I)I

    move-result v7

    .line 1153
    const/4 v4, 0x0

    const/4 v8, 0x2

    invoke-virtual/range {v0 .. v8}, Lo/eih;->c(Lo/eit$b;FFZLo/eih$k;Lo/eih$a;II)V

    .line 1161
    goto/16 :goto_1

    .line 1163
    :cond_2
    new-instance v16, Lo/eki$e;

    invoke-direct/range {v16 .. v16}, Lo/eki$e;-><init>()V

    .line 1164
    move-object/from16 v0, v16

    invoke-virtual {v11, v0}, Lo/eki;->d(Lo/eki$b;)V

    .line 1166
    new-instance v0, Lo/eih$11;

    move-object/from16 v1, p0

    move-object/from16 v2, v16

    invoke-direct {v0, v1, v11, v2}, Lo/eih$11;-><init>(Lo/eih;Lo/eki;Lo/eki$e;)V

    move-object/from16 v1, p0

    iget v1, v1, Lo/eih;->aw:F

    float-to-int v1, v1

    sub-int v1, v13, v1

    .line 1172
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    move-object/from16 v2, p3

    invoke-interface {v2, v1}, Lo/eih$d;->e(I)I

    move-result v1

    .line 1166
    move-object/from16 v2, p0

    move-object/from16 v3, p2

    invoke-virtual {v2, v13, v0, v1, v3}, Lo/eih;->b(ILo/eih$k;ILo/eih$a;)Z

    .line 1174
    invoke-virtual {v11}, Lo/eki;->d()V

    .line 1175
    invoke-virtual {v11, v12}, Lo/eki;->c(Lo/eki$b;)V

    .line 1176
    return-void
.end method

.method public a(ZLo/eih$k;Lo/eih$a;II)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZLo/eih<TT;>.k;Lo/eih$a;II)V"
        }
    .end annotation

    .line 931
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eih;->aE:Lo/eih$o;

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Lo/eih$o;->b(Lo/eih$k;)V

    .line 932
    new-instance v9, Lo/eih$4;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    invoke-direct {v9, v1, v0, v2}, Lo/eih$4;-><init>(Lo/eih;Landroid/os/Handler;Lo/eih$k;)V

    .line 944
    new-instance v10, Lo/eki$e;

    invoke-direct {v10}, Lo/eki$e;-><init>()V

    .line 945
    invoke-virtual {v9, v10}, Lo/eki;->d(Lo/eki$b;)V

    .line 947
    invoke-virtual/range {p0 .. p0}, Lo/eih;->getData()Lo/ma;

    move-result-object v11

    .line 948
    invoke-virtual {v11}, Lo/ma;->h()Ljava/util/List;

    move-result-object v12

    .line 949
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_0
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lo/ejl;

    .line 950
    move-object/from16 v0, p0

    invoke-interface {v14, v0}, Lo/ejl;->c(Lo/eih;)F

    move-result v15

    .line 951
    move-object/from16 v0, p0

    invoke-interface {v14, v0}, Lo/ejl;->d(Lo/eih;)F

    move-result v16

    .line 952
    move-object/from16 v0, p0

    move/from16 v1, v16

    invoke-interface {v14, v0, v15, v1}, Lo/ejl;->c(Lo/eih;FF)F

    move-result v17

    .line 953
    move-object/from16 v0, p0

    move/from16 v1, v16

    invoke-interface {v14, v0, v15, v1}, Lo/ejl;->b(Lo/eih;FF)F

    move-result v18

    .line 954
    new-instance v19, Lo/eki$e;

    invoke-direct/range {v19 .. v19}, Lo/eki$e;-><init>()V

    .line 955
    move-object/from16 v0, v19

    invoke-virtual {v9, v0}, Lo/eki;->d(Lo/eki$b;)V

    .line 956
    move-object/from16 v0, p0

    invoke-interface {v14}, Lo/ejl;->e()Lo/eit$b;

    move-result-object v1

    move/from16 v2, v17

    move/from16 v3, v18

    move/from16 v4, p1

    new-instance v5, Lo/eih$8;

    move-object/from16 v6, p0

    move-object/from16 v7, v19

    invoke-direct {v5, v6, v9, v7}, Lo/eih$8;-><init>(Lo/eih;Lo/eki;Lo/eki$b;)V

    move-object/from16 v6, p3

    move/from16 v7, p4

    move/from16 v8, p5

    invoke-virtual/range {v0 .. v8}, Lo/eih;->c(Lo/eit$b;FFZLo/eih$k;Lo/eih$a;II)V

    .line 963
    goto :goto_0

    .line 964
    :cond_0
    invoke-virtual {v9}, Lo/eki;->d()V

    .line 965
    invoke-virtual {v9, v10}, Lo/eki;->c(Lo/eki$b;)V

    .line 966
    return-void
.end method

.method public aa()Lo/eih$h;
    .locals 1

    .line 138
    iget-object v0, p0, Lo/eih;->as:Lo/eih$h;

    return-object v0
.end method

.method public ab()Z
    .locals 1

    .line 143
    iget-object v0, p0, Lo/eih;->as:Lo/eih$h;

    invoke-interface {v0}, Lo/eih$h;->b()Z

    move-result v0

    return v0
.end method

.method public ac()Z
    .locals 1

    .line 74
    iget v0, p0, Lo/eih;->aw:F

    float-to-int v0, v0

    invoke-virtual {p0, v0}, Lo/eih;->d(I)Z

    move-result v0

    return v0
.end method

.method public ad()Z
    .locals 1

    .line 1373
    iget-boolean v0, p0, Lo/eih;->aB:Z

    return v0
.end method

.method public ae()V
    .locals 1

    .line 912
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/eih;->b(I)V

    .line 913
    return-void
.end method

.method public af()Z
    .locals 3

    .line 1377
    invoke-virtual {p0}, Lo/eih;->Y()F

    move-result v1

    .line 1379
    const v0, -0x800001

    cmpl-float v0, v1, v0

    if-nez v0, :cond_0

    .line 1380
    iget-object v0, p0, Lo/eih;->H:Lo/ln;

    invoke-virtual {v0}, Lo/ln;->s()F

    move-result v1

    .line 1383
    :cond_0
    move v2, v1

    .line 1386
    const v0, 0x4bb08ec0    # 2.314176E7f

    cmpg-float v0, v2, v0

    if-gtz v0, :cond_1

    .line 1387
    const/4 v0, 0x0

    return v0

    .line 1389
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public ag()F
    .locals 1

    .line 878
    iget v0, p0, Lo/eih;->aA:F

    return v0
.end method

.method public ah()Z
    .locals 1

    .line 1369
    iget-object v0, p0, Lo/eih;->aE:Lo/eih$o;

    invoke-virtual {v0}, Lo/eih$o;->d()Z

    move-result v0

    return v0
.end method

.method public ai()Z
    .locals 2

    .line 1879
    iget-object v0, p0, Lo/eih;->as:Lo/eih$h;

    if-nez v0, :cond_0

    .line 1880
    const/4 v0, 0x1

    return v0

    .line 1882
    :cond_0
    iget-object v0, p0, Lo/eih;->as:Lo/eih$h;

    invoke-interface {v0}, Lo/eih$h;->a()I

    move-result v0

    iget v1, p0, Lo/eih;->aw:F

    float-to-int v1, v1

    if-ne v0, v1, :cond_1

    .line 1883
    const/4 v0, 0x1

    return v0

    .line 1885
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public aj()Z
    .locals 1

    .line 1393
    iget-boolean v0, p0, Lo/eih;->aF:Z

    return v0
.end method

.method public ak()V
    .locals 5

    .line 1416
    iget-object v0, p0, Lo/eih;->A:Lo/ma;

    check-cast v0, Lo/eik;

    invoke-virtual {v0}, Lo/eik;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    .line 1417
    return-void

    .line 1419
    :cond_0
    iget-object v0, p0, Lo/eih;->A:Lo/ma;

    check-cast v0, Lo/eik;

    invoke-virtual {v0}, Lo/eik;->h()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/ejl;

    .line 1420
    invoke-interface {v2, p0}, Lo/ejl;->c(Lo/eih;)F

    move-result v3

    .line 1421
    invoke-interface {v2, p0}, Lo/ejl;->d(Lo/eih;)F

    move-result v4

    .line 1422
    invoke-interface {v2, p0, v3, v4}, Lo/ejl;->c(Lo/eih;FF)F

    move-result v3

    .line 1423
    iget-object v0, p0, Lo/eih;->ad:Lo/eit;

    invoke-virtual {v0, v3}, Lo/eit;->a(F)V

    .line 1426
    invoke-virtual {p0}, Lo/eih;->invalidate()V

    .line 1427
    return-void
.end method

.method public al()Z
    .locals 2

    .line 1894
    iget-object v0, p0, Lo/eih;->a:Lo/eix;

    sget-object v1, Lo/eix;->f:Lo/eix;

    if-ne v0, v1, :cond_0

    .line 1895
    const/4 v0, 0x0

    return v0

    .line 1897
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public am()Z
    .locals 3

    .line 1397
    invoke-virtual {p0}, Lo/eih;->Y()F

    move-result v1

    .line 1400
    const v0, -0x800001

    cmpl-float v0, v1, v0

    if-nez v0, :cond_0

    .line 1402
    iget-object v0, p0, Lo/eih;->H:Lo/ln;

    invoke-virtual {v0}, Lo/ln;->s()F

    move-result v1

    .line 1406
    :cond_0
    move v2, v1

    .line 1409
    iget-object v0, p0, Lo/eih;->as:Lo/eih$h;

    invoke-interface {v0}, Lo/eih$h;->a()I

    move-result v0

    int-to-float v0, v0

    cmpl-float v0, v2, v0

    if-ltz v0, :cond_1

    .line 1410
    const/4 v0, 0x0

    return v0

    .line 1412
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public an()V
    .locals 1

    .line 1952
    new-instance v0, Lo/eih$k;

    invoke-direct {v0, p0}, Lo/eih$k;-><init>(Lo/eih;)V

    invoke-virtual {p0, v0}, Lo/eih;->d(Lo/eih$k;)V

    .line 1953
    return-void
.end method

.method public aq()V
    .locals 1

    .line 2104
    iget-object v0, p0, Lo/eih;->S:Lo/nj;

    check-cast v0, Lo/eiu;

    invoke-interface {v0}, Lo/eiu;->c()V

    .line 2105
    return-void
.end method

.method protected b(F)I
    .locals 10

    .line 1495
    float-to-int v4, p1

    .line 1496
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    .line 1497
    int-to-long v0, v4

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 1498
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1499
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1500
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1501
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1502
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1504
    invoke-virtual {v5}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v6, v0

    .line 1506
    const/4 v0, 0x2

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 1507
    invoke-virtual {v5}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v7, v0

    .line 1509
    sub-int v0, v6, v4

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v8

    .line 1510
    sub-int v0, v7, v4

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v9

    .line 1512
    if-gt v8, v9, :cond_0

    .line 1513
    return v6

    .line 1515
    :cond_0
    return v7
.end method

.method public b(I)V
    .locals 2

    .line 916
    new-instance v0, Lo/eih$k;

    invoke-direct {v0, p0}, Lo/eih$k;-><init>(Lo/eih;)V

    iget-object v1, p0, Lo/eih;->aD:Lo/eih$a;

    invoke-virtual {p0, v0, v1, p1}, Lo/eih;->c(Lo/eih$k;Lo/eih$a;I)V

    .line 917
    return-void
.end method

.method public b(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/eib;>;)V"
        }
    .end annotation

    .line 2100
    iget-object v0, p0, Lo/eih;->S:Lo/nj;

    check-cast v0, Lo/eiu;

    invoke-interface {v0, p1}, Lo/eiu;->d(Ljava/util/List;)V

    .line 2101
    return-void
.end method

.method public b(Lo/eih$k;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/eih<TT;>.k;)V"
        }
    .end annotation

    .line 1091
    iget-object v0, p0, Lo/eih;->aD:Lo/eih$a;

    iget-object v1, p0, Lo/eih;->aC:Lo/eih$d;

    invoke-virtual {p0, p1, v0, v1}, Lo/eih;->a(Lo/eih$k;Lo/eih$a;Lo/eih$d;)V

    .line 1092
    return-void
.end method

.method protected b(ILo/eih$k;ILo/eih$a;)Z
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILo/eih<TT;>.k;ILo/eih$a;)Z"
        }
    .end annotation

    .line 1623
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eih;->aE:Lo/eih$o;

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Lo/eih$o;->b(Lo/eih$k;)V

    .line 1625
    move-object/from16 v0, p0

    iget v0, v0, Lo/eih;->aw:F

    move/from16 v1, p1

    int-to-float v1, v1

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 1627
    invoke-virtual/range {p2 .. p2}, Lo/eih$k;->e()V

    .line 1628
    const/4 v0, 0x0

    return v0

    .line 1630
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eih;->aE:Lo/eih$o;

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Lo/eih$o;->b(Lo/eih$k;)V

    .line 1632
    move-object/from16 v0, p0

    move/from16 v1, p1

    invoke-virtual {v0, v1}, Lo/eih;->d(I)Z

    move-result v10

    .line 1634
    new-instance v11, Lo/eih$f;

    const/4 v0, 0x0

    invoke-direct {v11, v0}, Lo/eih$f;-><init>(Lo/eih$4;)V

    .line 1635
    if-eqz v10, :cond_1

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eih;->a:Lo/eix;

    sget-object v1, Lo/eix;->d:Lo/eix;

    if-ne v0, v1, :cond_1

    .line 1637
    const/4 v0, 0x1

    iput-boolean v0, v11, Lo/eih$f;->e:Z

    .line 1638
    move-object/from16 v0, p0

    iget v0, v0, Lo/eih;->aA:F

    move-object/from16 v1, p0

    iget v1, v1, Lo/eih;->aw:F

    sub-float/2addr v0, v1

    float-to-int v0, v0

    int-to-long v0, v0

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-static {v0, v1}, Lo/ekg;->t(J)I

    move-result v0

    iput v0, v11, Lo/eih$f;->c:I

    .line 1639
    move/from16 v0, p1

    int-to-long v0, v0

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-static {v0, v1}, Lo/ekg;->m(J)I

    move-result v0

    iput v0, v11, Lo/eih$f;->d:I

    .line 1646
    iget v0, v11, Lo/eih$f;->c:I

    int-to-float v0, v0

    iget v1, v11, Lo/eih$f;->d:I

    int-to-float v1, v1

    const/high16 v2, 0x3f800000    # 1.0f

    div-float v1, v2, v1

    mul-float/2addr v0, v1

    iput v0, v11, Lo/eih$f;->a:F

    .line 1650
    :cond_1
    move/from16 v0, p1

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/eih;->aw:F

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_2

    .line 1651
    const/4 v12, 0x1

    goto :goto_0

    .line 1653
    :cond_2
    const/4 v12, 0x0

    .line 1656
    :goto_0
    move-object/from16 v0, p0

    iget v13, v0, Lo/eih;->aw:F

    .line 1657
    move/from16 v0, p1

    int-to-float v14, v0

    .line 1660
    sub-float v0, v14, v13

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v15

    .line 1662
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eih;->a:Lo/eix;

    sget-object v1, Lo/eix;->c:Lo/eix;

    if-ne v0, v1, :cond_3

    const/16 v16, 0x1

    goto :goto_1

    :cond_3
    const/16 v16, 0x0

    .line 1665
    :goto_1
    if-eqz v16, :cond_4

    .line 1667
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eih;->H:Lo/ln;

    check-cast v0, Lo/eio;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/eio;->k(Z)V

    .line 1670
    :cond_4
    new-instance v0, Lo/eih$2;

    move-object/from16 v1, p0

    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    move/from16 v3, v16

    move-object/from16 v4, p2

    invoke-direct {v0, v1, v2, v3, v4}, Lo/eih$2;-><init>(Lo/eih;Landroid/os/Handler;ZLo/eih$k;)V

    move-object/from16 v17, v0

    .line 1690
    new-instance v18, Lo/eki$e;

    invoke-direct/range {v18 .. v18}, Lo/eki$e;-><init>()V

    .line 1691
    move-object/from16 v0, v17

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Lo/eki;->d(Lo/eki$b;)V

    .line 1696
    new-instance v19, Landroid/graphics/Matrix;

    invoke-direct/range {v19 .. v19}, Landroid/graphics/Matrix;-><init>()V

    .line 1697
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eih;->O:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->p()Landroid/graphics/Matrix;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 1699
    new-instance v20, Lo/eki$e;

    invoke-direct/range {v20 .. v20}, Lo/eki$e;-><init>()V

    .line 1700
    move-object/from16 v0, v17

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Lo/eki;->d(Lo/eki$b;)V

    .line 1702
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eih;->ay:Lo/ekj;

    new-instance v1, Lo/eih$10;

    move-object/from16 v2, p0

    move-object/from16 v3, p4

    move-object/from16 v4, v19

    move-object v5, v11

    move v6, v15

    move v7, v12

    move-object/from16 v8, v17

    move-object/from16 v9, v20

    invoke-direct/range {v1 .. v9}, Lo/eih$10;-><init>(Lo/eih;Lo/eih$a;Landroid/graphics/Matrix;Lo/eih$f;FZLo/eki;Lo/eki$e;)V

    move/from16 v2, p3

    invoke-virtual {v0, v1, v2}, Lo/ekj;->c(Landroid/animation/ValueAnimator$AnimatorUpdateListener;I)V

    .line 1743
    invoke-virtual/range {v17 .. v17}, Lo/eki;->d()V

    .line 1744
    move-object/from16 v0, v17

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Lo/eki;->c(Lo/eki$b;)V

    .line 1745
    const/4 v0, 0x1

    return v0
.end method

.method protected c(F)I
    .locals 10

    .line 1549
    float-to-int v4, p1

    .line 1550
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    .line 1551
    int-to-long v0, v4

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 1552
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1554
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1555
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1556
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1557
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1558
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1560
    invoke-virtual {v5}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v6, v0

    .line 1562
    const/4 v0, 0x1

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 1563
    invoke-virtual {v5}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v7, v0

    .line 1565
    sub-int v0, v6, v4

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v8

    .line 1566
    sub-int v0, v7, v4

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v9

    .line 1568
    if-gt v8, v9, :cond_0

    .line 1569
    return v6

    .line 1571
    :cond_0
    return v7
.end method

.method public c(II)Ljava/lang/String;
    .locals 3

    .line 1061
    iget-object v0, p0, Lo/eih;->ab:Lo/eih$i;

    if-eqz v0, :cond_0

    .line 1062
    iget-object v0, p0, Lo/eih;->ab:Lo/eih$i;

    int-to-float v1, p1

    int-to-float v2, p2

    invoke-interface {v0, v1, v2}, Lo/eih$i;->b(FF)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1064
    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public c(Lo/eih$k;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/eih<TT;>.k;)V"
        }
    .end annotation

    .line 1434
    iget-object v0, p0, Lo/eih;->O:Lo/oa;

    check-cast v0, Lo/eip;

    invoke-virtual {v0}, Lo/eip;->D()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1435
    iget-object v0, p0, Lo/eih;->as:Lo/eih$h;

    invoke-interface {v0}, Lo/eih$h;->a()I

    move-result v0

    invoke-virtual {p0, v0, p1}, Lo/eih;->e(ILo/eih$k;)V

    .line 1436
    return-void

    .line 1439
    :cond_0
    iget v0, p0, Lo/eih;->aw:F

    const v1, 0x4bb08ec0    # 2.314176E7f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    .line 1440
    const v0, 0x1611d80

    invoke-virtual {p0, v0, p1}, Lo/eih;->e(ILo/eih$k;)V

    .line 1441
    return-void

    .line 1444
    :cond_1
    iget-object v0, p0, Lo/eih;->a:Lo/eix;

    sget-object v1, Lo/eix;->c:Lo/eix;

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lo/eih;->a:Lo/eix;

    sget-object v1, Lo/eix;->a:Lo/eix;

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lo/eih;->a:Lo/eix;

    sget-object v1, Lo/eix;->d:Lo/eix;

    if-ne v0, v1, :cond_3

    .line 1448
    :cond_2
    iget v0, p0, Lo/eih;->aw:F

    invoke-virtual {p0, v0}, Lo/eih;->d(F)I

    move-result v2

    .line 1449
    invoke-virtual {p0, v2, p1}, Lo/eih;->e(ILo/eih$k;)V

    .line 1450
    return-void

    .line 1453
    :cond_3
    iget-object v0, p0, Lo/eih;->a:Lo/eix;

    sget-object v1, Lo/eix;->e:Lo/eix;

    if-ne v0, v1, :cond_4

    .line 1455
    iget v0, p0, Lo/eih;->aw:F

    invoke-virtual {p0, v0}, Lo/eih;->b(F)I

    move-result v2

    .line 1456
    invoke-virtual {p0, v2, p1}, Lo/eih;->e(ILo/eih$k;)V

    .line 1457
    return-void

    .line 1460
    :cond_4
    iget-object v0, p0, Lo/eih;->a:Lo/eix;

    sget-object v1, Lo/eix;->f:Lo/eix;

    if-ne v0, v1, :cond_5

    .line 1462
    iget v0, p0, Lo/eih;->aw:F

    invoke-virtual {p0, v0}, Lo/eih;->c(F)I

    move-result v2

    .line 1463
    invoke-virtual {p0, v2, p1}, Lo/eih;->e(ILo/eih$k;)V

    .line 1464
    return-void

    .line 1467
    :cond_5
    return-void
.end method

.method public c(Lo/eih$k;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/eih<TT;>.k;I)V"
        }
    .end annotation

    .line 920
    iget-object v0, p0, Lo/eih;->aD:Lo/eih$a;

    invoke-virtual {p0, p1, v0, p2}, Lo/eih;->c(Lo/eih$k;Lo/eih$a;I)V

    .line 921
    return-void
.end method

.method public c(Lo/eih$k;Lo/eih$a;I)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/eih<TT;>.k;Lo/eih$a;I)V"
        }
    .end annotation

    .line 924
    iget-object v0, p0, Lo/eih;->aE:Lo/eih$o;

    invoke-virtual {v0, p1}, Lo/eih$o;->b(Lo/eih$k;)V

    .line 925
    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move v5, p3

    const/4 v1, 0x0

    const/16 v4, 0x4b0

    invoke-virtual/range {v0 .. v5}, Lo/eih;->a(ZLo/eih$k;Lo/eih$a;II)V

    .line 926
    return-void
.end method

.method public c(Lo/eih$n$a;Lo/eih$g;)V
    .locals 20

    .line 1917
    invoke-virtual/range {p1 .. p1}, Lo/eih$n$a;->d()I

    move-result v12

    .line 1918
    invoke-virtual/range {p1 .. p1}, Lo/eih$n$a;->b()I

    move-result v13

    .line 1920
    invoke-virtual/range {p1 .. p1}, Lo/eih$n$a;->e()I

    move-result v14

    .line 1921
    invoke-virtual/range {p1 .. p1}, Lo/eih$n$a;->a()I

    move-result v15

    .line 1923
    invoke-virtual/range {p0 .. p0}, Lo/eih;->getData()Lo/ma;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Lo/eik;

    .line 1924
    invoke-virtual/range {v16 .. v16}, Lo/eik;->h()Ljava/util/List;

    move-result-object v17

    .line 1926
    invoke-interface/range {v17 .. v17}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v18

    :goto_0
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v19, v0

    check-cast v19, Lo/eii;

    .line 1927
    move-object/from16 v0, v19

    invoke-virtual/range {p0 .. p0}, Lo/eih;->getContext()Landroid/content/Context;

    move-result-object v1

    move v2, v12

    move v3, v13

    move v4, v14

    move v5, v15

    move-object/from16 v6, p0

    move-object/from16 v7, p0

    iget-object v7, v7, Lo/eih;->as:Lo/eih$h;

    .line 1928
    move-object/from16 v8, v19

    invoke-interface {v7, v8}, Lo/eih$h;->b(Lo/eii;)Lo/eic;

    move-result-object v7

    move-object/from16 v8, p0

    iget-object v8, v8, Lo/eih;->as:Lo/eih$h;

    .line 1929
    move-object/from16 v9, v19

    invoke-interface {v8, v9}, Lo/eih$h;->c(Lo/eii;)Lo/ehe$a;

    move-result-object v8

    move-object/from16 v9, p2

    move-object/from16 v10, p0

    iget-object v10, v10, Lo/eih;->as:Lo/eih$h;

    .line 1930
    move-object/from16 v11, v19

    invoke-interface {v10, v11}, Lo/eih$h;->a(Lo/eii;)Lo/ejk;

    move-result-object v10

    .line 1927
    invoke-virtual/range {v0 .. v10}, Lo/eii;->c(Landroid/content/Context;IIIILo/eih;Lo/eic;Lo/ehe$a;Lo/eih$g;Lo/ejk;)V

    .line 1931
    goto :goto_0

    .line 1933
    :cond_0
    return-void
.end method

.method public c(Lo/eit$b;FFZLo/eih$k;Lo/eih$a;II)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/eit$b;FFZLo/eih<TT;>.k;Lo/eih$a;II)V"
        }
    .end annotation

    .line 901
    iget-object v0, p0, Lo/eih;->aE:Lo/eih$o;

    invoke-virtual {v0, p5}, Lo/eih$o;->b(Lo/eih$k;)V

    .line 902
    sget-object v0, Lo/eit$b;->e:Lo/eit$b;

    if-ne p1, v0, :cond_0

    .line 903
    iget-object v0, p0, Lo/eih;->ae:Lo/eir;

    move v1, p2

    move v2, p3

    move v3, p4

    move-object v4, p5

    move-object v5, p6

    move v6, p7

    move/from16 v7, p8

    invoke-virtual/range {v0 .. v7}, Lo/eir;->d(FFZLo/eih$k;Lo/eih$a;II)V

    goto :goto_0

    .line 904
    :cond_0
    sget-object v0, Lo/eit$b;->b:Lo/eit$b;

    if-ne p1, v0, :cond_1

    .line 905
    iget-object v0, p0, Lo/eih;->am:Lo/eir;

    move v1, p2

    move v2, p3

    move v3, p4

    move-object v4, p5

    move-object v5, p6

    move v6, p7

    move/from16 v7, p8

    invoke-virtual/range {v0 .. v7}, Lo/eir;->d(FFZLo/eih$k;Lo/eih$a;II)V

    goto :goto_0

    .line 907
    :cond_1
    iget-object v0, p0, Lo/eih;->ai:Lo/eir;

    move v1, p2

    move v2, p3

    move v3, p4

    move-object v4, p5

    move-object v5, p6

    move v6, p7

    move/from16 v7, p8

    invoke-virtual/range {v0 .. v7}, Lo/eir;->d(FFZLo/eih$k;Lo/eih$a;II)V

    .line 909
    :goto_0
    return-void
.end method

.method public d(Lo/eii;FF)F
    .locals 2

    .line 882
    move v1, p2

    .line 883
    iget-object v0, p0, Lo/eih;->ae:Lo/eir;

    invoke-virtual {v0}, Lo/eir;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 884
    iget-object v0, p0, Lo/eih;->ae:Lo/eir;

    invoke-virtual {v0}, Lo/eir;->g()F

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v1

    .line 886
    :cond_0
    iget-object v0, p0, Lo/eih;->as:Lo/eih$h;

    invoke-interface {v0, p1, v1, p3}, Lo/eih$h;->e(Lo/eii;FF)F

    move-result v0

    return v0
.end method

.method protected d(F)I
    .locals 10

    .line 1471
    float-to-int v4, p1

    .line 1472
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    .line 1473
    int-to-long v0, v4

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 1474
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1475
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1476
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1477
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1479
    invoke-virtual {v5}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v6, v0

    .line 1481
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 1482
    invoke-virtual {v5}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v7, v0

    .line 1484
    sub-int v0, v6, v4

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v8

    .line 1485
    sub-int v0, v7, v4

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v9

    .line 1487
    if-gt v8, v9, :cond_0

    .line 1488
    return v6

    .line 1490
    :cond_0
    return v7
.end method

.method protected d(ILo/eih$k;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILo/eih<TT;>.k;)V"
        }
    .end annotation

    .line 2065
    iget-object v0, p0, Lo/eih;->aE:Lo/eih$o;

    invoke-virtual {v0, p2}, Lo/eih$o;->b(Lo/eih$k;)V

    .line 2068
    const/4 v0, 0x2

    new-array v2, v0, [F

    int-to-float v0, p1

    const/4 v1, 0x0

    aput v0, v2, v1

    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v2, v1

    .line 2069
    iget-object v0, p0, Lo/eih;->aj:Lo/eim;

    invoke-virtual {v0, v2}, Lo/eim;->e([F)V

    .line 2070
    const/4 v0, 0x0

    aget v3, v2, v0

    .line 2073
    iget-object v0, p0, Lo/eih;->ao:Lo/eie$a;

    iget v4, v0, Lo/eie$a;->a:F

    .line 2075
    cmpl-float v0, v4, v3

    if-nez v0, :cond_0

    .line 2077
    invoke-virtual {p2}, Lo/eih$k;->e()V

    .line 2078
    return-void

    .line 2082
    :cond_0
    const/16 v5, 0xdc

    .line 2083
    sub-float v0, v4, v3

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v1, 0x447a0000    # 1000.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x435c0000    # 220.0f

    div-float/2addr v0, v1

    float-to-int v6, v0

    .line 2085
    iget-object v0, p0, Lo/eih;->ax:Lo/ekj;

    new-instance v1, Lo/eih$7;

    invoke-direct {v1, p0, v4, v3, p2}, Lo/eih$7;-><init>(Lo/eih;FFLo/eih$k;)V

    invoke-virtual {v0, v1, v6}, Lo/ekj;->c(Landroid/animation/ValueAnimator$AnimatorUpdateListener;I)V

    .line 2097
    return-void
.end method

.method public d(Lo/eih$k;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/eih<TT;>.k;)V"
        }
    .end annotation

    .line 1960
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eih;->aE:Lo/eih$o;

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Lo/eih$o;->b(Lo/eih$k;)V

    .line 1963
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eih;->ao:Lo/eie$a;

    sget-object v1, Lo/eih;->an:Lo/eie$a;

    if-ne v0, v1, :cond_0

    .line 1964
    invoke-virtual/range {p1 .. p1}, Lo/eih$k;->e()V

    .line 1965
    return-void

    .line 1969
    :cond_0
    invoke-virtual/range {p0 .. p0}, Lo/eih;->getData()Lo/ma;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/eik;

    .line 1970
    invoke-virtual {v4}, Lo/eik;->h()Ljava/util/List;

    move-result-object v5

    .line 1972
    const/4 v6, 0x0

    .line 1974
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/eii;

    .line 1975
    instance-of v0, v8, Lo/eht;

    if-eqz v0, :cond_1

    .line 1976
    move-object v6, v8

    check-cast v6, Lo/eht;

    .line 1977
    goto :goto_1

    .line 1979
    :cond_1
    goto :goto_0

    .line 1981
    :cond_2
    :goto_1
    if-nez v6, :cond_3

    .line 1983
    invoke-virtual/range {p1 .. p1}, Lo/eih$k;->e()V

    .line 1984
    return-void

    .line 1987
    :cond_3
    const/4 v0, 0x2

    new-array v7, v0, [F

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eih;->ao:Lo/eie$a;

    iget v0, v0, Lo/eie$a;->a:F

    const/4 v1, 0x0

    aput v0, v7, v1

    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v7, v1

    .line 1988
    sget-object v0, Lo/eit$b;->e:Lo/eit$b;

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lo/eih;->b(Lo/eit$b;)Lo/eim;

    move-result-object v0

    invoke-virtual {v0, v7}, Lo/eim;->d([F)V

    .line 1990
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eih;->ao:Lo/eie$a;

    sget-object v1, Lo/eih;->an:Lo/eie$a;

    if-ne v0, v1, :cond_4

    .line 1992
    invoke-virtual/range {p1 .. p1}, Lo/eih$k;->e()V

    .line 1993
    return-void

    .line 1995
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eih;->ao:Lo/eie$a;

    const/4 v1, 0x0

    aget v1, v7, v1

    iput v1, v0, Lo/eie$a;->c:F

    .line 1997
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 1998
    new-instance v0, Lo/mh;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eih;->ao:Lo/eie$a;

    iget v1, v1, Lo/eie$a;->c:F

    const/4 v2, 0x0

    const/4 v3, -0x1

    invoke-direct {v0, v1, v2, v3}, Lo/mh;-><init>(FII)V

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2000
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eih;->A:Lo/ma;

    check-cast v0, Lo/eik;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eih;->Q:[Lo/mh;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v1}, Lo/mh;->b()F

    move-result v1

    move-object/from16 v2, p0

    invoke-virtual {v0, v1, v2}, Lo/eik;->c(FLo/eie;)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v9

    .line 2003
    if-nez v9, :cond_5

    .line 2004
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "adsorb2SelectedDataByDataArea:entryForXValue must not be null"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2007
    :cond_5
    move-object v0, v9

    check-cast v0, Lcom/huawei/ui/commonui/linechart/common/HwEntrys;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/linechart/common/HwEntrys;->getEntries()Ljava/util/List;

    move-result-object v10

    .line 2009
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_6

    .line 2010
    invoke-virtual/range {p1 .. p1}, Lo/eih$k;->e()V

    .line 2011
    return-void

    .line 2013
    :cond_6
    const/4 v0, 0x0

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/mh;

    .line 2016
    const/4 v0, 0x2

    new-array v12, v0, [F

    invoke-virtual {v11}, Lo/mh;->b()F

    move-result v0

    const/4 v1, 0x0

    aput v0, v12, v1

    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v12, v1

    .line 2017
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eih;->aj:Lo/eim;

    invoke-virtual {v0, v12}, Lo/eim;->e([F)V

    .line 2019
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eih;->O:Lo/oa;

    const/4 v1, 0x0

    aget v1, v12, v1

    invoke-virtual {v0, v1}, Lo/oa;->c(F)Z

    move-result v0

    if-nez v0, :cond_7

    .line 2020
    invoke-virtual/range {p1 .. p1}, Lo/eih$k;->e()V

    .line 2022
    return-void

    .line 2025
    :cond_7
    const/4 v13, 0x0

    .line 2027
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_2
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;

    .line 2028
    iget-object v0, v15, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;->dataSet:Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;

    if-ne v0, v6, :cond_8

    .line 2029
    move-object v13, v15

    .line 2030
    goto :goto_3

    .line 2032
    :cond_8
    goto :goto_2

    .line 2034
    :cond_9
    :goto_3
    if-nez v13, :cond_a

    .line 2036
    invoke-virtual/range {p1 .. p1}, Lo/eih$k;->e()V

    .line 2037
    return-void

    .line 2039
    :cond_a
    iget-object v0, v13, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;->entry:Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 2044
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eih;->ao:Lo/eie$a;

    iget v0, v0, Lo/eie$a;->c:F

    float-to-int v14, v0

    .line 2046
    move-object/from16 v0, p0

    iget v0, v0, Lo/eih;->aA:F

    float-to-int v0, v0

    if-ne v14, v0, :cond_b

    .line 2048
    add-int/lit8 v14, v14, -0x1

    .line 2051
    :cond_b
    invoke-virtual {v6, v14}, Lo/eht;->i(I)I

    move-result v15

    .line 2055
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v0, v15, v1}, Lo/eih;->d(ILo/eih$k;)V

    .line 2056
    return-void
.end method

.method public d(Lo/eih$m;)V
    .locals 1

    .line 979
    iget-object v0, p0, Lo/eih;->aG:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 980
    return-void
.end method

.method public d(Lo/eix;Lo/ekd;)V
    .locals 7

    .line 114
    iget-object v0, p0, Lo/eih;->av:Lo/eih$c;

    sget-object v1, Lo/eih$c;->e:Lo/eih$c;

    if-ne v0, v1, :cond_0

    .line 115
    return-void

    .line 117
    :cond_0
    sget-object v0, Lo/eih$c;->e:Lo/eih$c;

    iput-object v0, p0, Lo/eih;->av:Lo/eih$c;

    .line 118
    iput-object p1, p0, Lo/eih;->a:Lo/eix;

    .line 119
    invoke-static {p1, p0, p2}, Lo/ekc;->b(Lo/eix;Lo/eih;Lo/ekd;)Lo/eih$h;

    move-result-object v0

    iput-object v0, p0, Lo/eih;->as:Lo/eih$h;

    .line 120
    iget-object v0, p0, Lo/eih;->as:Lo/eih$h;

    invoke-interface {v0}, Lo/eih$h;->c()Lo/eih$i;

    move-result-object v0

    iput-object v0, p0, Lo/eih;->ab:Lo/eih$i;

    .line 121
    iget-object v0, p0, Lo/eih;->H:Lo/ln;

    iget-object v1, p0, Lo/eih;->ab:Lo/eih$i;

    invoke-virtual {v0, v1}, Lo/ln;->b(Lo/mf;)V

    .line 122
    iget-object v0, p0, Lo/eih;->K:Lo/nd;

    check-cast v0, Lo/eja;

    invoke-virtual {v0}, Lo/eja;->e()V

    .line 124
    new-instance v0, Lo/eil;

    invoke-virtual {p0}, Lo/eih;->getContext()Landroid/content/Context;

    move-result-object v1

    move-object v2, p0

    iget-object v3, p0, Lo/eih;->O:Lo/oa;

    iget-object v4, p0, Lo/eih;->H:Lo/ln;

    iget-object v5, p0, Lo/eih;->aj:Lo/eim;

    invoke-direct/range {v0 .. v5}, Lo/eil;-><init>(Landroid/content/Context;Lo/eie;Lo/oa;Lo/ln;Lo/nv;)V

    move-object v6, v0

    .line 126
    invoke-virtual {v6, p1}, Lo/eil;->a(Lo/eix;)V

    .line 128
    iget-object v0, p0, Lo/eih;->x:Lo/nu;

    check-cast v0, Lo/eiq;

    invoke-virtual {v0}, Lo/eiq;->c()Lo/eiq$d;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/eil;->a(Lo/eiq$d;)V

    .line 129
    iput-object v6, p0, Lo/eih;->x:Lo/nu;

    .line 131
    iget-object v0, p0, Lo/eih;->as:Lo/eih$h;

    invoke-interface {v0}, Lo/eih$h;->a()I

    move-result v0

    iget-object v1, p0, Lo/eih;->as:Lo/eih$h;

    invoke-interface {v1}, Lo/eih$h;->d()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lo/eih;->b(II)V

    .line 134
    iget-object v0, p0, Lo/eih;->ad:Lo/eit;

    const v1, 0x49f42400    # 2000000.0f

    invoke-virtual {v0, v1}, Lo/eit;->a(F)V

    .line 135
    return-void
.end method

.method public d(I)Z
    .locals 3

    .line 78
    iget-object v2, p0, Lo/eih;->a:Lo/eix;

    .line 79
    sget-object v0, Lo/eix;->c:Lo/eix;

    if-ne v2, v0, :cond_0

    .line 81
    int-to-float v0, p1

    invoke-virtual {p0, v0}, Lo/eih;->d(F)I

    move-result v0

    sub-int v0, p1, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40a00000    # 5.0f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_4

    .line 82
    const/4 v0, 0x1

    return v0

    .line 84
    :cond_0
    sget-object v0, Lo/eix;->a:Lo/eix;

    if-ne v2, v0, :cond_1

    .line 85
    int-to-float v0, p1

    invoke-virtual {p0, v0}, Lo/eih;->e(F)I

    move-result v0

    sub-int v0, p1, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40a00000    # 5.0f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_4

    .line 86
    const/4 v0, 0x1

    return v0

    .line 88
    :cond_1
    sget-object v0, Lo/eix;->d:Lo/eix;

    if-ne v2, v0, :cond_2

    .line 89
    int-to-float v0, p1

    invoke-virtual {p0, v0}, Lo/eih;->b(F)I

    move-result v0

    sub-int v0, p1, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40a00000    # 5.0f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_4

    .line 90
    const/4 v0, 0x1

    return v0

    .line 92
    :cond_2
    sget-object v0, Lo/eix;->e:Lo/eix;

    if-ne v2, v0, :cond_3

    .line 93
    int-to-float v0, p1

    invoke-virtual {p0, v0}, Lo/eih;->c(F)I

    move-result v0

    sub-int v0, p1, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40a00000    # 5.0f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_4

    .line 94
    const/4 v0, 0x1

    return v0

    .line 96
    :cond_3
    sget-object v0, Lo/eix;->f:Lo/eix;

    if-ne v2, v0, :cond_4

    .line 97
    const/4 v0, 0x1

    return v0

    .line 99
    :cond_4
    const/4 v0, 0x0

    return v0
.end method

.method public e(Lo/eii;FF)F
    .locals 1

    .line 890
    iget-object v0, p0, Lo/eih;->as:Lo/eih$h;

    invoke-interface {v0, p1, p2, p3}, Lo/eih$h;->a(Lo/eii;FF)F

    move-result v0

    return v0
.end method

.method protected e(F)I
    .locals 11

    .line 1519
    float-to-int v4, p1

    .line 1520
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    .line 1521
    int-to-long v0, v4

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 1522
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1523
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1524
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1525
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1527
    const/4 v0, 0x7

    invoke-virtual {v5, v0}, Ljava/util/Calendar;->get(I)I

    move-result v6

    .line 1529
    :goto_0
    invoke-static {}, Lo/eke;->c()I

    move-result v0

    if-eq v6, v0, :cond_0

    .line 1530
    const/4 v0, 0x5

    const/4 v1, -0x1

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 1531
    const/4 v0, 0x7

    invoke-virtual {v5, v0}, Ljava/util/Calendar;->get(I)I

    move-result v6

    goto :goto_0

    .line 1534
    :cond_0
    invoke-virtual {v5}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v7, v0

    .line 1536
    const/4 v0, 0x5

    const/4 v1, 0x7

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 1537
    invoke-virtual {v5}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v8, v0

    .line 1539
    sub-int v0, v7, v4

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v9

    .line 1540
    sub-int v0, v8, v4

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v10

    .line 1542
    if-gt v9, v10, :cond_1

    .line 1543
    return v7

    .line 1545
    :cond_1
    return v8
.end method

.method protected e(ILo/eih$k;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILo/eih<TT;>.k;)V"
        }
    .end annotation

    .line 1576
    iget-object v0, p0, Lo/eih;->aD:Lo/eih$a;

    const/16 v1, 0x12c

    invoke-virtual {p0, p1, p2, v1, v0}, Lo/eih;->b(ILo/eih$k;ILo/eih$a;)Z

    .line 1577
    return-void
.end method

.method public e(Lo/eih$k;Lo/eih$a;Lo/eih$d;)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/eih<TT;>.k;Lo/eih$a;Lo/eih$d;)V"
        }
    .end annotation

    .line 1219
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eih;->aE:Lo/eih$o;

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Lo/eih$o;->b(Lo/eih$k;)V

    .line 1222
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eih;->a:Lo/eix;

    sget-object v1, Lo/eix;->c:Lo/eix;

    if-ne v0, v1, :cond_0

    const/4 v9, 0x1

    goto :goto_0

    :cond_0
    const/4 v9, 0x0

    .line 1225
    :goto_0
    if-eqz v9, :cond_1

    .line 1226
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eih;->H:Lo/ln;

    check-cast v0, Lo/eio;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/eio;->k(Z)V

    .line 1229
    :cond_1
    new-instance v10, Lo/eih$15;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct {v10, v1, v0, v9, v2}, Lo/eih$15;-><init>(Lo/eih;Landroid/os/Handler;ZLo/eih$k;)V

    .line 1249
    new-instance v11, Lo/eki$e;

    invoke-direct {v11}, Lo/eki$e;-><init>()V

    .line 1250
    invoke-virtual {v10, v11}, Lo/eki;->d(Lo/eki$b;)V

    .line 1255
    move-object/from16 v0, p0

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lo/eih;->g(Z)I

    move-result v12

    .line 1257
    invoke-virtual/range {p0 .. p0}, Lo/eih;->getData()Lo/ma;

    move-result-object v13

    .line 1258
    invoke-virtual {v13}, Lo/ma;->h()Ljava/util/List;

    move-result-object v14

    .line 1259
    invoke-interface {v14}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_1
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Lo/ejl;

    .line 1260
    int-to-float v0, v12

    move-object/from16 v1, p0

    iget v1, v1, Lo/eih;->az:I

    add-int/2addr v1, v12

    int-to-float v1, v1

    move-object/from16 v2, v16

    invoke-interface {v2, v0, v1}, Lo/ejl;->a(FF)F

    move-result v17

    .line 1261
    int-to-float v0, v12

    move-object/from16 v1, p0

    iget v1, v1, Lo/eih;->az:I

    add-int/2addr v1, v12

    int-to-float v1, v1

    move-object/from16 v2, v16

    invoke-interface {v2, v0, v1}, Lo/ejl;->d(FF)F

    move-result v18

    .line 1265
    move-object/from16 v0, v16

    move-object/from16 v1, p0

    move/from16 v2, v17

    move/from16 v3, v18

    invoke-interface {v0, v1, v2, v3}, Lo/ejl;->c(Lo/eih;FF)F

    move-result v19

    .line 1266
    move-object/from16 v0, v16

    move-object/from16 v1, p0

    move/from16 v2, v17

    move/from16 v3, v18

    invoke-interface {v0, v1, v2, v3}, Lo/ejl;->b(Lo/eih;FF)F

    move-result v20

    .line 1268
    new-instance v21, Lo/eki$e;

    invoke-direct/range {v21 .. v21}, Lo/eki$e;-><init>()V

    .line 1269
    move-object/from16 v0, v21

    invoke-virtual {v10, v0}, Lo/eki;->d(Lo/eki$b;)V

    .line 1270
    move-object/from16 v0, p0

    invoke-interface/range {v16 .. v16}, Lo/ejl;->e()Lo/eit$b;

    move-result-object v1

    move/from16 v2, v19

    move/from16 v3, v20

    new-instance v5, Lo/eih$14;

    move-object/from16 v4, p0

    move-object/from16 v6, v21

    invoke-direct {v5, v4, v10, v6}, Lo/eih$14;-><init>(Lo/eih;Lo/eki;Lo/eki$e;)V

    move-object/from16 v6, p2

    move-object/from16 v4, p0

    iget v4, v4, Lo/eih;->aw:F

    float-to-int v4, v4

    sub-int v4, v12, v4

    .line 1276
    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v4

    move-object/from16 v7, p3

    invoke-interface {v7, v4}, Lo/eih$d;->e(I)I

    move-result v7

    .line 1270
    const/4 v4, 0x0

    const/4 v8, 0x2

    invoke-virtual/range {v0 .. v8}, Lo/eih;->c(Lo/eit$b;FFZLo/eih$k;Lo/eih$a;II)V

    .line 1278
    goto/16 :goto_1

    .line 1280
    :cond_2
    new-instance v15, Lo/eki$e;

    invoke-direct {v15}, Lo/eki$e;-><init>()V

    .line 1281
    invoke-virtual {v10, v15}, Lo/eki;->d(Lo/eki$b;)V

    .line 1283
    new-instance v0, Lo/eih$13;

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v10, v15}, Lo/eih$13;-><init>(Lo/eih;Lo/eki;Lo/eki$e;)V

    move-object/from16 v1, p0

    iget v1, v1, Lo/eih;->aw:F

    float-to-int v1, v1

    sub-int v1, v12, v1

    .line 1289
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    move-object/from16 v2, p3

    invoke-interface {v2, v1}, Lo/eih$d;->e(I)I

    move-result v1

    .line 1283
    move-object/from16 v2, p0

    move-object/from16 v3, p2

    invoke-virtual {v2, v12, v0, v1, v3}, Lo/eih;->b(ILo/eih$k;ILo/eih$a;)Z

    .line 1291
    invoke-virtual {v10}, Lo/eki;->d()V

    .line 1292
    invoke-virtual {v10, v11}, Lo/eki;->c(Lo/eki$b;)V

    .line 1293
    return-void
.end method

.method public e(I)Z
    .locals 2

    .line 1582
    new-instance v0, Lo/eih$5;

    invoke-direct {v0, p0}, Lo/eih$5;-><init>(Lo/eih;)V

    iget-object v1, p0, Lo/eih;->aD:Lo/eih$a;

    invoke-virtual {p0, p1, v0, v1}, Lo/eih;->e(ILo/eih$k;Lo/eih$a;)Z

    move-result v0

    return v0
.end method

.method public e(ILo/eih$k;Lo/eih$a;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILo/eih<TT;>.k;Lo/eih$a;)Z"
        }
    .end annotation

    .line 1609
    iget-object v0, p0, Lo/eih;->aE:Lo/eih$o;

    invoke-virtual {v0, p2}, Lo/eih$o;->b(Lo/eih$k;)V

    .line 1610
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0, p3}, Lo/eih;->b(ILo/eih$k;ILo/eih$a;)Z

    move-result v0

    return v0
.end method

.method public getCurrentPagerStartX()I
    .locals 4

    .line 1760
    iget-object v0, p0, Lo/eih;->a:Lo/eix;

    sget-object v1, Lo/eix;->c:Lo/eix;

    if-ne v0, v1, :cond_0

    .line 1762
    iget v0, p0, Lo/eih;->aw:F

    float-to-int v0, v0

    int-to-long v0, v0

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-static {v0, v1}, Lo/ekg;->d(J)J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v0, v0

    return v0

    .line 1763
    :cond_0
    iget-object v0, p0, Lo/eih;->a:Lo/eix;

    sget-object v1, Lo/eix;->a:Lo/eix;

    if-ne v0, v1, :cond_1

    .line 1764
    iget v0, p0, Lo/eih;->aw:F

    float-to-int v0, v0

    int-to-long v0, v0

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-static {v0, v1}, Lo/ekg;->b(J)J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v0, v0

    return v0

    .line 1765
    :cond_1
    iget-object v0, p0, Lo/eih;->a:Lo/eix;

    sget-object v1, Lo/eix;->d:Lo/eix;

    if-ne v0, v1, :cond_2

    .line 1766
    iget v0, p0, Lo/eih;->aw:F

    float-to-int v0, v0

    int-to-long v0, v0

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-static {v0, v1}, Lo/ekg;->i(J)J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v0, v0

    return v0

    .line 1767
    :cond_2
    iget-object v0, p0, Lo/eih;->a:Lo/eix;

    sget-object v1, Lo/eix;->e:Lo/eix;

    if-ne v0, v1, :cond_3

    .line 1768
    iget v0, p0, Lo/eih;->aw:F

    float-to-int v0, v0

    int-to-long v0, v0

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-static {v0, v1}, Lo/ekg;->u(J)J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v0, v0

    return v0

    .line 1769
    :cond_3
    iget-object v0, p0, Lo/eih;->a:Lo/eix;

    sget-object v1, Lo/eix;->f:Lo/eix;

    if-ne v0, v1, :cond_4

    .line 1770
    iget v0, p0, Lo/eih;->aw:F

    float-to-int v0, v0

    int-to-long v0, v0

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-static {v0, v1}, Lo/ekg;->n(J)J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v0, v0

    return v0

    .line 1772
    :cond_4
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "unsupport showMode in getCurrentPagerStartX"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getHighestVisibleX()F
    .locals 2

    .line 1945
    iget-object v0, p0, Lo/eih;->av:Lo/eih$c;

    sget-object v1, Lo/eih$c;->e:Lo/eih$c;

    if-eq v0, v1, :cond_0

    .line 1946
    invoke-super {p0}, Lo/eie;->getHighestVisibleX()F

    move-result v0

    return v0

    .line 1948
    :cond_0
    iget v0, p0, Lo/eih;->aA:F

    return v0
.end method

.method public getLastPagerStartX()I
    .locals 4

    .line 1792
    iget-object v0, p0, Lo/eih;->a:Lo/eix;

    sget-object v1, Lo/eix;->c:Lo/eix;

    if-ne v0, v1, :cond_0

    .line 1794
    iget v0, p0, Lo/eih;->aw:F

    float-to-int v0, v0

    int-to-long v0, v0

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-static {v0, v1}, Lo/ekg;->a(J)J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v0, v0

    return v0

    .line 1795
    :cond_0
    iget-object v0, p0, Lo/eih;->a:Lo/eix;

    sget-object v1, Lo/eix;->a:Lo/eix;

    if-ne v0, v1, :cond_1

    .line 1796
    iget v0, p0, Lo/eih;->aw:F

    float-to-int v0, v0

    int-to-long v0, v0

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-static {v0, v1}, Lo/ekg;->f(J)J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v0, v0

    return v0

    .line 1797
    :cond_1
    iget-object v0, p0, Lo/eih;->a:Lo/eix;

    sget-object v1, Lo/eix;->d:Lo/eix;

    if-ne v0, v1, :cond_2

    .line 1798
    iget v0, p0, Lo/eih;->aw:F

    float-to-int v0, v0

    int-to-long v0, v0

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-static {v0, v1}, Lo/ekg;->h(J)J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v0, v0

    return v0

    .line 1799
    :cond_2
    iget-object v0, p0, Lo/eih;->a:Lo/eix;

    sget-object v1, Lo/eix;->e:Lo/eix;

    if-ne v0, v1, :cond_3

    .line 1800
    iget v0, p0, Lo/eih;->aw:F

    float-to-int v0, v0

    int-to-long v0, v0

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-static {v0, v1}, Lo/ekg;->s(J)J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v0, v0

    return v0

    .line 1801
    :cond_3
    iget-object v0, p0, Lo/eih;->a:Lo/eix;

    sget-object v1, Lo/eix;->f:Lo/eix;

    if-ne v0, v1, :cond_4

    .line 1803
    iget v0, p0, Lo/eih;->aw:F

    float-to-int v0, v0

    int-to-long v0, v0

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-static {v0, v1}, Lo/ekg;->o(J)J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v0, v0

    return v0

    .line 1805
    :cond_4
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "unsupport showMode in getLastPagerStartX"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getLowestVisibleX()F
    .locals 2

    .line 1937
    iget-object v0, p0, Lo/eih;->av:Lo/eih$c;

    sget-object v1, Lo/eih$c;->e:Lo/eih$c;

    if-eq v0, v1, :cond_0

    .line 1938
    invoke-super {p0}, Lo/eie;->getLowestVisibleX()F

    move-result v0

    return v0

    .line 1940
    :cond_0
    iget v0, p0, Lo/eih;->aw:F

    return v0
.end method

.method public getNextPagerStartX()I
    .locals 4

    .line 1776
    iget-object v0, p0, Lo/eih;->a:Lo/eix;

    sget-object v1, Lo/eix;->c:Lo/eix;

    if-ne v0, v1, :cond_0

    .line 1778
    iget v0, p0, Lo/eih;->aw:F

    float-to-int v0, v0

    int-to-long v0, v0

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-static {v0, v1}, Lo/ekg;->c(J)J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v0, v0

    return v0

    .line 1779
    :cond_0
    iget-object v0, p0, Lo/eih;->a:Lo/eix;

    sget-object v1, Lo/eix;->a:Lo/eix;

    if-ne v0, v1, :cond_1

    .line 1780
    iget v0, p0, Lo/eih;->aw:F

    float-to-int v0, v0

    int-to-long v0, v0

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-static {v0, v1}, Lo/ekg;->e(J)J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v0, v0

    return v0

    .line 1781
    :cond_1
    iget-object v0, p0, Lo/eih;->a:Lo/eix;

    sget-object v1, Lo/eix;->d:Lo/eix;

    if-ne v0, v1, :cond_2

    .line 1782
    iget v0, p0, Lo/eih;->aw:F

    float-to-int v0, v0

    int-to-long v0, v0

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-static {v0, v1}, Lo/ekg;->k(J)J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v0, v0

    return v0

    .line 1783
    :cond_2
    iget-object v0, p0, Lo/eih;->a:Lo/eix;

    sget-object v1, Lo/eix;->e:Lo/eix;

    if-ne v0, v1, :cond_3

    .line 1784
    iget v0, p0, Lo/eih;->aw:F

    float-to-int v0, v0

    int-to-long v0, v0

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-static {v0, v1}, Lo/ekg;->r(J)J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v0, v0

    return v0

    .line 1785
    :cond_3
    iget-object v0, p0, Lo/eih;->a:Lo/eix;

    sget-object v1, Lo/eix;->f:Lo/eix;

    if-ne v0, v1, :cond_4

    .line 1786
    iget v0, p0, Lo/eih;->aw:F

    float-to-int v0, v0

    int-to-long v0, v0

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-static {v0, v1}, Lo/ekg;->p(J)J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v0, v0

    return v0

    .line 1788
    :cond_4
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "unsupport showMode in getNextPagerStartX"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getShowDataAverage()F
    .locals 5

    .line 990
    invoke-virtual {p0}, Lo/eih;->getData()Lo/ma;

    move-result-object v1

    .line 991
    invoke-virtual {v1}, Lo/ma;->h()Ljava/util/List;

    move-result-object v2

    .line 992
    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 993
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 996
    :cond_1
    const/4 v0, 0x0

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/ejl;

    .line 998
    invoke-interface {v3, p0}, Lo/ejl;->a(Lo/eih;)F

    move-result v4

    .line 1000
    return v4
.end method

.method public getShowDataTotal()F
    .locals 5

    .line 1042
    invoke-virtual {p0}, Lo/eih;->getData()Lo/ma;

    move-result-object v1

    .line 1043
    invoke-virtual {v1}, Lo/ma;->h()Ljava/util/List;

    move-result-object v2

    .line 1044
    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 1045
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 1048
    :cond_1
    const/4 v0, 0x0

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/ejl;

    .line 1050
    new-instance v0, Lo/eih$6;

    invoke-direct {v0, p0}, Lo/eih$6;-><init>(Lo/eih;)V

    invoke-interface {v3, p0, v0}, Lo/ejl;->e(Lo/eih;Lo/eih$e;)F

    move-result v4

    .line 1057
    return v4
.end method

.method public getShowMinMaxRangeByRatio()[F
    .locals 6

    .line 1905
    invoke-virtual {p0}, Lo/eih;->getData()Lo/ma;

    move-result-object v3

    .line 1906
    invoke-virtual {v3}, Lo/ma;->h()Ljava/util/List;

    move-result-object v4

    .line 1907
    if-eqz v4, :cond_0

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 1908
    :cond_0
    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    return-object v0

    .line 1911
    :cond_1
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/ejl;

    .line 1913
    const/4 v0, 0x2

    new-array v0, v0, [F

    invoke-interface {v5, p0}, Lo/ejl;->d(Lo/eih;)F

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    invoke-interface {v5, p0}, Lo/ejl;->c(Lo/eih;)F

    move-result v1

    const/4 v2, 0x1

    aput v1, v0, v2

    return-object v0

    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 14

    .line 391
    invoke-super {p0, p1}, Lo/eie;->onDraw(Landroid/graphics/Canvas;)V

    .line 394
    iget-object v0, p0, Lo/eih;->O:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->f()F

    move-result v4

    .line 395
    iget-object v0, p0, Lo/eih;->O:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->h()F

    move-result v5

    .line 397
    const/4 v0, 0x4

    new-array v6, v0, [F

    const/4 v0, 0x0

    aput v4, v6, v0

    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v6, v1

    const/4 v0, 0x2

    aput v5, v6, v0

    const/4 v0, 0x0

    const/4 v1, 0x3

    aput v0, v6, v1

    .line 400
    iget-object v0, p0, Lo/eih;->aj:Lo/eim;

    invoke-virtual {v0, v6}, Lo/eim;->d([F)V

    .line 402
    const/4 v0, 0x0

    aget v7, v6, v0

    .line 403
    const/4 v0, 0x2

    aget v8, v6, v0

    .line 405
    const/4 v9, 0x2

    new-array v9, v9, [F

    fill-array-data v9, :array_0

    .line 406
    iget-object v0, p0, Lo/eih;->aj:Lo/eim;

    invoke-virtual {v0, v9}, Lo/eim;->e([F)V

    .line 410
    cmpg-float v0, v7, v8

    if-gtz v0, :cond_0

    .line 411
    move v10, v7

    .line 412
    move v11, v8

    goto :goto_0

    .line 414
    :cond_0
    move v10, v8

    .line 415
    move v11, v7

    .line 418
    :goto_0
    float-to-int v0, v10

    invoke-virtual {p0, v0}, Lo/eih;->a(I)I

    move-result v0

    int-to-float v10, v0

    .line 419
    float-to-int v0, v11

    invoke-virtual {p0, v0}, Lo/eih;->a(I)I

    move-result v0

    int-to-float v11, v0

    .line 421
    float-to-int v0, v10

    int-to-long v0, v0

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-static {v0, v1}, Lo/ekg;->z(J)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/eih;->a:Lo/eix;

    sget-object v1, Lo/eix;->e:Lo/eix;

    if-ne v0, v1, :cond_1

    .line 423
    float-to-int v0, v11

    invoke-direct {p0, v0}, Lo/eih;->h(I)I

    move-result v0

    int-to-float v11, v0

    .line 426
    :cond_1
    iget-object v0, p0, Lo/eih;->av:Lo/eih$c;

    sget-object v1, Lo/eih$c;->e:Lo/eih$c;

    if-ne v0, v1, :cond_3

    .line 428
    iget v0, p0, Lo/eih;->aw:F

    cmpl-float v0, v10, v0

    if-nez v0, :cond_2

    iget v0, p0, Lo/eih;->aA:F

    cmpl-float v0, v11, v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lo/eih;->as:Lo/eih$h;

    .line 429
    invoke-interface {v0}, Lo/eih$h;->e()I

    move-result v0

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    .line 430
    return-void

    .line 433
    :cond_2
    iget-object v0, p0, Lo/eih;->as:Lo/eih$h;

    invoke-interface {v0}, Lo/eih$h;->e()I

    move-result v12

    .line 435
    and-int/lit8 v12, v12, -0x2

    .line 436
    iget-object v0, p0, Lo/eih;->as:Lo/eih$h;

    invoke-interface {v0, v12}, Lo/eih$h;->b(I)V

    .line 440
    :cond_3
    iput v10, p0, Lo/eih;->aw:F

    .line 441
    iput v11, p0, Lo/eih;->aA:F

    .line 443
    iget-object v0, p0, Lo/eih;->av:Lo/eih$c;

    sget-object v1, Lo/eih$c;->e:Lo/eih$c;

    if-ne v0, v1, :cond_7

    .line 445
    iget-object v0, p0, Lo/eih;->as:Lo/eih$h;

    iget v1, p0, Lo/eih;->aw:F

    float-to-int v1, v1

    iget v2, p0, Lo/eih;->aA:F

    float-to-int v2, v2

    invoke-interface {v0, v1, v2}, Lo/eih$h;->e(II)V

    .line 446
    iget-object v0, p0, Lo/eih;->aH:Lo/eih$p;

    if-eqz v0, :cond_7

    .line 447
    invoke-virtual {p0}, Lo/eih;->am()Z

    move-result v0

    iget-boolean v1, p0, Lo/eih;->aF:Z

    if-eq v0, v1, :cond_5

    .line 448
    iget-boolean v0, p0, Lo/eih;->aF:Z

    if-nez v0, :cond_4

    const/4 v0, 0x1

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lo/eih;->aF:Z

    .line 449
    iget-object v0, p0, Lo/eih;->aH:Lo/eih$p;

    iget-boolean v1, p0, Lo/eih;->aF:Z

    invoke-interface {v0, v1}, Lo/eih$p;->d(Z)V

    .line 451
    :cond_5
    invoke-virtual {p0}, Lo/eih;->af()Z

    move-result v0

    iget-boolean v1, p0, Lo/eih;->aB:Z

    if-eq v0, v1, :cond_7

    .line 452
    iget-boolean v0, p0, Lo/eih;->aB:Z

    if-nez v0, :cond_6

    const/4 v0, 0x1

    goto :goto_2

    :cond_6
    const/4 v0, 0x0

    :goto_2
    iput-boolean v0, p0, Lo/eih;->aB:Z

    .line 453
    iget-object v0, p0, Lo/eih;->aH:Lo/eih$p;

    iget-boolean v1, p0, Lo/eih;->aB:Z

    invoke-interface {v0, v1}, Lo/eih$p;->a(Z)V

    .line 458
    :cond_7
    iget-object v0, p0, Lo/eih;->aG:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_3
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/eih$m;

    .line 459
    iget v0, p0, Lo/eih;->aw:F

    float-to-int v0, v0

    iget v1, p0, Lo/eih;->aA:F

    float-to-int v1, v1

    invoke-interface {v13, v0, v1}, Lo/eih$m;->b(II)V

    .line 460
    goto :goto_3

    .line 461
    :cond_8
    return-void

    nop

    :array_0
    .array-data 4
        0x4bc1d6d0    # 2.540688E7f
        0x0
    .end array-data
.end method

.method public setPagerNoMoreListener(Lo/eih$p;)V
    .locals 0

    .line 1751
    iput-object p1, p0, Lo/eih;->aH:Lo/eih$p;

    .line 1752
    return-void
.end method

.method public setWillNotDraw(Z)V
    .locals 0

    .line 2117
    invoke-super {p0, p1}, Lo/eie;->setWillNotDraw(Z)V

    .line 2118
    iput-boolean p1, p0, Lo/eih;->au:Z

    .line 2119
    return-void
.end method
