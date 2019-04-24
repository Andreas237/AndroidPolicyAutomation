.class public Lo/fan;
.super Lo/eit;
.source "SourceFile"


# instance fields
.field private J:Lo/eit$b;

.field private K:I

.field private L:Z

.field private M:I

.field private N:Z


# direct methods
.method public constructor <init>(Lo/eie;Lo/eit$b;)V
    .locals 4

    .line 38
    invoke-direct {p0, p1, p2}, Lo/eit;-><init>(Lo/eie;Lo/eit$b;)V

    .line 44
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fan;->N:Z

    .line 48
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fan;->L:Z

    .line 49
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/fan;->M:I

    .line 50
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/fan;->K:I

    .line 39
    iput-object p2, p0, Lo/fan;->J:Lo/eit$b;

    .line 40
    const/4 v0, 0x0

    iput v0, p0, Lo/fan;->z:F

    .line 42
    return-void
.end method


# virtual methods
.method public L()Z
    .locals 2

    .line 89
    invoke-virtual {p0}, Lo/fan;->B()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lo/fan;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lo/fan;->H()Lo/lp$c;

    move-result-object v0

    sget-object v1, Lo/lp$c;->a:Lo/lp$c;

    if-ne v0, v1, :cond_0

    .line 91
    const/4 v0, 0x1

    return v0

    .line 93
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public P()Lo/eit$b;
    .locals 1

    .line 34
    iget-object v0, p0, Lo/fan;->J:Lo/eit$b;

    return-object v0
.end method

.method public Q()I
    .locals 1

    .line 75
    iget v0, p0, Lo/fan;->M:I

    return v0
.end method

.method public R()I
    .locals 1

    .line 79
    iget v0, p0, Lo/fan;->K:I

    return v0
.end method

.method public S()Z
    .locals 1

    .line 62
    iget-boolean v0, p0, Lo/fan;->N:Z

    return v0
.end method

.method public a(F)V
    .locals 0

    .line 113
    invoke-super {p0, p1}, Lo/eit;->a(F)V

    .line 114
    return-void
.end method

.method public j()Lo/lp$b;
    .locals 1

    .line 30
    const/4 v0, 0x0

    return-object v0
.end method
