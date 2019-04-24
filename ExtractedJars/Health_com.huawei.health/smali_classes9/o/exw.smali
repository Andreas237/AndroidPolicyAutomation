.class public Lo/exw;
.super Lo/ehc;
.source "SourceFile"

# interfaces
.implements Lo/eyp;
.implements Lo/ezx;


# instance fields
.field private a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Lo/eic;Lo/eii;>;"
        }
    .end annotation
.end field

.field private b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Lo/eic;Lo/eii;>;"
        }
    .end annotation
.end field

.field private c:Lo/ejk;

.field private d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Lo/eic;Lo/eii;>;"
        }
    .end annotation
.end field

.field private f:Lo/eyv;

.field private g:Lo/eyv;

.field private h:Lo/eyv;

.field private i:Lo/eyv;

.field private k:Lo/eyv;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 47
    invoke-direct {p0, p1}, Lo/ehc;-><init>(Landroid/content/Context;)V

    .line 42
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/exw;->a:Ljava/util/Map;

    .line 43
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/exw;->b:Ljava/util/Map;

    .line 44
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/exw;->d:Ljava/util/Map;

    .line 64
    new-instance v0, Lo/ewf;

    invoke-direct {v0}, Lo/ewf;-><init>()V

    iput-object v0, p0, Lo/exw;->c:Lo/ejk;

    .line 99
    new-instance v0, Lo/exw$5;

    invoke-direct {v0, p0}, Lo/exw$5;-><init>(Lo/exw;)V

    iput-object v0, p0, Lo/exw;->i:Lo/eyv;

    .line 133
    new-instance v0, Lo/exw$2;

    invoke-direct {v0, p0}, Lo/exw$2;-><init>(Lo/exw;)V

    iput-object v0, p0, Lo/exw;->f:Lo/eyv;

    .line 168
    new-instance v0, Lo/exw$1;

    invoke-direct {v0, p0}, Lo/exw$1;-><init>(Lo/exw;)V

    iput-object v0, p0, Lo/exw;->g:Lo/eyv;

    .line 203
    new-instance v0, Lo/exw$4;

    invoke-direct {v0, p0}, Lo/exw$4;-><init>(Lo/exw;)V

    iput-object v0, p0, Lo/exw;->k:Lo/eyv;

    .line 240
    new-instance v0, Lo/exw$3;

    invoke-direct {v0, p0}, Lo/exw$3;-><init>(Lo/exw;)V

    iput-object v0, p0, Lo/exw;->h:Lo/eyv;

    .line 48
    return-void
.end method

.method static synthetic a(Lo/exw;)Ljava/util/Map;
    .locals 1

    .line 37
    iget-object v0, p0, Lo/exw;->b:Ljava/util/Map;

    return-object v0
.end method

.method private a(Lo/eii;Lo/ehe$a;)V
    .locals 2

    .line 82
    const-string v0, "normal_hr"

    invoke-virtual {p2}, Lo/ehe$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 83
    iget-object v0, p0, Lo/exw;->a:Ljava/util/Map;

    invoke-virtual {p2}, Lo/ehe$a;->d()Lo/eic;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 84
    :cond_0
    const-string v0, "rest_hr"

    invoke-virtual {p2}, Lo/ehe$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 85
    iget-object v0, p0, Lo/exw;->b:Ljava/util/Map;

    invoke-virtual {p2}, Lo/ehe$a;->d()Lo/eic;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 86
    :cond_1
    const-string v0, "warning_hr"

    invoke-virtual {p2}, Lo/ehe$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 87
    iget-object v0, p0, Lo/exw;->d:Ljava/util/Map;

    invoke-virtual {p2}, Lo/ehe$a;->d()Lo/eic;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    :cond_2
    :goto_0
    return-void
.end method

.method static synthetic c(Lo/exw;)Ljava/util/Map;
    .locals 1

    .line 37
    iget-object v0, p0, Lo/exw;->a:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic d(Lo/exw;)Ljava/util/Map;
    .locals 1

    .line 37
    iget-object v0, p0, Lo/exw;->d:Ljava/util/Map;

    return-object v0
