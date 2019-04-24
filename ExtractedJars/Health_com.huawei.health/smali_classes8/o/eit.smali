.class public Lo/eit;
.super Lo/lp;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/eit$b;
    }
.end annotation


# instance fields
.field private J:Lo/eie;

.field private K:I

.field private L:I

.field private M:Lo/eit$b;

.field private N:Z


# direct methods
.method public constructor <init>(Lo/eie;Lo/eit$b;)V
    .locals 4

    .line 37
    invoke-direct {p0}, Lo/lp;-><init>()V

    .line 44
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eit;->N:Z

    .line 45
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/eit;->K:I

    .line 46
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/eit;->L:I

    .line 38
    iput-object p1, p0, Lo/eit;->J:Lo/eie;

    .line 39
    iput-object p2, p0, Lo/eit;->M:Lo/eit$b;

    .line 40
    const/4 v0, 0x0

    iput v0, p0, Lo/eit;->z:F

    .line 42
    return-void
.end method


# virtual methods
.method public L()Z
    .locals 2

    .line 77
    invoke-virtual {p0}, Lo/eit;->B()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lo/eit;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lo/eit;->H()Lo/lp$c;

    move-result-object v0

    sget-object v1, Lo/lp$c;->a:Lo/lp$c;

    if-ne v0, v1, :cond_0

    .line 79
    const/4 v0, 0x1

    return v0

    .line 81
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public P()Lo/eit$b;
    .locals 1

    .line 33
    iget-object v0, p0, Lo/eit;->M:Lo/eit$b;

    return-object v0
.end method

.method public Q()I
    .locals 1

    .line 59
    iget v0, p0, Lo/eit;->K:I

    return v0
.end method

.method public R()I
    .locals 1

    .line 63
    iget v0, p0, Lo/eit;->L:I

    return v0
.end method

.method public S()Z
    .locals 1

    .line 55
    iget-boolean v0, p0, Lo/eit;->N:Z

    return v0
.end method

.method public a(F)V
    .locals 0

    .line 102
    invoke-super {p0, p1}, Lo/lp;->a(F)V

    .line 103
    return-void
.end method

.method public d(Landroid/graphics/Paint;)F
    .locals 1

    .line 88
    iget-object v0, p0, Lo/eit;->J:Lo/eie;

    invoke-virtual {v0, p0}, Lo/eie;->b(Lo/eit;)F

    move-result v0

    return v0
.end method

.method public e(II)V
    .locals 1

    .line 49
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eit;->N:Z

    .line 50
    iput p1, p0, Lo/eit;->K:I

    .line 51
    iput p2, p0, Lo/eit;->L:I

    .line 52
    return-void
.end method

.method public f(F)V
    .locals 2

    .line 109
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "pls use LayoutBuilder and ChartAnchor"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public j()Lo/lp$b;
    .locals 1

    .line 29
    const/4 v0, 0x0

    return-object v0
.end method
