.class public Lo/eye;
.super Lo/ehd;
.source "SourceFile"


# instance fields
.field private a:Lo/eyv;

.field private b:Lo/eyv;

.field private c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Lo/eic;Lo/ehn;>;"
        }
    .end annotation
.end field

.field private d:Lo/ejk;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 45
    invoke-direct {p0, p1}, Lo/ehd;-><init>(Landroid/content/Context;)V

    .line 48
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/eye;->c:Ljava/util/Map;

    .line 65
    new-instance v0, Lo/exx;

    invoke-direct {v0}, Lo/exx;-><init>()V

    iput-object v0, p0, Lo/eye;->d:Lo/ejk;

    .line 109
    new-instance v0, Lo/eye$4;

    invoke-direct {v0, p0}, Lo/eye$4;-><init>(Lo/eye;)V

    iput-object v0, p0, Lo/eye;->b:Lo/eyv;

    .line 144
    new-instance v0, Lo/eye$1;

    invoke-direct {v0, p0}, Lo/eye$1;-><init>(Lo/eye;)V

    iput-object v0, p0, Lo/eye;->a:Lo/eyv;

    .line 46
    return-void
.end method

.method static synthetic d(Lo/eye;)Ljava/util/Map;
    .locals 1

    .line 39
    iget-object v0, p0, Lo/eye;->c:Ljava/util/Map;

    return-object v0
.end method


# virtual methods
.method protected a(Lo/eho;Lo/eic;Lo/ehe$a;)Lo/ehn;
    .locals 5

    .line 200
    invoke-super {p0, p1, p2, p3}, Lo/ehd;->a(Lo/eho;Lo/eic;Lo/ehe$a;)Lo/ehn;

    move-result-object v4

    .line 201
    iget-object v0, p0, Lo/eye;->c:Ljava/util/Map;

    invoke-interface {v0, p2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    invoke-virtual {p2}, Lo/eic;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 207
    const/16 v0, 0xff

    const/16 v1, 0x8a

    const/16 v2, 0x2b

    const/16 v3, 0xe2

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v4, v0}, Lo/ehn;->g(I)V

    .line 209
    :cond_0
    return-object v4
.end method

.method public b(Lo/eii;FF)F
    .locals 2

    .line 52
    float-to-double v0, p2

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    const/4 v1, 0x5

    invoke-static {v0, v1}, Lo/ezy;->b(II)I

    move-result v0

    int-to-float v0, v0

    return v0
.end method

.method protected b(Lo/eho;Lo/eic;)V
    .locals 4

    .line 69
    invoke-virtual {p2}, Lo/eic;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lo/eic;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 71
    iget-object v0, p0, Lo/eye;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lo/eye$2;

    invoke-direct {v1, p0, p1}, Lo/eye$2;-><init>(Lo/eye;Lo/eho;)V

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-virtual {v0, v2, v3, v1}, Lo/clq;->d(IILo/clz;)V

    goto :goto_0

    .line 100
    :cond_0
    invoke-virtual {p2}, Lo/eic;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lo/eic;->d()Z

    move-result v0

    if-nez v0, :cond_1

    .line 101
    const/16 v0, 0xff

    const/16 v1, 0x16

    const/16 v2, 0xd9

    const/16 v3, 0xa1

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/16 v1, 0x1e

    invoke-virtual {p1, v1, v0}, Lo/eho;->d(II)V

    .line 102
    invoke-virtual {p1}, Lo/eho;->ak()V

    .line 103
    invoke-virtual {p1}, Lo/eho;->c()V

    .line 105
    :cond_1
    :goto_0
    return-void
.end method

.method public c(Lo/eii;FF)F
    .locals 1

    .line 57
    const/4 v0, 0x0

    return v0
.end method

.method public c(Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;)Ljava/lang/String;
    .locals 4

    .line 214
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getY()F

    move-result v0

    float-to-int v0, v0

    const/high16 v1, -0x80000000

    if-ne v0, v1, :cond_1

    .line 215
    :cond_0
    const-string v0, "--"

    return-object v0

    .line 217
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getY()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d()Lo/ejk;
    .locals 1

    .line 62
    iget-object v0, p0, Lo/eye;->d:Lo/ejk;

    return-object v0
.end method

.method protected synthetic e(Lo/eih;Lo/eic;Lo/ehe$a;)Lo/eii;
    .locals 1

    .line 39
    move-object v0, p1

    check-cast v0, Lo/eho;

    invoke-virtual {p0, v0, p2, p3}, Lo/eye;->a(Lo/eho;Lo/eic;Lo/ehe$a;)Lo/ehn;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic e(Lo/eih;Lo/eic;)V
    .locals 1

    .line 39
    move-object v0, p1

    check-cast v0, Lo/eho;

    invoke-virtual {p0, v0, p2}, Lo/eye;->b(Lo/eho;Lo/eic;)V

    return-void
.end method