.end method


# virtual methods
.method protected a(Lo/ehv;Lo/eic;Lo/ehe$a;)Lo/eii;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/ehv;Lo/eic;Lo/ehe$a;)Lo/eii<+Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;>;"
        }
    .end annotation

    .line 70
    invoke-super {p0, p1, p2, p3}, Lo/ehc;->a(Lo/ehv;Lo/eic;Lo/ehe$a;)Lo/eii;

    move-result-object v0

    .line 71
    invoke-direct {p0, v0, p3}, Lo/exw;->a(Lo/eii;Lo/ehe$a;)V

    .line 72
    return-object v0
.end method

.method public a()Lo/eyv;
    .locals 1

    .line 278
    iget-object v0, p0, Lo/exw;->f:Lo/eyv;

    return-object v0
.end method

.method public b(Lo/eii;FF)F
    .locals 1

    .line 52
    const/high16 v0, 0x435c0000    # 220.0f

    return v0
.end method

.method protected b(Lo/ehe$a;)Lo/eii;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/ehe$a;)Lo/eii<+Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;>;"
        }
    .end annotation

    .line 94
    invoke-super {p0, p1}, Lo/ehc;->b(Lo/ehe$a;)Lo/eii;

    move-result-object v0

    .line 95
    invoke-direct {p0, v0, p1}, Lo/exw;->a(Lo/eii;Lo/ehe$a;)V

    .line 96
    return-object v0
.end method

.method public b()Lo/eyv;
    .locals 1

    .line 293
    iget-object v0, p0, Lo/exw;->k:Lo/eyv;

    return-object v0
.end method

.method public c(Lo/eii;FF)F
    .locals 1

    .line 57
    const/high16 v0, 0x42200000    # 40.0f

    return v0
.end method

.method public c()Lo/eyv;
    .locals 1

    .line 286
    iget-object v0, p0, Lo/exw;->i:Lo/eyv;

    return-object v0
.end method

.method public d(Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;)Ljava/lang/String;
    .locals 8

    .line 302
    instance-of v0, p1, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;

    if-eqz v0, :cond_0

    .line 303
    move-object v0, p1

    check-cast v0, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->acquireModel()Lo/ejp;

    move-result-object v0

    invoke-static {v0}, Lo/eko;->c(Lo/ejp;)F

    move-result v4

    .line 304
    move-object v0, p1

    check-cast v0, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->acquireModel()Lo/ejp;

    move-result-object v0

    invoke-static {v0}, Lo/eko;->d(Lo/ejp;)F

    move-result v5

    .line 305
    float-to-double v0, v4

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v6

    .line 306
    float-to-double v0, v5

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v7

    .line 307
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " - "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 309
    :cond_0
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
    iget-object v0, p0, Lo/exw;->c:Lo/ejk;

    return-object v0
.end method

.method public d(Lo/eih;Lo/eic;Lo/ejv;)V
    .locals 2

    .line 318
    iget-object v0, p0, Lo/exw;->d:Ljava/util/Map;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/exw;->d:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 320
    :cond_0
    return-void

    .line 322
    :cond_1
    iget-object v0, p0, Lo/exw;->d:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/eii;

    .line 323
    invoke-virtual {v1, p1, p3}, Lo/eii;->c(Lo/eih;Lo/ejv;)F

    .line 324
    return-void
.end method

.method protected synthetic e(Lo/eih;Lo/eic;Lo/ehe$a;)Lo/eii;
    .locals 1

    .line 37
    move-object v0, p1

    check-cast v0, Lo/ehv;

    invoke-virtual {p0, v0, p2, p3}, Lo/exw;->a(Lo/ehv;Lo/eic;Lo/ehe$a;)Lo/eii;

    move-result-object v0

    return-object v0
.end method

.method public e()Lo/eyv;
    .locals 1

    .line 282
    iget-object v0, p0, Lo/exw;->g:Lo/eyv;

    return-object v0
.end method

.method public g()Lo/eyv;
    .locals 1

    .line 297
    iget-object v0, p0, Lo/exw;->h:Lo/eyv;

    return-object v0
.end method
