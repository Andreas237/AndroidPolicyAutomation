.class public Lo/fbf;
.super Lo/ekw;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fbf$b;
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 30
    invoke-direct {p0, p1}, Lo/ekw;-><init>(Landroid/content/Context;)V

    .line 27
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fbf;->a:Landroid/content/Context;

    .line 31
    const-string v0, "RestHeartRateLineChart"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "construct chart"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 32
    iput-object p1, p0, Lo/fbf;->a:Landroid/content/Context;

    .line 33
    invoke-direct {p0}, Lo/fbf;->D()V

    .line 35
    return-void
.end method

.method private D()V
    .locals 7

    .line 40
    iget-object v0, p0, Lo/fbf;->N:Lo/lm;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/lm;->d(Z)V

    .line 41
    invoke-virtual {p0}, Lo/fbf;->getDescription()Lo/ll;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ll;->d(Z)V

    .line 43
    invoke-virtual {p0}, Lo/fbf;->getXAxis()Lo/ln;

    move-result-object v6

    .line 44
    new-instance v0, Lo/fbf$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/fbf$b;-><init>(Lo/fbf$3;)V

    invoke-virtual {v6, v0}, Lo/ln;->b(Lo/mf;)V

    .line 46
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lo/ln;->b(F)V

    .line 47
    const/high16 v0, 0x44b40000    # 1440.0f

    invoke-virtual {v6, v0}, Lo/ln;->a(F)V

    .line 58
    new-instance v0, Lo/eir;

    iget-object v1, p0, Lo/fbf;->a:Landroid/content/Context;

    iget-object v2, p0, Lo/fbf;->O:Lo/oa;

    iget-object v3, p0, Lo/fbf;->ad:Lo/eit;

    iget-object v4, p0, Lo/fbf;->aj:Lo/eim;

    move-object v5, p0

    invoke-direct/range {v0 .. v5}, Lo/eir;-><init>(Landroid/content/Context;Lo/oa;Lo/lp;Lo/nv;Lo/eie;)V

    iput-object v0, p0, Lo/fbf;->ae:Lo/eir;

    .line 60
    new-instance v0, Lo/eir;

    iget-object v1, p0, Lo/fbf;->a:Landroid/content/Context;

    iget-object v2, p0, Lo/fbf;->O:Lo/oa;

    iget-object v3, p0, Lo/fbf;->af:Lo/eit;

    iget-object v4, p0, Lo/fbf;->al:Lo/eim;

    move-object v5, p0

    invoke-direct/range {v0 .. v5}, Lo/eir;-><init>(Landroid/content/Context;Lo/oa;Lo/lp;Lo/nv;Lo/eie;)V

    iput-object v0, p0, Lo/fbf;->am:Lo/eir;

    .line 62
    new-instance v0, Lo/eir;

    iget-object v1, p0, Lo/fbf;->a:Landroid/content/Context;

    iget-object v2, p0, Lo/fbf;->O:Lo/oa;

    iget-object v3, p0, Lo/fbf;->ah:Lo/eit;

    iget-object v4, p0, Lo/fbf;->ak:Lo/eim;

    move-object v5, p0

    invoke-direct/range {v0 .. v5}, Lo/eir;-><init>(Landroid/content/Context;Lo/oa;Lo/lp;Lo/nv;Lo/eie;)V

    iput-object v0, p0, Lo/fbf;->ai:Lo/eir;

    .line 64
    new-instance v0, Lo/fbf$3;

    invoke-direct {v0, p0}, Lo/fbf$3;-><init>(Lo/fbf;)V

    invoke-virtual {p0, v0}, Lo/fbf;->a(Lo/eie$c;)V

    .line 94
    const/high16 v0, 0x40a00000    # 5.0f

    invoke-virtual {p0, v0}, Lo/fbf;->setExtraTopOffset(F)V

    .line 95
    const/high16 v0, 0x40e00000    # 7.0f

    invoke-virtual {p0, v0}, Lo/fbf;->setExtraBottomOffset(F)V

    .line 106
    const/16 v0, 0xff

    const/16 v1, 0xf2

    const/16 v2, 0xf2

    const/16 v3, 0xf2

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {p0, v0}, Lo/fbf;->setBackgroundColor(I)V

    .line 109
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/fbf;->d(Z)V

    .line 111
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/fbf;->e(Z)V

    .line 112
    return-void
.end method

.method private H()Z
    .locals 5

    .line 148
    iget-object v0, p0, Lo/fbf;->A:Lo/ma;

    check-cast v0, Lo/ela;

    invoke-virtual {v0}, Lo/ela;->h()Ljava/util/List;

    move-result-object v4

    .line 149
    const-string v0, "RestHeartRateLineChart"

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

    .line 150
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 151
    const/4 v0, 0x1

    return v0

    .line 153
    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public c()V
    .locals 4

    .line 142
    const-string v0, "RestHeartRateLineChart"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refresh chart"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    invoke-super {p0}, Lo/ekw;->c()V

    .line 144
    return-void
.end method

.method protected e()V
    .locals 3

    .line 162
    invoke-direct {p0}, Lo/fbf;->H()Z

    move-result v2

    .line 164
    if-nez v2, :cond_0

    .line 165
    invoke-super {p0}, Lo/ekw;->e()V

    .line 166
    return-void

    .line 169
    :cond_0
    iget-object v0, p0, Lo/fbf;->ad:Lo/eit;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/eit;->d(Z)V

    .line 170
    iget-object v0, p0, Lo/fbf;->af:Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->d(Z)V

    .line 171
    iget-object v0, p0, Lo/fbf;->ah:Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->d(Z)V

    .line 174
    iget-object v0, p0, Lo/fbf;->ad:Lo/eit;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/eit;->e(Z)V

    .line 175
    iget-object v0, p0, Lo/fbf;->af:Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->e(Z)V

    .line 176
    iget-object v0, p0, Lo/fbf;->ah:Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->e(Z)V

    .line 177
    return-void
.end method

.method public setHeartRateZone(Lo/ext;)V
    .locals 0

    .line 138
    return-void
.end method
