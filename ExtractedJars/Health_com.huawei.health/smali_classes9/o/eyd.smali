.class public Lo/eyd;
.super Lo/ehd;
.source "SourceFile"


# instance fields
.field private a:Lo/eyv;

.field private b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Lo/eic;Lo/ehn;>;"
        }
    .end annotation
.end field

.field private c:Lo/ejk;

.field private d:Lo/eyv;

.field private g:Lo/eyu;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 49
    invoke-direct {p0, p1}, Lo/ehd;-><init>(Landroid/content/Context;)V

    .line 52
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/eyd;->b:Ljava/util/Map;

    .line 69
    new-instance v0, Lo/exy;

    invoke-direct {v0}, Lo/exy;-><init>()V

    iput-object v0, p0, Lo/eyd;->c:Lo/ejk;

    .line 113
    new-instance v0, Lo/eyd$5;

    invoke-direct {v0, p0}, Lo/eyd$5;-><init>(Lo/eyd;)V

    iput-object v0, p0, Lo/eyd;->a:Lo/eyv;

    .line 163
    new-instance v0, Lo/eyd$4;

    invoke-direct {v0, p0}, Lo/eyd$4;-><init>(Lo/eyd;)V

    iput-object v0, p0, Lo/eyd;->d:Lo/eyv;

    .line 209
    new-instance v0, Lo/eyd$1;

    invoke-direct {v0, p0}, Lo/eyd$1;-><init>(Lo/eyd;)V

    iput-object v0, p0, Lo/eyd;->g:Lo/eyu;

    .line 50
    return-void
.end method

.method static synthetic b(Lo/eyd;)Ljava/util/Map;
    .locals 1

    .line 43
    iget-object v0, p0, Lo/eyd;->b:Ljava/util/Map;

    return-object v0
.end method


# virtual methods
.method protected a(Lo/eho;Lo/eic;Lo/ehe$a;)Lo/ehn;
    .locals 5

    .line 256
    invoke-super {p0, p1, p2, p3}, Lo/ehd;->a(Lo/eho;Lo/eic;Lo/ehe$a;)Lo/ehn;

    move-result-object v4

    .line 257
    iget-object v0, p0, Lo/eyd;->b:Ljava/util/Map;

    invoke-interface {v0, p2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    invoke-virtual {p2}, Lo/eic;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 261
    const/16 v0, 0xff

    const/16 v1, 0x7f

    const/16 v2, 0xbe

    const/16 v3, 0xff

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v4, v0}, Lo/ehn;->c(I)V

    .line 264
    const/16 v0, 0xff

    const/4 v1, 0x0

    const/16 v2, 0x7d

    const/16 v3, 0xff

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v4, v0}, Lo/ehn;->g(I)V

    goto/16 :goto_0

    .line 265
    :cond_0
    invoke-virtual {p2}, Lo/eic;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 267
    const/16 v0, 0xff

    const/16 v1, 0xa3

    const/16 v2, 0xe5

    const/16 v3, 0xa3

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v4, v0}, Lo/ehn;->c(I)V

    .line 270
    const/16 v0, 0xff

    const/16 v1, 0x47

    const/16 v2, 0xcc

    const/16 v3, 0x47

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v4, v0}, Lo/ehn;->g(I)V

    goto/16 :goto_0

    .line 271
    :cond_1
    invoke-virtual {p2}, Lo/eic;->f()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 273
    const/16 v0, 0xff

    const/16 v1, 0xfd

    const/16 v2, 0xb2

    const/16 v3, 0x90

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v4, v0}, Lo/ehn;->c(I)V

    .line 276
    const/16 v0, 0xff

    const/16 v1, 0xfa

    const/16 v2, 0x65

    const/16 v3, 0x21

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v4, v0}, Lo/ehn;->g(I)V

    goto :goto_0

    .line 277
    :cond_2
    invoke-virtual {p2}, Lo/eic;->k()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 279
    const/16 v0, 0xff

    const/16 v1, 0x7f

    const/16 v2, 0xdf

    const/16 v3, 0xe4

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v4, v0}, Lo/ehn;->c(I)V

    .line 282
    const/16 v0, 0xff

    const/4 v1, 0x0

    const/16 v2, 0xbf

    const/16 v3, 0xc9

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v4, v0}, Lo/ehn;->g(I)V

    goto :goto_0

    .line 283
    :cond_3
    invoke-virtual {p2}, Lo/eic;->p()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 285
    const/16 v0, 0xff

    const/16 v1, 0x89

    const/16 v2, 0xe5

    const/16 v3, 0xcb

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v4, v0}, Lo/ehn;->c(I)V

    .line 288
    const/16 v0, 0xff

    const/16 v1, 0x14

    const/16 v2, 0xcc

    const/16 v3, 0x98

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v4, v0}, Lo/ehn;->g(I)V

    .line 291
    :cond_4
    :goto_0
    return-object v4
.end method

.method public a()Lo/eyu;
    .locals 1

    .line 251
    iget-object v0, p0, Lo/eyd;->g:Lo/eyu;

    return-object v0
.end method

.method protected a(Lo/eho;Lo/eic;)V
    .locals 4

    .line 73
    invoke-virtual {p2}, Lo/eic;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lo/eic;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 75
    iget-object v0, p0, Lo/eyd;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lo/eyd$2;

    invoke-direct {v1, p0, p1}, Lo/eyd$2;-><init>(Lo/eyd;Lo/eho;)V

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-virtual {v0, v2, v3, v1}, Lo/clq;->d(IILo/clz;)V

    goto :goto_0

    .line 104
    :cond_0
    invoke-virtual {p2}, Lo/eic;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lo/eic;->d()Z

    move-result v0

    if-nez v0, :cond_1

    .line 105
    const/16 v0, 0xff

    const/16 v1, 0x16

    const/16 v2, 0xd9

    const/16 v3, 0xa1

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/16 v1, 0x1e

    invoke-virtual {p1, v1, v0}, Lo/eho;->d(II)V

    .line 106
    invoke-virtual {p1}, Lo/eho;->ak()V

    .line 107
    invoke-virtual {p1}, Lo/eho;->c()V

    .line 109
    :cond_1
    :goto_0
    return-void
.end method

.method public b(Lo/eii;FF)F
    .locals 2

    .line 56
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

.method public b()Lo/eyv;
    .locals 1

    .line 243
    iget-object v0, p0, Lo/eyd;->d:Lo/eyv;

    return-object v0
.end method

.method public c(Lo/eii;FF)F
    .locals 1

    .line 61
    const/4 v0, 0x0

    return v0
.end method

.method public c()Lo/eyv;
    .locals 1

    .line 247
    iget-object v0, p0, Lo/eyd;->a:Lo/eyv;

    return-object v0
.end method

.method public d()Lo/ejk;
    .locals 1

    .line 66
    iget-object v0, p0, Lo/eyd;->c:Lo/ejk;

    return-object v0
.end method

.method protected synthetic e(Lo/eih;Lo/eic;Lo/ehe$a;)Lo/eii;
    .locals 1

    .line 43
    move-object v0, p1

    check-cast v0, Lo/eho;

    invoke-virtual {p0, v0, p2, p3}, Lo/eyd;->a(Lo/eho;Lo/eic;Lo/ehe$a;)Lo/ehn;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic e(Lo/eih;Lo/eic;)V
    .locals 1

    .line 43
    move-object v0, p1

    check-cast v0, Lo/eho;

    invoke-virtual {p0, v0, p2}, Lo/eyd;->a(Lo/eho;Lo/eic;)V

    return-void
.end method
