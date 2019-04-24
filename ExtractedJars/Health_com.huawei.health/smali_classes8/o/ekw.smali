.class public Lo/ekw;
.super Lo/ekt;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ekw$a;,
        Lo/ekw$e;,
        Lo/ekw$f;,
        Lo/ekw$d;,
        Lo/ekw$b;,
        Lo/ekw$c;,
        Lo/ekw$h;
    }
.end annotation


# static fields
.field private static ab:J


# instance fields
.field private a:Landroid/content/Context;

.field private aB:J

.field private aC:Lo/ekw$f;

.field private aD:Lo/ekw$d;

.field private aE:I

.field private aF:Lo/ekm;

.field private aG:Lo/ekw$h;

.field private aH:I

.field private aI:Lo/ekw$e;

.field private aJ:Z

.field private aK:Lo/eja$e;

.field private aL:I

.field private aM:Lo/ekw$e;

.field private az:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 45
    const-wide/16 v0, 0x8fc

    sput-wide v0, Lo/ekw;->ab:J

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 48
    invoke-direct {p0, p1}, Lo/ekt;-><init>(Landroid/content/Context;)V

    .line 62
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/ekw;->aB:J

    .line 411
    new-instance v0, Lo/ekw$4;

    invoke-direct {v0, p0}, Lo/ekw$4;-><init>(Lo/ekw;)V

    iput-object v0, p0, Lo/ekw;->az:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    .line 449
    const/4 v0, 0x0

    iput v0, p0, Lo/ekw;->aE:I

    .line 659
    sget-object v0, Lo/ekw$h;->e:Lo/ekw$h;

    iput-object v0, p0, Lo/ekw;->aG:Lo/ekw$h;

    .line 678
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ekw;->aF:Lo/ekm;

    .line 715
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ekw;->aD:Lo/ekw$d;

    .line 717
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ekw;->aC:Lo/ekw$f;

    .line 728
    new-instance v0, Lo/ekw$1;

    invoke-direct {v0, p0}, Lo/ekw$1;-><init>(Lo/ekw;)V

    iput-object v0, p0, Lo/ekw;->aK:Lo/eja$e;

    .line 749
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ekw;->aJ:Z

    .line 766
    const/16 v0, 0x80

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/ekw;->aL:I

    .line 768
    const/16 v0, 0x1a

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/ekw;->aH:I

    .line 771
    new-instance v0, Lo/ekw$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/ekw$a;-><init>(Lo/ekw$3;)V

    iput-object v0, p0, Lo/ekw;->aI:Lo/ekw$e;

    .line 774
    iget-object v0, p0, Lo/ekw;->aI:Lo/ekw$e;

    iput-object v0, p0, Lo/ekw;->aM:Lo/ekw$e;

    .line 49
    invoke-direct {p0}, Lo/ekw;->D()V

    .line 50
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .line 53
    invoke-direct {p0, p1, p2}, Lo/ekt;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 62
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/ekw;->aB:J

    .line 411
    new-instance v0, Lo/ekw$4;

    invoke-direct {v0, p0}, Lo/ekw$4;-><init>(Lo/ekw;)V

    iput-object v0, p0, Lo/ekw;->az:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    .line 449
    const/4 v0, 0x0

    iput v0, p0, Lo/ekw;->aE:I

    .line 659
    sget-object v0, Lo/ekw$h;->e:Lo/ekw$h;

    iput-object v0, p0, Lo/ekw;->aG:Lo/ekw$h;

    .line 678
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ekw;->aF:Lo/ekm;

    .line 715
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ekw;->aD:Lo/ekw$d;

    .line 717
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ekw;->aC:Lo/ekw$f;

    .line 728
    new-instance v0, Lo/ekw$1;

    invoke-direct {v0, p0}, Lo/ekw$1;-><init>(Lo/ekw;)V

    iput-object v0, p0, Lo/ekw;->aK:Lo/eja$e;

    .line 749
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ekw;->aJ:Z

    .line 766
    const/16 v0, 0x80

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/ekw;->aL:I

    .line 768
    const/16 v0, 0x1a

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/ekw;->aH:I

    .line 771
    new-instance v0, Lo/ekw$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/ekw$a;-><init>(Lo/ekw$3;)V

    iput-object v0, p0, Lo/ekw;->aI:Lo/ekw$e;

    .line 774
    iget-object v0, p0, Lo/ekw;->aI:Lo/ekw$e;

    iput-object v0, p0, Lo/ekw;->aM:Lo/ekw$e;

    .line 54
    invoke-direct {p0}, Lo/ekw;->D()V

    .line 55
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .line 58
    invoke-direct {p0, p1, p2, p3}, Lo/ekt;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 62
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/ekw;->aB:J

    .line 411
    new-instance v0, Lo/ekw$4;

    invoke-direct {v0, p0}, Lo/ekw$4;-><init>(Lo/ekw;)V

    iput-object v0, p0, Lo/ekw;->az:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    .line 449
    const/4 v0, 0x0

    iput v0, p0, Lo/ekw;->aE:I

    .line 659
    sget-object v0, Lo/ekw$h;->e:Lo/ekw$h;

    iput-object v0, p0, Lo/ekw;->aG:Lo/ekw$h;

    .line 678
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ekw;->aF:Lo/ekm;

    .line 715
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ekw;->aD:Lo/ekw$d;

    .line 717
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ekw;->aC:Lo/ekw$f;

    .line 728
    new-instance v0, Lo/ekw$1;

    invoke-direct {v0, p0}, Lo/ekw$1;-><init>(Lo/ekw;)V

    iput-object v0, p0, Lo/ekw;->aK:Lo/eja$e;

    .line 749
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ekw;->aJ:Z

    .line 766
    const/16 v0, 0x80

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/ekw;->aL:I

    .line 768
    const/16 v0, 0x1a

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/ekw;->aH:I

    .line 771
    new-instance v0, Lo/ekw$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/ekw$a;-><init>(Lo/ekw$3;)V

    iput-object v0, p0, Lo/ekw;->aI:Lo/ekw$e;

    .line 774
    iget-object v0, p0, Lo/ekw;->aI:Lo/ekw$e;

    iput-object v0, p0, Lo/ekw;->aM:Lo/ekw$e;

    .line 59
    invoke-direct {p0}, Lo/ekw;->D()V

    .line 60
    return-void
