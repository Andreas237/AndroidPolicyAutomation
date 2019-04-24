.class public Lo/eya;
.super Lo/ehk;
.source "SourceFile"

# interfaces
.implements Lo/eyp;
.implements Lo/ezx;


# instance fields
.field private a:Lo/ejk;

.field private b:Lo/eyv;

.field private c:Lo/eii;

.field private d:Lo/eii;

.field private f:Lo/eyv;

.field private i:Lo/eyv;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 47
    invoke-direct {p0, p1}, Lo/ehk;-><init>(Landroid/content/Context;)V

    .line 178
    new-instance v0, Lo/ewf;

    invoke-direct {v0}, Lo/ewf;-><init>()V

    iput-object v0, p0, Lo/eya;->a:Lo/ejk;

    .line 180
    new-instance v0, Lo/eya$2;

    invoke-direct {v0, p0}, Lo/eya$2;-><init>(Lo/eya;)V

    iput-object v0, p0, Lo/eya;->b:Lo/eyv;

    .line 242
    new-instance v0, Lo/eya$9;

    invoke-direct {v0, p0}, Lo/eya$9;-><init>(Lo/eya;)V

    iput-object v0, p0, Lo/eya;->f:Lo/eyv;

    .line 280
    new-instance v0, Lo/eya$8;

    invoke-direct {v0, p0}, Lo/eya$8;-><init>(Lo/eya;)V

    iput-object v0, p0, Lo/eya;->i:Lo/eyv;

    .line 48
    return-void
.end method

.method static synthetic b(Lo/eya;)Lo/eii;
    .locals 1

    .line 34
    iget-object v0, p0, Lo/eya;->d:Lo/eii;

    return-object v0
.end method

.method static synthetic e(Lo/eya;)Lo/eii;
    .locals 1

    .line 34
    iget-object v0, p0, Lo/eya;->c:Lo/eii;

    return-object v0
.end method

.method private e(Lo/elb;Lo/ehe$a;)V
    .locals 2

    .line 95
    const-string v0, "normal_hr"

    invoke-virtual {p2}, Lo/ehe$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 97
    :cond_0
    const-string v0, "rest_hr"

    invoke-virtual {p2}, Lo/ehe$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 98
    iput-object p1, p0, Lo/eya;->d:Lo/eii;

    goto :goto_0

    .line 99
    :cond_1
    const-string v0, "warning_hr"

    invoke-virtual {p2}, Lo/ehe$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 100
    iput-object p1, p0, Lo/eya;->c:Lo/eii;

    .line 102
    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public b(Lo/eii;FF)F
    .locals 1

    .line 161
    const/high16 v0, 0x435c0000    # 220.0f

    return v0
.end method

.method protected synthetic b(Lo/ehe$a;)Lo/eii;
    .locals 1

    .line 34
    invoke-virtual {p0, p1}, Lo/eya;->e(Lo/ehe$a;)Lo/elb;

    move-result-object v0

    return-object v0
.end method

.method public b()Lo/eyv;
    .locals 1

    .line 214
    iget-object v0, p0, Lo/eya;->b:Lo/eyv;

    return-object v0
.end method

.method public c(Lo/eii;FF)F
    .locals 1

    .line 169
    const/high16 v0, 0x42200000    # 40.0f

    return v0
.end method

.method public c()Lo/eyv;
    .locals 1

    .line 238
    iget-object v0, p0, Lo/eya;->i:Lo/eyv;

    return-object v0
.end method

.method public d(Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;)Ljava/lang/String;
    .locals 4

    .line 221
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getY()F

    move-result v0

    float-to-int v0, v0

    const/high16 v1, -0x80000000

    if-ne v0, v1, :cond_1

    .line 222
    :cond_0
    const-string v0, "--"

    return-object v0

    .line 224
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

    .line 175
    iget-object v0, p0, Lo/eya;->a:Lo/ejk;

    return-object v0
.end method

.method public d(Lo/eih;Lo/eic;Lo/ejv;)V
    .locals 2

    .line 322
    iget-object v1, p0, Lo/eya;->c:Lo/eii;

    .line 323
    invoke-virtual {v1, p1, p3}, Lo/eii;->c(Lo/eih;Lo/ejv;)F

    .line 324
    return-void
.end method

.method protected d(Lo/ekw;Lo/eic;)V
    .locals 5

    .line 148
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lo/ekw;->b(Z)V

    .line 150
    const/16 v0, 0x19

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/16 v1, 0x19

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lo/ekw;->setGridColor(II)V

    .line 151
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    invoke-virtual {p1, v0}, Lo/ekw;->setLabelColor(I)V

    .line 154
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lo/ekw;->setAvoidFirstLastClipping(Z)V

    .line 155
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lo/ekw;->c(Z)V

    .line 156
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lo/ekw;->a(Z)V

    .line 157
    return-void
.end method

.method protected bridge synthetic e(Lo/eih;Lo/eic;Lo/ehe$a;)Lo/eii;
    .locals 1

    .line 34
    move-object v0, p1

    check-cast v0, Lo/ekw;

    invoke-virtual {p0, v0, p2, p3}, Lo/eya;->e(Lo/ekw;Lo/eic;Lo/ehe$a;)Lo/elb;

    move-result-object v0

    return-object v0
.end method

