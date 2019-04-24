.class public Lo/fdn;
.super Lo/ehk;
.source "SourceFile"

# interfaces
.implements Lo/eyp;


# instance fields
.field private a:F

.field private b:F

.field private c:Lo/eic;

.field private d:I

.field private g:Lo/ejk;

.field private i:Lo/eyv;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lo/eic;)V
    .locals 1

    .line 47
    invoke-direct {p0, p1}, Lo/ehk;-><init>(Landroid/content/Context;)V

    .line 43
    const/16 v0, 0xc8

    iput v0, p0, Lo/fdn;->d:I

    .line 196
    new-instance v0, Lo/fds;

    invoke-direct {v0}, Lo/fds;-><init>()V

    iput-object v0, p0, Lo/fdn;->g:Lo/ejk;

    .line 198
    new-instance v0, Lo/fdn$2;

    invoke-direct {v0, p0}, Lo/fdn$2;-><init>(Lo/fdn;)V

    iput-object v0, p0, Lo/fdn;->i:Lo/eyv;

    .line 48
    iput-object p2, p0, Lo/fdn;->c:Lo/eic;

    .line 49
    return-void
.end method


# virtual methods
.method protected a(Lo/ekw;Lo/eic;Lo/ehe$a;)Lo/fdo;
    .locals 9

    .line 53
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 54
    new-instance v0, Lo/fdo;

    iget-object v1, p0, Lo/fdn;->e:Landroid/content/Context;

    move-object v2, v7

    invoke-virtual {p0, p2}, Lo/fdn;->d(Lo/eic;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, p2}, Lo/fdn;->c(Lo/eic;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, p2}, Lo/fdn;->e(Lo/eic;)Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lo/fdn;->c:Lo/eic;

    invoke-direct/range {v0 .. v6}, Lo/fdo;-><init>(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/eic;)V

    move-object v8, v0

    .line 56
    const/16 v0, 0xff

    const/4 v1, 0x0

    const/16 v2, 0x7d

    const/16 v3, 0xff

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v8, v0}, Lo/fdo;->c(I)V

    .line 57
    const/16 v0, 0xe5

    const/16 v1, 0xd5

    const/16 v2, 0x46

    const/16 v3, 0x5e

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v8, v0}, Lo/fdo;->h(I)V

    .line 58
    const/16 v0, 0x7f

    const/4 v1, 0x0

    const/16 v2, 0x7d

    const/16 v3, 0xff

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    .line 59
    const/4 v1, 0x0

    const/4 v2, 0x0

    const/16 v3, 0x7d

    const/16 v4, 0xff

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    .line 58
    const/4 v2, 0x1

    invoke-virtual {v8, v0, v1, v2}, Lo/fdo;->d(IIZ)V

    .line 60
    new-instance v0, Lo/fdn$1;

    invoke-direct {v0, p0}, Lo/fdn$1;-><init>(Lo/fdn;)V

    invoke-virtual {v8, v0}, Lo/fdo;->c(Lo/elb$b;)V

    .line 67
    const/high16 v0, 0x3fc00000    # 1.5f

    invoke-virtual {v8, v0}, Lo/fdo;->c(F)V

    .line 69
    new-instance v0, Lo/fdn$4;

    invoke-direct {v0, p0}, Lo/fdn$4;-><init>(Lo/fdn;)V

    invoke-virtual {v8, v0}, Lo/fdo;->b(Lo/elb$c;)V

    .line 84
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v8, v0, v1}, Lo/fdo;->a(IZ)V

    .line 85
    invoke-virtual {p1}, Lo/ekw;->getAxisFirstParty()Lo/eit;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->b(F)V

    .line 86
    invoke-virtual {p1}, Lo/ekw;->getAxisFirstParty()Lo/eit;

    move-result-object v0

    const/high16 v1, 0x43480000    # 200.0f

    invoke-virtual {v0, v1}, Lo/eit;->a(F)V

    .line 87
    invoke-virtual {p1}, Lo/ekw;->getAxisSecondParty()Lo/eit;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->d(Z)V

    .line 88
    const-string v0, "WeightLineChartHolder Test chart:"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    const-string v0, "WeightLineChartHolder Test chart.getAxisSecondParty:"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lo/ekw;->getAxisSecondParty()Lo/eit;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    return-object v8
.end method

