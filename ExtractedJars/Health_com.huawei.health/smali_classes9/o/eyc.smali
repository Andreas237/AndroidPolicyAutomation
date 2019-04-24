.class public Lo/eyc;
.super Lo/ehd;
.source "SourceFile"


# instance fields
.field private d:Lo/ejk;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 26
    invoke-direct {p0, p1}, Lo/ehd;-><init>(Landroid/content/Context;)V

    .line 44
    new-instance v0, Lo/exz;

    invoke-direct {v0}, Lo/exz;-><init>()V

    iput-object v0, p0, Lo/eyc;->d:Lo/ejk;

    .line 27
    return-void
.end method


# virtual methods
.method protected a(Lo/eho;Lo/eic;Lo/ehe$a;)Lo/ehn;
    .locals 5

    .line 48
    invoke-super {p0, p1, p2, p3}, Lo/ehd;->a(Lo/eho;Lo/eic;Lo/ehe$a;)Lo/ehn;

    move-result-object v4

    .line 50
    const/16 v0, 0xff

    const/16 v1, 0x89

    const/16 v2, 0xde

    const/16 v3, 0x85

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v4, v0}, Lo/ehn;->c(I)V

    .line 53
    const/16 v0, 0xff

    const/16 v1, 0x12

    const/16 v2, 0xb8

    const/16 v3, 0x4a

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v4, v0}, Lo/ehn;->g(I)V

    .line 54
    return-object v4
.end method

.method public b(Lo/eii;FF)F
    .locals 2

    .line 31
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

.method public c(Lo/eii;FF)F
    .locals 1

    .line 36
    const/4 v0, 0x0

    return v0
.end method

.method public d()Lo/ejk;
    .locals 1

    .line 41
    iget-object v0, p0, Lo/eyc;->d:Lo/ejk;

    return-object v0
.end method

.method protected synthetic e(Lo/eih;Lo/eic;Lo/ehe$a;)Lo/eii;
    .locals 1

    .line 20
    move-object v0, p1

    check-cast v0, Lo/eho;

    invoke-virtual {p0, v0, p2, p3}, Lo/eyc;->a(Lo/eho;Lo/eic;Lo/ehe$a;)Lo/ehn;

    move-result-object v0

    return-object v0
.end method