.method protected e(Lo/ehe$a;)Lo/elb;
    .locals 9

    .line 106
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 107
    invoke-virtual {p1}, Lo/ehe$a;->d()Lo/eic;

    move-result-object v7

    .line 108
    new-instance v0, Lo/elb;

    iget-object v1, p0, Lo/eya;->e:Landroid/content/Context;

    move-object v2, v6

    .line 109
    invoke-virtual {p0, v7}, Lo/eya;->d(Lo/eic;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v7}, Lo/eya;->c(Lo/eic;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v7}, Lo/eya;->e(Lo/eic;)Ljava/lang/String;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lo/elb;-><init>(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v8, v0

    .line 111
    const/16 v0, 0xff

    const/16 v1, 0xfc

    const/16 v2, 0x31

    const/16 v3, 0x59

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v8, v0}, Lo/elb;->c(I)V

    .line 112
    const/16 v0, 0xe5

    const/16 v1, 0xd5

    const/16 v2, 0x46

    const/16 v3, 0x5e

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v8, v0}, Lo/elb;->h(I)V

    .line 113
    const/16 v0, 0x7f

    const/16 v1, 0xfc

    const/16 v2, 0x31

    const/16 v3, 0x59

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    .line 114
    const/4 v1, 0x0

    const/16 v2, 0xfc

    const/16 v3, 0x31

    const/16 v4, 0x59

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    .line 113
    const/4 v2, 0x1

    invoke-virtual {v8, v0, v1, v2}, Lo/elb;->d(IIZ)V

    .line 115
    new-instance v0, Lo/eya$4;

    invoke-direct {v0, p0}, Lo/eya$4;-><init>(Lo/eya;)V

    invoke-virtual {v8, v0}, Lo/elb;->c(Lo/elb$b;)V

    .line 126
    const/high16 v0, 0x40000000    # 2.0f

    invoke-virtual {v8, v0}, Lo/elb;->c(F)V

    .line 128
    new-instance v0, Lo/eya$1;

    invoke-direct {v0, p0}, Lo/eya$1;-><init>(Lo/eya;)V

    invoke-virtual {v8, v0}, Lo/elb;->b(Lo/elb$c;)V

    .line 142
    invoke-direct {p0, v8, p1}, Lo/eya;->e(Lo/elb;Lo/ehe$a;)V

    .line 143
    return-object v8
.end method

.method protected e(Lo/ekw;Lo/eic;Lo/ehe$a;)Lo/elb;
    .locals 6

    .line 52
    invoke-super {p0, p1, p2, p3}, Lo/ehk;->e(Lo/ekw;Lo/eic;Lo/ehe$a;)Lo/elb;

    move-result-object v5

    .line 54
    const/16 v0, 0xff

    const/16 v1, 0xfc

    const/16 v2, 0x31

    const/16 v3, 0x59

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v5, v0}, Lo/elb;->c(I)V

    .line 55
    const/16 v0, 0xe5

    const/16 v1, 0xd5

    const/16 v2, 0x46

    const/16 v3, 0x5e

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v5, v0}, Lo/elb;->h(I)V

    .line 56
    const/16 v0, 0x7f

    const/16 v1, 0xfc

    const/16 v2, 0x31

    const/16 v3, 0x59

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    .line 57
    const/4 v1, 0x0

    const/16 v2, 0xfc

    const/16 v3, 0x31

    const/16 v4, 0x59

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    .line 56
    const/4 v2, 0x1

    invoke-virtual {v5, v0, v1, v2}, Lo/elb;->d(IIZ)V

    .line 58
    new-instance v0, Lo/eya$5;

    invoke-direct {v0, p0}, Lo/eya$5;-><init>(Lo/eya;)V

    invoke-virtual {v5, v0}, Lo/elb;->c(Lo/elb$b;)V

    .line 69
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v5, v0}, Lo/elb;->c(F)V

    .line 71
    new-instance v0, Lo/eya$3;

    invoke-direct {v0, p0}, Lo/eya$3;-><init>(Lo/eya;)V

    invoke-virtual {v5, v0}, Lo/elb;->b(Lo/elb$c;)V

    .line 86
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Lo/elb;->a(IZ)V

    .line 87
    invoke-virtual {p1}, Lo/ekw;->getAxisFirstParty()Lo/eit;

    move-result-object v0

    const/high16 v1, 0x42200000    # 40.0f

    invoke-virtual {v0, v1}, Lo/eit;->b(F)V

    .line 88
    invoke-virtual {p1}, Lo/ekw;->getAxisFirstParty()Lo/eit;

    move-result-object v0

    const/high16 v1, 0x435c0000    # 220.0f

    invoke-virtual {v0, v1}, Lo/eit;->a(F)V

    .line 89
    invoke-direct {p0, v5, p3}, Lo/eya;->e(Lo/elb;Lo/ehe$a;)V

    .line 91
    return-object v5
.end method

.method public e()Lo/eyv;
    .locals 1

    .line 234
    iget-object v0, p0, Lo/eya;->f:Lo/eyv;

    return-object v0
.end method

.method protected synthetic e(Lo/eih;Lo/eic;)V
    .locals 1

    .line 34
    move-object v0, p1

    check-cast v0, Lo/ekw;

    invoke-virtual {p0, v0, p2}, Lo/eya;->d(Lo/ekw;Lo/eic;)V

    return-void
.end method