.method protected a(Lo/ekw;Lo/eic;)V
    .locals 5

    .line 153
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lo/ekw;->b(Z)V

    .line 155
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

    .line 156
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    invoke-virtual {p1, v0}, Lo/ekw;->setLabelColor(I)V

    .line 159
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lo/ekw;->setAvoidFirstLastClipping(Z)V

    .line 160
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lo/ekw;->c(Z)V

    .line 161
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lo/ekw;->a(Z)V

    .line 162
    return-void
.end method

.method public a(Lo/fet;Lo/fdo;)V
    .locals 1

    .line 100
    invoke-virtual {p1}, Lo/fet;->H()V

    .line 101
    invoke-virtual {p1}, Lo/fet;->aa()Lo/eih$h;

    move-result-object v0

    .line 102
    invoke-interface {v0, p2}, Lo/eih$h;->e(Lo/eii;)V

    .line 103
    invoke-virtual {p1}, Lo/fet;->c()V

    .line 104
    return-void
.end method

.method public declared-synchronized b(Lo/eii;FF)F
    .locals 6

    monitor-enter p0

    .line 166
    :try_start_0
    iget v0, p0, Lo/fdn;->b:F

    const/high16 v1, 0x40a00000    # 5.0f

    add-float v4, v0, v1

    .line 167
    iget v0, p0, Lo/fdn;->a:F

    const/high16 v1, 0x40a00000    # 5.0f

    sub-float/2addr v0, v1

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 168
    iget v0, p0, Lo/fdn;->a:F

    const/high16 v1, 0x40a00000    # 5.0f

    sub-float/2addr v0, v1

    sub-float v0, v4, v0

    const/high16 v1, 0x40800000    # 4.0f

    div-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-float v5, v0

    .line 169
    iget v0, p0, Lo/fdn;->a:F

    const/high16 v1, 0x40a00000    # 5.0f

    sub-float/2addr v0, v1

    const/high16 v1, 0x40800000    # 4.0f

    mul-float/2addr v1, v5

    add-float v4, v0, v1

    .line 170
    const-string v0, "WeightLineChartHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "minWeight==="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/fdn;->a:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "===max"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    goto :goto_0

    .line 172
    :cond_0
    const/high16 v0, 0x40800000    # 4.0f

    div-float v0, v4, v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v0

    double-to-float v5, v0

    .line 173
    const/high16 v0, 0x40800000    # 4.0f

    mul-float v4, v5, v0

    .line 175
    :goto_0
    monitor-exit p0

    return v4

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public synthetic b(Lo/ehe$a;)Lo/eii;
    .locals 1

    .line 35
    invoke-virtual {p0, p1}, Lo/fdn;->e(Lo/ehe$a;)Lo/fdo;

    move-result-object v0

    return-object v0
.end method

.method public declared-synchronized c(Lo/eii;FF)F
    .locals 2

    monitor-enter p0

    .line 183
    :try_start_0
    iget v0, p0, Lo/fdn;->a:F

    const/high16 v1, 0x40a00000    # 5.0f

    sub-float/2addr v0, v1

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 184
    iget v0, p0, Lo/fdn;->a:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/high16 v1, 0x40a00000    # 5.0f

    sub-float/2addr v0, v1

    monitor-exit p0

    return v0

    .line 186
    :cond_0
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public d(Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;)Ljava/lang/String;
    .locals 1

    .line 227
    const/4 v0, 0x0

    return-object v0
.end method

.method public d(Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;I)Ljava/lang/String;
    .locals 4

    .line 213
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getY()F

    move-result v0

    float-to-int v0, v0

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getY()F

    move-result v0

    float-to-int v0, v0

    if-nez v0, :cond_1

    .line 214
    :cond_0
    const-string v0, "--"

    return-object v0

    .line 216
    :cond_1
    const/16 v0, 0xc9

    if-ne p2, v0, :cond_2

    .line 217
    invoke-virtual {p1}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getY()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x2

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 219
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getY()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d()Lo/ejk;
    .locals 1

    .line 193
    iget-object v0, p0, Lo/fdn;->g:Lo/ejk;

    return-object v0
.end method