.end method

.method private D()V
    .locals 9

    .line 65
    invoke-virtual {p0}, Lo/ekw;->getContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/ekw;->a:Landroid/content/Context;

    .line 66
    const-string v0, "HwHealthLineChart"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mContext = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ekw;->a:Landroid/content/Context;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lo/ekw;->setLayerType(ILandroid/graphics/Paint;)V

    .line 79
    iget-object v0, p0, Lo/ekw;->N:Lo/lm;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/lm;->f(F)V

    .line 82
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/ekw;->setDrawGridBackground(Z)V

    .line 83
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/ekw;->setTouchEnabled(Z)V

    .line 84
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/ekw;->setDragEnabled(Z)V

    .line 85
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/ekw;->setScaleEnabled(Z)V

    .line 86
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/ekw;->setScaleYEnabled(Z)V

    .line 87
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/ekw;->setDoubleTapToZoomEnabled(Z)V

    .line 88
    const/high16 v0, 0x40800000    # 4.0f

    invoke-virtual {p0, v0}, Lo/ekw;->setScaletMaxima(F)V

    .line 90
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {p0, v0}, Lo/ekw;->setGridBackgroundColor(I)V

    .line 105
    invoke-virtual {p0}, Lo/ekw;->getLegend()Lo/lm;

    move-result-object v4

    .line 106
    invoke-virtual {p0}, Lo/ekw;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v4}, Lo/ekp;->b(Landroid/content/Context;Lo/lm;)V

    .line 107
    new-instance v0, Lo/elf;

    iget-object v1, p0, Lo/ekw;->a:Landroid/content/Context;

    iget-object v2, p0, Lo/ekw;->O:Lo/oa;

    iget-object v3, p0, Lo/ekw;->N:Lo/lm;

    invoke-direct {v0, v1, p0, v2, v3}, Lo/elf;-><init>(Landroid/content/Context;Lo/eie;Lo/oa;Lo/lm;)V

    iput-object v0, p0, Lo/ekw;->J:Lo/np;

    .line 111
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/ekw;->setDrawBorders(Z)V

    .line 112
    invoke-virtual {p0}, Lo/ekw;->getDescription()Lo/ll;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ll;->d(Z)V

    .line 113
    invoke-virtual {p0}, Lo/ekw;->getDescription()Lo/ll;

    move-result-object v0

    invoke-virtual {p0}, Lo/ekw;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/commonui/R$string;->IDS_hwh_motiontrack_detail_chart_time:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ll;->d(Ljava/lang/String;)V

    .line 115
    iget-object v0, p0, Lo/ekw;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/ehw;->c(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 116
    invoke-virtual {p0}, Lo/ekw;->getDescription()Lo/ll;

    move-result-object v0

    sget-object v1, Landroid/graphics/Paint$Align;->RIGHT:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Lo/ll;->b(Landroid/graphics/Paint$Align;)V

    goto :goto_0

    .line 118
    :cond_0
    invoke-virtual {p0}, Lo/ekw;->getDescription()Lo/ll;

    move-result-object v0

    sget-object v1, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Lo/ll;->b(Landroid/graphics/Paint$Align;)V

    .line 120
    :goto_0
    invoke-virtual {p0}, Lo/ekw;->getDescription()Lo/ll;

    move-result-object v0

    const/high16 v1, 0x41200000    # 10.0f

    invoke-virtual {v0, v1}, Lo/ll;->k(F)V

    .line 121
    invoke-virtual {p0}, Lo/ekw;->getDescription()Lo/ll;

    move-result-object v0

    iget v1, p0, Lo/ekw;->aL:I

    invoke-virtual {v0, v1}, Lo/ll;->b(I)V

    .line 124
    const/high16 v0, 0x41500000    # 13.0f

    invoke-virtual {p0, v0}, Lo/ekw;->setExtraTopOffset(F)V

    .line 127
    const/high16 v0, 0x447a0000    # 1000.0f

    invoke-virtual {p0, v0}, Lo/ekw;->setMaxHighlightDistance(F)V

    .line 130
    new-instance v5, Landroid/view/GestureDetector;

    iget-object v0, p0, Lo/ekw;->a:Landroid/content/Context;

    new-instance v1, Lo/ekw$3;

    invoke-direct {v1, p0}, Lo/ekw$3;-><init>(Lo/ekw;)V

    invoke-direct {v5, v0, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    .line 164
    new-instance v6, Lo/ekw$2;

    invoke-direct {v6, p0, v5}, Lo/ekw$2;-><init>(Lo/ekw;Landroid/view/GestureDetector;)V

    .line 174
    invoke-virtual {p0, v6}, Lo/ekw;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 176
    iget-object v0, p0, Lo/ekw;->K:Lo/nd;

    check-cast v0, Lo/eja;

    iget-object v1, p0, Lo/ekw;->aK:Lo/eja$e;

    invoke-virtual {v0, v1}, Lo/eja;->c(Lo/eja$e;)V

    .line 178
    invoke-direct {p0}, Lo/ekw;->H()V

    .line 181
    invoke-virtual {p0}, Lo/ekw;->getXAxis()Lo/ln;

    move-result-object v7

    .line 182
    const/high16 v0, 0x3f000000    # 0.5f

    invoke-virtual {v7, v0}, Lo/ln;->c(F)V

    .line 183
    const v0, -0x777778

    invoke-virtual {v7, v0}, Lo/ln;->a(I)V

    .line 184
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lo/ln;->b(Z)V

    .line 185
    iget v0, p0, Lo/ekw;->aL:I

    invoke-virtual {v7, v0}, Lo/ln;->b(I)V

    .line 186
    const/high16 v0, 0x41200000    # 10.0f

    invoke-virtual {v7, v0}, Lo/ln;->k(F)V

    .line 187
    iget-object v0, p0, Lo/ekw;->aG:Lo/ekw$h;

    sget-object v1, Lo/ekw$h;->a:Lo/ekw$h;

    if-ne v0, v1, :cond_1

    .line 188
    new-instance v0, Lo/ekw$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/ekw$b;-><init>(Lo/ekw$3;)V

    invoke-virtual {v7, v0}, Lo/ln;->b(Lo/mf;)V

    goto :goto_1

    .line 190
    :cond_1
    new-instance v0, Lo/ekw$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/ekw$c;-><init>(Lo/ekw$3;)V

    invoke-virtual {v7, v0}, Lo/ln;->b(Lo/mf;)V

    .line 193
    :goto_1
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lo/ln;->b(F)V

    .line 198
    new-instance v8, Lo/elc;

    iget-object v0, p0, Lo/ekw;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/commonui/R$layout;->custom_marker_view:I

    invoke-direct {v8, v0, v1, p0}, Lo/elc;-><init>(Landroid/content/Context;ILo/eie;)V

    .line 199
    invoke-virtual {v8, p0}, Lo/elc;->setChartView(Lo/ld;)V

    .line 200
    invoke-virtual {p0, v8}, Lo/ekw;->setMarker(Lo/lk;)V

    .line 207
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lo/ekw;->setVisibility(I)V

    .line 208
    invoke-virtual {p0}, Lo/ekw;->invalidate()V

    .line 209
    return-void
.end method

.method private H()V
    .locals 5

    .line 212
    iget-object v0, p0, Lo/ekw;->ad:Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->a(Z)V

    .line 213
    iget-object v0, p0, Lo/ekw;->ad:Lo/eit;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Lo/eit;->c(F)V

    .line 214
    iget-object v0, p0, Lo/ekw;->ad:Lo/eit;

    const/16 v1, 0x7f

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/eit;->a(I)V

    .line 215
    iget-object v0, p0, Lo/ekw;->ad:Lo/eit;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/eit;->b(Z)V

    .line 217
    iget-object v0, p0, Lo/ekw;->ad:Lo/eit;

    iget v1, p0, Lo/ekw;->aH:I

    invoke-virtual {v0, v1}, Lo/eit;->e(I)V

    .line 218
    iget-object v0, p0, Lo/ekw;->ad:Lo/eit;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Lo/eit;->e(F)V

    .line 219
    iget-object v0, p0, Lo/ekw;->ad:Lo/eit;

    iget v1, p0, Lo/ekw;->aL:I

    invoke-virtual {v0, v1}, Lo/eit;->b(I)V

    .line 220
    iget-object v0, p0, Lo/ekw;->ad:Lo/eit;

    const/high16 v1, 0x41200000    # 10.0f

    invoke-virtual {v0, v1}, Lo/eit;->k(F)V

    .line 222
    iget-object v0, p0, Lo/ekw;->ad:Lo/eit;

    const/4 v1, 0x5

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/eit;->d(IZ)V

    .line 225
    iget-object v0, p0, Lo/ekw;->af:Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->a(Z)V

    .line 226
    iget-object v0, p0, Lo/ekw;->af:Lo/eit;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Lo/eit;->c(F)V

    .line 227
    iget-object v0, p0, Lo/ekw;->af:Lo/eit;

    const v1, -0x777778

    invoke-virtual {v0, v1}, Lo/eit;->a(I)V

    .line 228
    iget-object v0, p0, Lo/ekw;->af:Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->b(Z)V

    .line 229
    iget-object v0, p0, Lo/ekw;->af:Lo/eit;

    iget v1, p0, Lo/ekw;->aL:I

    invoke-virtual {v0, v1}, Lo/eit;->b(I)V

    .line 230
    iget-object v0, p0, Lo/ekw;->af:Lo/eit;

    const/high16 v1, 0x41200000    # 10.0f

    invoke-virtual {v0, v1}, Lo/eit;->k(F)V

    .line 232
    iget-object v0, p0, Lo/ekw;->af:Lo/eit;

    const/4 v1, 0x5

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/eit;->d(IZ)V

    .line 233
    return-void
.end method

.method static synthetic a(Lo/ekw;I)I
    .locals 0

    .line 40
    iput p1, p0, Lo/ekw;->aE:I

    return p1
.end method

.method static synthetic a(Lo/ekw;)J
    .locals 2

    .line 40
    iget-wide v0, p0, Lo/ekw;->aB:J

    return-wide v0
.end method

.method static synthetic b()J
    .locals 2

    .line 40
    sget-wide v0, Lo/ekw;->ab:J

    return-wide v0
.end method

.method static synthetic b(Lo/ekw;)Z
    .locals 1

    .line 40
    iget-boolean v0, p0, Lo/ekw;->I:Z

    return v0
.end method

.method static synthetic c(Lo/ekw;)Landroid/content/Context;
    .locals 1

    .line 40
    iget-object v0, p0, Lo/ekw;->a:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic d(Lo/ekw;J)J
    .locals 0

    .line 40
    iput-wide p1, p0, Lo/ekw;->aB:J

    return-wide p1
.end method

.method static synthetic d(Lo/ekw;)Lo/ekw$d;
    .locals 1

    .line 40
    iget-object v0, p0, Lo/ekw;->aD:Lo/ekw$d;

    return-object v0
.end method

.method static synthetic e(Lo/ekw;)Lo/ekw$f;
    .locals 1

    .line 40
    iget-object v0, p0, Lo/ekw;->aC:Lo/ekw$f;

    return-object v0
.end method

.method static synthetic e(Lo/ekw;I)V
    .locals 0

    .line 40
    invoke-direct {p0, p1}, Lo/ekw;->i(I)V

    return-void
.end method

.method static synthetic f(Lo/ekw;)Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
    .locals 1

    .line 40
    iget-object v0, p0, Lo/ekw;->az:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    return-object v0
.end method

.method private f(I)V
    .locals 14

    .line 597
    iget-object v0, p0, Lo/ekw;->A:Lo/ma;

    check-cast v0, Lo/ela;

    invoke-virtual {v0}, Lo/ela;->h()Ljava/util/List;

    move-result-object v4

    .line 598
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    .line 599
    const-string v0, "HwHealthLineChart"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "only support 3 lines"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 600
    return-void

    .line 603
    :cond_0
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/elb;

    invoke-virtual {v0}, Lo/elb;->ab()Ljava/util/List;

    move-result-object v5

    .line 604
    const/4 v0, 0x1

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/elb;

    invoke-virtual {v0}, Lo/elb;->ab()Ljava/util/List;

    move-result-object v6

    .line 605
    const/4 v0, 0x2

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/elb;

    invoke-virtual {v0}, Lo/elb;->ab()Ljava/util/List;

    move-result-object v7

    .line 606
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 607
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 608
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 609
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 610
    new-instance v0, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual {v12}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v1

    invoke-virtual {v12}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getY()F

    move-result v2

    invoke-virtual {v12}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getData()Ljava/lang/Object;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;-><init>(FFLjava/lang/Object;)V

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 611
    goto :goto_0

    .line 612
    :cond_1
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/github/mikephil/charting/data/Entry;

    .line 613
    new-instance v0, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual {v12}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v1

    invoke-virtual {v12}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    invoke-virtual {v12}, Lcom/github/mikephil/charting/data/Entry;->getData()Ljava/lang/Object;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;-><init>(FFLjava/lang/Object;)V

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 614
    goto :goto_1

    .line 615
    :cond_2
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/github/mikephil/charting/data/Entry;

    .line 616
    new-instance v0, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual {v12}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v1

    invoke-virtual {v12}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    invoke-virtual {v12}, Lcom/github/mikephil/charting/data/Entry;->getData()Ljava/lang/Object;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;-><init>(FFLjava/lang/Object;)V

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 617
    goto :goto_2

    .line 620
    :cond_3
    iget-object v0, p0, Lo/ekw;->aM:Lo/ekw$e;

    invoke-interface {v0}, Lo/ekw$e;->d()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 621
    iget-object v0, p0, Lo/ekw;->aM:Lo/ekw$e;

    const/4 v1, 0x0

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/elb;

    invoke-interface {v0, v8, v1}, Lo/ekw$e;->b(Ljava/util/List;Lo/elb;)V

    .line 622
    iget-object v0, p0, Lo/ekw;->aM:Lo/ekw$e;

    const/4 v1, 0x1

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/elb;

    invoke-interface {v0, v9, v1}, Lo/ekw$e;->b(Ljava/util/List;Lo/elb;)V

    .line 623
    iget-object v0, p0, Lo/ekw;->aM:Lo/ekw$e;

    const/4 v1, 0x2

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/elb;

    invoke-interface {v0, v10, v1}, Lo/ekw$e;->b(Ljava/util/List;Lo/elb;)V

    .line 625
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/elb;

    invoke-virtual {v0}, Lo/elb;->al()V

    .line 626
    const/4 v0, 0x1

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/elb;

    invoke-virtual {v0}, Lo/elb;->al()V

    .line 627
    const/4 v0, 0x2

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/elb;

    invoke-virtual {v0}, Lo/elb;->al()V

    .line 631
    :cond_4
    iget-object v0, p0, Lo/ekw;->aM:Lo/ekw$e;

    invoke-interface {v0}, Lo/ekw$e;->c()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 632
    iget-object v0, p0, Lo/ekw;->aM:Lo/ekw$e;

    const/4 v1, 0x0

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/elb;

    invoke-interface {v0, v8, p1, v1}, Lo/ekw$e;->d(Ljava/util/List;ILo/elb;)I

    move-result v11

    .line 633
    iget-object v0, p0, Lo/ekw;->aM:Lo/ekw$e;

    const/4 v1, 0x1

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/elb;

    invoke-interface {v0, v9, p1, v1}, Lo/ekw$e;->d(Ljava/util/List;ILo/elb;)I

    move-result v12

    .line 634
    iget-object v0, p0, Lo/ekw;->aM:Lo/ekw$e;

    const/4 v1, 0x2

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/elb;

    invoke-interface {v0, v10, p1, v1}, Lo/ekw$e;->d(Ljava/util/List;ILo/elb;)I

    move-result v13

    .line 637
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/elb;

    invoke-virtual {v0, v11}, Lo/elb;->l(I)V

    .line 638
    const/4 v0, 0x1

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/elb;

    invoke-virtual {v0, v12}, Lo/elb;->l(I)V

    .line 639
    const/4 v0, 0x2

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/elb;

    invoke-virtual {v0, v13}, Lo/elb;->l(I)V

    .line 642
    :cond_5
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/elb;

    .line 643
    const/4 v0, 0x1

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lo/elb;

    .line 644
    const/4 v0, 0x2

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/elb;

    .line 645
    invoke-virtual {v11, v8}, Lo/elb;->d(Ljava/util/List;)V

    .line 646
    invoke-virtual {v12, v9}, Lo/elb;->d(Ljava/util/List;)V

    .line 647
    invoke-virtual {v13, v10}, Lo/elb;->d(Ljava/util/List;)V

    .line 649
    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Lo/elb;->a(Z)V

    .line 650
    const/4 v0, 0x1

    invoke-virtual {v12, v0}, Lo/elb;->a(Z)V

    .line 651
    const/4 v0, 0x1

    invoke-virtual {v13, v0}, Lo/elb;->a(Z)V

    .line 657
    return-void
.end method

.method private g(I)V
    .locals 9

    .line 236
    if-nez p1, :cond_0

    .line 237
    const-string v0, "HwHealthLineChart"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fillOriginalData showCounts zero,why?,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 238
    return-void

    .line 241
    :cond_0
    iget-object v0, p0, Lo/ekw;->A:Lo/ma;

    check-cast v0, Lo/ela;

    invoke-virtual {v0}, Lo/ela;->h()Ljava/util/List;

    move-result-object v4

    .line 242
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    .line 243
    const-string v0, "HwHealthLineChart"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "only support 1 lines"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 244
    return-void

    .line 246
    :cond_1
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/elb;

    invoke-virtual {v0}, Lo/elb;->ab()Ljava/util/List;

    move-result-object v5

    .line 247
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 248
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 249
    new-instance v0, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual {v8}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v1

    invoke-virtual {v8}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getY()F

    move-result v2

    invoke-virtual {v8}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getData()Ljava/lang/Object;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;-><init>(FFLjava/lang/Object;)V

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 250
    goto :goto_0

    .line 252
    :cond_2
    iget-object v0, p0, Lo/ekw;->aM:Lo/ekw$e;

    invoke-interface {v0}, Lo/ekw$e;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 253
    iget-object v0, p0, Lo/ekw;->aM:Lo/ekw$e;

    const/4 v1, 0x0

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/elb;

    invoke-interface {v0, v6, v1}, Lo/ekw$e;->b(Ljava/util/List;Lo/elb;)V

    .line 255
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/elb;

    invoke-virtual {v0}, Lo/elb;->al()V

    .line 258
    :cond_3
    iget-object v0, p0, Lo/ekw;->aM:Lo/ekw$e;

    invoke-interface {v0}, Lo/ekw$e;->c()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 259
    iget-object v0, p0, Lo/ekw;->aM:Lo/ekw$e;

    const/4 v1, 0x0

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/elb;

    invoke-interface {v0, v6, p1, v1}, Lo/ekw$e;->d(Ljava/util/List;ILo/elb;)I

    move-result v7

    .line 261
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/elb;

    invoke-virtual {v0, v7}, Lo/elb;->l(I)V

    .line 264
    :cond_4
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/elb;

    .line 265
    invoke-virtual {v7, v6}, Lo/elb;->d(Ljava/util/List;)V

    .line 267
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Lo/elb;->a(Z)V

    .line 273
    return-void
.end method

.method private h(I)V
    .locals 11

    .line 280
    iget-object v0, p0, Lo/ekw;->A:Lo/ma;

    check-cast v0, Lo/ela;

    invoke-virtual {v0}, Lo/ela;->h()Ljava/util/List;

    move-result-object v4

    .line 281
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 282
    const-string v0, "HwHealthLineChart"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "only support 2 lines"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 283
    return-void

    .line 287
    :cond_0
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/elb;

    invoke-virtual {v0}, Lo/elb;->ab()Ljava/util/List;

    move-result-object v5

    .line 288
    const/4 v0, 0x1

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/elb;

    invoke-virtual {v0}, Lo/elb;->ab()Ljava/util/List;

    move-result-object v6

    .line 289
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 290
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 291
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/github/mikephil/charting/data/Entry;

    .line 292
    new-instance v0, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual {v10}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v1

    invoke-virtual {v10}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    invoke-virtual {v10}, Lcom/github/mikephil/charting/data/Entry;->getData()Ljava/lang/Object;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;-><init>(FFLjava/lang/Object;)V

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 293
    goto :goto_0

    .line 294
    :cond_1
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/github/mikephil/charting/data/Entry;

    .line 295
    new-instance v0, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual {v10}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v1

    invoke-virtual {v10}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    invoke-virtual {v10}, Lcom/github/mikephil/charting/data/Entry;->getData()Ljava/lang/Object;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;-><init>(FFLjava/lang/Object;)V

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 296
    goto :goto_1

    .line 299
    :cond_2
    iget-object v0, p0, Lo/ekw;->aM:Lo/ekw$e;

    invoke-interface {v0}, Lo/ekw$e;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 300
    iget-object v0, p0, Lo/ekw;->aM:Lo/ekw$e;

    const/4 v1, 0x0

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/elb;

    invoke-interface {v0, v7, v1}, Lo/ekw$e;->b(Ljava/util/List;Lo/elb;)V

    .line 301
    iget-object v0, p0, Lo/ekw;->aM:Lo/ekw$e;

    const/4 v1, 0x1

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/elb;

    invoke-interface {v0, v8, v1}, Lo/ekw$e;->b(Ljava/util/List;Lo/elb;)V

    .line 303
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/elb;

    invoke-virtual {v0}, Lo/elb;->al()V

    .line 304
    const/4 v0, 0x1

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/elb;

    invoke-virtual {v0}, Lo/elb;->al()V

    .line 307
    :cond_3
    iget-object v0, p0, Lo/ekw;->aM:Lo/ekw$e;

    invoke-interface {v0}, Lo/ekw$e;->c()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 308
    iget-object v0, p0, Lo/ekw;->aM:Lo/ekw$e;

    const/4 v1, 0x0

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/elb;

    invoke-interface {v0, v7, p1, v1}, Lo/ekw$e;->d(Ljava/util/List;ILo/elb;)I

    move-result v9

    .line 309
    iget-object v0, p0, Lo/ekw;->aM:Lo/ekw$e;

    const/4 v1, 0x1

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/elb;

    invoke-interface {v0, v8, p1, v1}, Lo/ekw$e;->d(Ljava/util/List;ILo/elb;)I

    move-result v10

    .line 312
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/elb;

    invoke-virtual {v0, v9}, Lo/elb;->l(I)V

    .line 313
    const/4 v0, 0x1

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/elb;

    invoke-virtual {v0, v10}, Lo/elb;->l(I)V

    .line 316
    :cond_4
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/elb;

    .line 317
    const/4 v0, 0x1

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/elb;

    .line 318
    invoke-virtual {v9, v7}, Lo/elb;->d(Ljava/util/List;)V

    .line 319
    invoke-virtual {v10, v8}, Lo/elb;->d(Ljava/util/List;)V

    .line 321
    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Lo/elb;->a(Z)V

    .line 322
    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Lo/elb;->a(Z)V

    .line 328
    return-void
.end method

.method private i(I)V
    .locals 10

    .line 464
    iget-object v0, p0, Lo/ekw;->A:Lo/ma;

    if-nez v0, :cond_0

    .line 465
    return-void

    .line 468
    :cond_0
    invoke-virtual {p0}, Lo/ekw;->e()V

    .line 470
    const-string v0, "HwHealthLineChart"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "dataCounts:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 476
    const-string v0, "HwHealthLineChart"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "dataCounts:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 477
    iget-object v0, p0, Lo/ekw;->A:Lo/ma;

    check-cast v0, Lo/ela;

    invoke-virtual {v0}, Lo/ela;->h()Ljava/util/List;

    move-result-object v4

    .line 478
    const-string v0, "HwHealthLineChart"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "fillOriginalData mData size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 479
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 480
    return-void

    .line 482
    :cond_1
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ekz;

    .line 483
    invoke-interface {v6}, Lo/ekz;->ab()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Lo/ekz;->ab()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_3

    .line 484
    :cond_2
    return-void

    .line 486
    :cond_3
    goto :goto_0

    .line 488
    :cond_4
    const/4 v5, 0x1

    .line 489
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/ekz;

    .line 490
    if-eqz v5, :cond_5

    .line 491
    const-string v0, "HwHealthLineChart"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "firData setDrawFilled true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 492
    const/4 v0, 0x1

    invoke-interface {v7, v0}, Lo/ekz;->d(Z)V

    .line 493
    const/4 v5, 0x0

    goto :goto_2

    .line 495
    :cond_5
    const-string v0, "HwHealthLineChart"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not firData setDrawFilled false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 496
    const/4 v0, 0x0

    invoke-interface {v7, v0}, Lo/ekz;->d(Z)V

    .line 498
    :goto_2
    goto :goto_1

    .line 500
    :cond_6
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_7

    .line 501
    invoke-direct {p0, p1}, Lo/ekw;->h(I)V

    goto :goto_3

    .line 502
    :cond_7
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_8

    .line 503
    invoke-direct {p0, p1}, Lo/ekw;->g(I)V

    goto :goto_3

    .line 504
    :cond_8
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_9

    .line 505
    invoke-direct {p0, p1}, Lo/ekw;->f(I)V

    .line 508
    :cond_9
    :goto_3
    iget-object v0, p0, Lo/ekw;->aF:Lo/ekm;

    if-eqz v0, :cond_b

    .line 509
    iget-object v0, p0, Lo/ekw;->A:Lo/ma;

    check-cast v0, Lo/ela;

    invoke-virtual {v0}, Lo/ela;->h()Ljava/util/List;

    move-result-object v6

    .line 510
    const-string v7, ""

    .line 511
    if-nez v6, :cond_a

    .line 512
    const-string v0, "HwHealthLineChart"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setTitle not find data,lineDataSets size zero,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 513
    return-void

    .line 515
    :cond_a
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v8

    .line 517
    packed-switch v8, :pswitch_data_0

    goto/16 :goto_4

    .line 519
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/elb;

    invoke-virtual {v1}, Lo/elb;->af()Lo/eks;

    move-result-object v1

    iget-object v1, v1, Lo/eks;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 520
    goto/16 :goto_5

    .line 523
    :pswitch_1
    iget-object v0, p0, Lo/ekw;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_hwh_motiontrack_detail_chart_title_two:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 524
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    .line 525
    const/4 v2, 0x0

    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/elb;

    invoke-virtual {v2}, Lo/elb;->af()Lo/eks;

    move-result-object v2

    iget-object v2, v2, Lo/eks;->e:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 526
    const/4 v2, 0x1

    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/elb;

    invoke-virtual {v2}, Lo/elb;->af()Lo/eks;

    move-result-object v2

    iget-object v2, v2, Lo/eks;->e:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 524
    invoke-static {v9, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 527
    goto/16 :goto_5

    .line 530
    :pswitch_2
    iget-object v0, p0, Lo/ekw;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_hwh_motiontrack_detail_chart_title_three:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 531
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    .line 532
    const/4 v2, 0x0

    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/elb;

    invoke-virtual {v2}, Lo/elb;->af()Lo/eks;

    move-result-object v2

    iget-object v2, v2, Lo/eks;->e:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 533
    const/4 v2, 0x1

    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/elb;

    invoke-virtual {v2}, Lo/elb;->af()Lo/eks;

    move-result-object v2

    iget-object v2, v2, Lo/eks;->e:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 534
    const/4 v2, 0x2

    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/elb;

    invoke-virtual {v2}, Lo/elb;->af()Lo/eks;

    move-result-object v2

    iget-object v2, v2, Lo/eks;->e:Ljava/lang/String;

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 531
    invoke-static {v9, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 535
    goto :goto_5

    .line 538
    :goto_4
    const-string v0, "HwHealthLineChart"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "lineDataSets.size not support:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 541
    :goto_5
    iget-object v0, p0, Lo/ekw;->aF:Lo/ekm;

    invoke-virtual {v0, v7}, Lo/ekm;->setTitle(Ljava/lang/String;)V

    .line 543
    :cond_b
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic k(Lo/ekw;)I
    .locals 1

    .line 40
    iget v0, p0, Lo/ekw;->aE:I

    return v0
.end method


# virtual methods
.method public a(Lo/ekw$e;)V
    .locals 1

    .line 780
    if-nez p1, :cond_0

    .line 781
    iget-object v0, p0, Lo/ekw;->aI:Lo/ekw$e;

    iput-object v0, p0, Lo/ekw;->aM:Lo/ekw$e;

    .line 782
    return-void

    .line 784
    :cond_0
    iput-object p1, p0, Lo/ekw;->aM:Lo/ekw$e;

    .line 785
    return-void
.end method

.method public c()V
    .locals 4

    .line 437
    invoke-virtual {p0}, Lo/ekw;->getWidth()I

    move-result v0

    if-nez v0, :cond_0

    .line 438
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/ekw;->setVisibility(I)V

    .line 439
    invoke-virtual {p0}, Lo/ekw;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lo/ekw;->az:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 440
    return-void

    .line 442
    :cond_0
    iget v0, p0, Lo/ekw;->aE:I

    if-nez v0, :cond_1

    .line 443
    const-string v0, "HwHealthLineChart"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mOneScreenShowCounts null,width not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 444
    return-void

    .line 446
    :cond_1
    iget v0, p0, Lo/ekw;->aE:I

    invoke-virtual {p0, v0}, Lo/ekw;->k(I)V

    .line 447
    return-void
.end method

.method protected e()V
    .locals 5

    .line 551
    iget-object v0, p0, Lo/ekw;->A:Lo/ma;

    check-cast v0, Lo/ela;

    invoke-virtual {v0}, Lo/ela;->h()Ljava/util/List;

    move-result-object v4

    .line 552
    const-string v0, "HwHealthLineChart"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "fillOriginalData mLineData size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 553
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 554
    return-void

    .line 557
    :cond_0
    iget-object v0, p0, Lo/ekw;->ad:Lo/eit;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/eit;->d(Z)V

    .line 558
    iget-object v0, p0, Lo/ekw;->af:Lo/eit;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/eit;->d(Z)V

    .line 559
    iget-object v0, p0, Lo/ekw;->ah:Lo/eit;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/eit;->d(Z)V

    .line 561
    iget-object v0, p0, Lo/ekw;->ad:Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->a(Z)V

    .line 562
    iget-object v0, p0, Lo/ekw;->af:Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->a(Z)V

    .line 563
    iget-object v0, p0, Lo/ekw;->ah:Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->a(Z)V

    .line 565
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 567
    iget-object v0, p0, Lo/ekw;->ad:Lo/eit;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/eit;->e(Z)V

    .line 568
    iget-object v0, p0, Lo/ekw;->af:Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->e(Z)V

    .line 569
    iget-object v0, p0, Lo/ekw;->ah:Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->e(Z)V

    .line 572
    :cond_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 573
    iget-object v0, p0, Lo/ekw;->ad:Lo/eit;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/eit;->e(Z)V

    .line 574
    iget-object v0, p0, Lo/ekw;->af:Lo/eit;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/eit;->e(Z)V

    .line 575
    iget-object v0, p0, Lo/ekw;->ah:Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->e(Z)V

    .line 578
    :cond_2
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    .line 579
    iget-object v0, p0, Lo/ekw;->ad:Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->e(Z)V

    .line 580
    iget-object v0, p0, Lo/ekw;->af:Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->e(Z)V

    .line 581
    iget-object v0, p0, Lo/ekw;->ah:Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->e(Z)V

    .line 585
    :cond_3
    iget-boolean v0, p0, Lo/ekw;->aJ:Z

    if-eqz v0, :cond_4

    .line 586
    iget-object v0, p0, Lo/ekw;->ad:Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->e(Z)V

    .line 587
    iget-object v0, p0, Lo/ekw;->af:Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->e(Z)V

    .line 588
    iget-object v0, p0, Lo/ekw;->ah:Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->e(Z)V

    .line 590
    :cond_4
    return-void
.end method

.method public k(I)V
    .locals 4

    .line 452
    invoke-direct {p0, p1}, Lo/ekw;->i(I)V

    .line 453
    invoke-virtual {p0}, Lo/ekw;->h()V

    .line 454
    invoke-virtual {p0}, Lo/ekw;->invalidate()V

    .line 455
    iget-object v0, p0, Lo/ekw;->A:Lo/ma;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/ekw;->A:Lo/ma;

    check-cast v0, Lo/ela;

    invoke-virtual {v0}, Lo/ela;->h()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 456
    iget-object v0, p0, Lo/ekw;->A:Lo/ma;

    check-cast v0, Lo/ela;

    invoke-virtual {v0}, Lo/ela;->h()Ljava/util/List;

    move-result-object v1

    .line 457
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/ekz;

    .line 458
    invoke-interface {v3}, Lo/ekz;->an()V

    .line 459
    goto :goto_0

    .line 461
    :cond_0
    return-void
.end method

.method public setLabelColor(I)V
    .locals 5

    .line 752
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v0

    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v1

    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result v2

    const/16 v3, 0x80

    invoke-static {v3, v0, v1, v2}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/ekw;->aL:I

    .line 753
    invoke-virtual {p0}, Lo/ekw;->getDescription()Lo/ll;

    move-result-object v0

    iget v1, p0, Lo/ekw;->aL:I

    invoke-virtual {v0, v1}, Lo/ll;->b(I)V

    .line 754
    invoke-virtual {p0}, Lo/ekw;->getXAxis()Lo/ln;

    move-result-object v4

    .line 755
    iget v0, p0, Lo/ekw;->aL:I

    invoke-virtual {v4, v0}, Lo/ln;->b(I)V

    .line 756
    iget-object v0, p0, Lo/ekw;->ad:Lo/eit;

    iget v1, p0, Lo/ekw;->aL:I

    invoke-virtual {v0, v1}, Lo/eit;->b(I)V

    .line 757
    iget-object v0, p0, Lo/ekw;->af:Lo/eit;

    iget v1, p0, Lo/ekw;->aL:I

    invoke-virtual {v0, v1}, Lo/eit;->b(I)V

    .line 759
    iget-object v0, p0, Lo/ekw;->N:Lo/lm;

    iget v1, p0, Lo/ekw;->aL:I

    invoke-virtual {v0, v1}, Lo/lm;->b(I)V

    .line 762
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v0

    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v1

    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result v2

    const/16 v3, 0x33

    invoke-static {v3, v0, v1, v2}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/ekw;->aH:I

    .line 763
    iget-object v0, p0, Lo/ekw;->ad:Lo/eit;

    iget v1, p0, Lo/ekw;->aH:I

    invoke-virtual {v0, v1}, Lo/eit;->e(I)V

    .line 764
    return-void
.end method

.method public setOnDoubleTapListener(Lo/ekw$d;)V
    .locals 0

    .line 712
    iput-object p1, p0, Lo/ekw;->aD:Lo/ekw$d;

    .line 713
    return-void
.end method

.method public setOnSingleTapConfirmedListener(Lo/ekw$f;)V
    .locals 0

    .line 708
    iput-object p1, p0, Lo/ekw;->aC:Lo/ekw$f;

    .line 709
    return-void
.end method

.method public setTimeValueMode(Lo/ekw$h;)V
    .locals 4

    .line 662
    iput-object p1, p0, Lo/ekw;->aG:Lo/ekw$h;

    .line 664
    invoke-virtual {p0}, Lo/ekw;->getXAxis()Lo/ln;

    move-result-object v3

    .line 665
    iget-object v0, p0, Lo/ekw;->aG:Lo/ekw$h;

    sget-object v1, Lo/ekw$h;->a:Lo/ekw$h;

    if-ne v0, v1, :cond_0

    .line 666
    new-instance v0, Lo/ekw$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/ekw$b;-><init>(Lo/ekw$3;)V

    invoke-virtual {v3, v0}, Lo/ln;->b(Lo/mf;)V

    .line 667
    invoke-virtual {p0}, Lo/ekw;->getDescription()Lo/ll;

    move-result-object v0

    invoke-virtual {p0}, Lo/ekw;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/commonui/R$string;->IDS_hwh_motiontrack_detail_chart_time_min:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ll;->d(Ljava/lang/String;)V

    goto :goto_0

    .line 669
    :cond_0
    new-instance v0, Lo/ekw$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/ekw$c;-><init>(Lo/ekw$3;)V

    invoke-virtual {v3, v0}, Lo/ln;->b(Lo/mf;)V

    .line 670
    invoke-virtual {p0}, Lo/ekw;->getDescription()Lo/ll;

    move-result-object v0

    invoke-virtual {p0}, Lo/ekw;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/commonui/R$string;->IDS_hwh_motiontrack_detail_chart_time:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ll;->d(Ljava/lang/String;)V

    .line 672
    :goto_0
    return-void
.end method

.method public setTitleBar(Lo/ekm;)V
    .locals 0

    .line 675
    iput-object p1, p0, Lo/ekw;->aF:Lo/ekm;

    .line 676
    return-void
.end method
