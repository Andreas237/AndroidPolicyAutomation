.class public Lo/eho;
.super Lo/ehm;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1}, Lo/ehm;-><init>(Landroid/content/Context;)V

    .line 20
    invoke-direct {p0}, Lo/eho;->D()V

    .line 21
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 24
    invoke-direct {p0, p1, p2}, Lo/ehm;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 25
    invoke-direct {p0}, Lo/eho;->D()V

    .line 26
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 29
    invoke-direct {p0, p1, p2, p3}, Lo/ehm;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 30
    invoke-direct {p0}, Lo/eho;->D()V

    .line 31
    return-void
.end method

.method private D()V
    .locals 2

    .line 39
    iget-object v0, p0, Lo/eho;->ad:Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->a(Z)V

    .line 40
    iget-object v0, p0, Lo/eho;->af:Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->a(Z)V

    .line 42
    iget-object v0, p0, Lo/eho;->ad:Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->b(F)V

    .line 43
    iget-object v0, p0, Lo/eho;->af:Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->d(Z)V

    .line 44
    invoke-virtual {p0}, Lo/eho;->getXAxis()Lo/ln;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ln;->b(Z)V

    .line 47
    iget-object v0, p0, Lo/eho;->ad:Lo/eit;

    const v1, 0x463b8000    # 12000.0f

    invoke-virtual {v0, v1}, Lo/eit;->a(F)V

    .line 49
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/eho;->b(Z)V

    .line 51
    return-void
.end method