.method protected synthetic e(Lo/eih;Lo/eic;Lo/ehe$a;)Lo/eii;
    .locals 1

    .line 35
    move-object v0, p1

    check-cast v0, Lo/ekw;

    invoke-virtual {p0, v0, p2, p3}, Lo/fdn;->a(Lo/ekw;Lo/eic;Lo/ehe$a;)Lo/fdo;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic e(Lo/ekw;Lo/eic;Lo/ehe$a;)Lo/elb;
    .locals 1

    .line 35
    invoke-virtual {p0, p1, p2, p3}, Lo/fdn;->a(Lo/ekw;Lo/eic;Lo/ehe$a;)Lo/fdo;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/ehe$a;)Lo/fdo;
    .locals 10

    .line 115
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 116
    invoke-virtual {p1}, Lo/ehe$a;->d()Lo/eic;

    move-result-object v8

    .line 117
    new-instance v0, Lo/fdo;

    iget-object v1, p0, Lo/fdn;->e:Landroid/content/Context;

    move-object v2, v7

    .line 118
    invoke-virtual {p0, v8}, Lo/fdn;->d(Lo/eic;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v8}, Lo/fdn;->c(Lo/eic;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v8}, Lo/fdn;->e(Lo/eic;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lo/ehe$a;->d()Lo/eic;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lo/fdo;-><init>(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/eic;)V

    move-object v9, v0

    .line 119
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v9, v0, v1}, Lo/fdo;->a(IZ)V

    .line 120
    const/16 v0, 0xff

    const/4 v1, 0x0

    const/16 v2, 0x7d

    const/16 v3, 0xff

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v9, v0}, Lo/fdo;->c(I)V

    .line 121
    const/16 v0, 0xe5

    const/16 v1, 0xd5

    const/16 v2, 0x46

    const/16 v3, 0x5e

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v9, v0}, Lo/fdo;->h(I)V

    .line 122
    const/16 v0, 0x7f

    const/4 v1, 0x0

    const/16 v2, 0x7d

    const/16 v3, 0xff

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    .line 123
    const/4 v1, 0x0

    const/4 v2, 0x0

    const/16 v3, 0x7d

    const/16 v4, 0xff

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    .line 122
    const/4 v2, 0x1

    invoke-virtual {v9, v0, v1, v2}, Lo/fdo;->d(IIZ)V

    .line 124
    new-instance v0, Lo/fdn$3;

    invoke-direct {v0, p0}, Lo/fdn$3;-><init>(Lo/fdn;)V

    invoke-virtual {v9, v0}, Lo/fdo;->c(Lo/elb$b;)V

    .line 131
    const/high16 v0, 0x40000000    # 2.0f

    invoke-virtual {v9, v0}, Lo/fdo;->c(F)V

    .line 133
    new-instance v0, Lo/fdn$5;

    invoke-direct {v0, p0}, Lo/fdn$5;-><init>(Lo/fdn;)V

    invoke-virtual {v9, v0}, Lo/fdo;->b(Lo/elb$c;)V

    .line 148
    return-object v9
.end method

.method public declared-synchronized e(FFI)V
    .locals 2

    monitor-enter p0

    .line 232
    float-to-double v0, p1

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-float v0, v0

    iput v0, p0, Lo/fdn;->b:F

    .line 233
    float-to-double v0, p2

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-float v0, v0

    iput v0, p0, Lo/fdn;->a:F

    .line 234
    iput p3, p0, Lo/fdn;->d:I

    .line 235
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lo/fdn;->d:I

    const/16 v1, 0xc9

    if-eq v0, v1, :cond_0

    .line 236
    iget v0, p0, Lo/fdn;->a:F

    float-to-double v0, v0

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-float v0, v0

    iput v0, p0, Lo/fdn;->a:F

    .line 237
    iget v0, p0, Lo/fdn;->b:F

    float-to-double v0, v0

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-float v0, v0

    iput v0, p0, Lo/fdn;->b:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 240
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method protected synthetic e(Lo/eih;Lo/eic;)V
    .locals 1

    .line 35
    move-object v0, p1

    check-cast v0, Lo/ekw;

    invoke-virtual {p0, v0, p2}, Lo/fdn;->a(Lo/ekw;Lo/eic;)V

    return-void
.end method

.method public e(Lo/fet;Lo/fdo;)V
    .locals 1

    .line 108
    invoke-virtual {p1}, Lo/fet;->aa()Lo/eih$h;

    move-result-object v0

    .line 109
    invoke-interface {v0, p2}, Lo/eih$h;->d(Lo/eii;)V

    .line 110
    return-void
.end method
