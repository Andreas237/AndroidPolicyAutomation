.class public abstract Lo/ekt;
.super Lo/eih;
.source "SourceFile"

# interfaces
.implements Lo/ejh;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/eih<Lo/ela;>;Lo/ejh;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Lo/eih;-><init>(Landroid/content/Context;)V

    .line 37
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 40
    invoke-direct {p0, p1, p2}, Lo/eih;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 41
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 44
    invoke-direct {p0, p1, p2, p3}, Lo/eih;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 45
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 4

    .line 60
    invoke-super {p0}, Lo/eih;->a()V

    .line 61
    invoke-virtual {p0}, Lo/ekt;->getContext()Landroid/content/Context;

    move-result-object v3

    .line 63
    new-instance v0, Lo/ekx;

    iget-object v1, p0, Lo/ekt;->P:Lo/la;

    iget-object v2, p0, Lo/ekt;->O:Lo/oa;

    invoke-direct {v0, p0, v1, v2, v3}, Lo/ekx;-><init>(Lo/ejh;Lo/la;Lo/oa;Landroid/content/Context;)V

    iput-object v0, p0, Lo/ekt;->S:Lo/nj;

    .line 66
    new-instance v0, Lo/eig;

    invoke-direct {v0, p0}, Lo/eig;-><init>(Lo/mn;)V

    invoke-virtual {p0, v0}, Lo/ekt;->setHighlighter(Lo/mi;)V

    .line 68
    return-void
.end method

.method protected b(Landroid/graphics/Canvas;)V
    .locals 5

    .line 102
    iget-object v0, p0, Lo/ekt;->L:Lo/ll;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/ekt;->L:Lo/ll;

    invoke-virtual {v0}, Lo/ll;->B()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 106
    iget-object v0, p0, Lo/ekt;->F:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/ekt;->L:Lo/ll;

    invoke-virtual {v1}, Lo/ll;->x()Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 107
    iget-object v0, p0, Lo/ekt;->F:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/ekt;->L:Lo/ll;

    invoke-virtual {v1}, Lo/ll;->z()F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 108
    iget-object v0, p0, Lo/ekt;->F:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/ekt;->L:Lo/ll;

    invoke-virtual {v1}, Lo/ll;->A()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 109
    iget-object v0, p0, Lo/ekt;->F:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/ekt;->L:Lo/ll;

    invoke-virtual {v1}, Lo/ll;->a()Landroid/graphics/Paint$Align;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 114
    invoke-virtual {p0}, Lo/ekt;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ehw;->c(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 115
    iget-object v0, p0, Lo/ekt;->F:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->RIGHT:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 117
    invoke-virtual {p0}, Lo/ekt;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1}, Lo/oc;->b(F)F

    move-result v1

    sub-float v2, v0, v1

    goto :goto_0

    .line 119
    :cond_0
    iget-object v0, p0, Lo/ekt;->F:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 120
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v2

    .line 122
    :goto_0
    iget-object v0, p0, Lo/ekt;->F:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v4

    .line 123
    iget-object v0, p0, Lo/ekt;->aa:Lo/ehh;

    invoke-virtual {v0}, Lo/ehh;->i()Landroid/graphics/Rect;

    move-result-object v0

    iget v0, v0, Landroid/graphics/Rect;->top:I

    int-to-float v0, v0

    iget v1, v4, Landroid/graphics/Paint$FontMetrics;->top:F

    neg-float v1, v1

    add-float v3, v0, v1

    .line 135
    iget-object v0, p0, Lo/ekt;->L:Lo/ll;

    invoke-virtual {v0}, Lo/ll;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/ekt;->F:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v2, v3, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 137
    :cond_1
    return-void
.end method

.method public d(Lo/eix;Lo/ekd;)V
    .locals 2

    .line 71
    iget-object v0, p0, Lo/ekt;->av:Lo/eih$c;

    sget-object v1, Lo/eih$c;->e:Lo/eih$c;

    if-ne v0, v1, :cond_0

    .line 72
    return-void

    .line 74
    :cond_0
    invoke-super {p0, p1, p2}, Lo/eih;->d(Lo/eix;Lo/ekd;)V

    .line 75
    iget-object v0, p0, Lo/ekt;->as:Lo/eih$h;

    invoke-interface {v0}, Lo/eih$h;->c()Lo/eih$i;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/eih$i;->d(Z)V

    .line 76
    return-void
.end method

.method public getLineData()Lo/ela;
    .locals 1

    .line 150
    iget-object v0, p0, Lo/ekt;->A:Lo/ma;

    check-cast v0, Lo/ela;

    return-object v0
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .line 142
    iget-object v0, p0, Lo/ekt;->S:Lo/nj;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/ekt;->S:Lo/nj;

    instance-of v0, v0, Lo/nm;

    if-eqz v0, :cond_0

    .line 143
    iget-object v0, p0, Lo/ekt;->S:Lo/nj;

    check-cast v0, Lo/nm;

    invoke-virtual {v0}, Lo/nm;->d()V

    .line 145
    :cond_0
    invoke-super {p0}, Lo/eih;->onDetachedFromWindow()V

    .line 146
    return-void
.end method

.method public setAvoidFirstLastClipping(Z)V
    .locals 1

    .line 80
    iget-object v0, p0, Lo/ekt;->H:Lo/ln;

    invoke-virtual {v0, p1}, Lo/ln;->i(Z)V

    .line 81
    return-void
.end method

.method public setScaletMaxima(F)V
    .locals 1

    .line 84
    iget-object v0, p0, Lo/ekt;->O:Lo/oa;

    invoke-virtual {v0, p1}, Lo/oa;->d(F)V

    .line 85
    return-void
.end method
