.class Lo/eih$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eih;->b(ILo/eih$k;ILo/eih$a;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lo/eih$f;

.field final synthetic c:Landroid/graphics/Matrix;

.field final synthetic d:F

.field final synthetic e:Lo/eih$a;

.field final synthetic g:Lo/eih;

.field final synthetic i:Lo/eki;

.field final synthetic k:Lo/eki$e;


# direct methods
.method constructor <init>(Lo/eih;Lo/eih$a;Landroid/graphics/Matrix;Lo/eih$f;FZLo/eki;Lo/eki$e;)V
    .locals 0

    .line 1702
    iput-object p1, p0, Lo/eih$10;->g:Lo/eih;

    iput-object p2, p0, Lo/eih$10;->e:Lo/eih$a;

    iput-object p3, p0, Lo/eih$10;->c:Landroid/graphics/Matrix;

    iput-object p4, p0, Lo/eih$10;->b:Lo/eih$f;

    iput p5, p0, Lo/eih$10;->d:F

    iput-boolean p6, p0, Lo/eih$10;->a:Z

    iput-object p7, p0, Lo/eih$10;->i:Lo/eki;

    iput-object p8, p0, Lo/eih$10;->k:Lo/eki$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 8

    .line 1705
    iget-object v0, p0, Lo/eih$10;->g:Lo/eih;

    iget-object v0, v0, Lo/eih;->ay:Lo/ekj;

    invoke-virtual {v0}, Lo/ekj;->d()F

    move-result v4

    .line 1706
    iget-object v0, p0, Lo/eih$10;->e:Lo/eih$a;

    invoke-interface {v0, v4}, Lo/eih$a;->b(F)F

    move-result v4

    .line 1707
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 1708
    iget-object v0, p0, Lo/eih$10;->c:Landroid/graphics/Matrix;

    invoke-virtual {v5, v0}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 1710
    iget-object v0, p0, Lo/eih$10;->b:Lo/eih$f;

    iget-boolean v0, v0, Lo/eih$f;->e:Z

    if-eqz v0, :cond_0

    .line 1715
    iget-object v0, p0, Lo/eih$10;->b:Lo/eih$f;

    iget v0, v0, Lo/eih$f;->a:F

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr v0, v1

    mul-float/2addr v0, v4

    const/high16 v1, 0x3f800000    # 1.0f

    add-float/2addr v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v5, v0, v1, v2, v3}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 1720
    :cond_0
    iget-object v0, p0, Lo/eih$10;->g:Lo/eih;

    invoke-virtual {v0}, Lo/eih;->getViewPortHandler()Lo/oa;

    move-result-object v0

    check-cast v0, Lo/eip;

    invoke-virtual {v0, v5}, Lo/eip;->d(Landroid/graphics/Matrix;)V

    .line 1722
    const/4 v0, 0x4

    new-array v6, v0, [F

    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v6, v1

    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v6, v1

    iget v0, p0, Lo/eih$10;->d:F

    const/4 v1, 0x2

    aput v0, v6, v1

    const/4 v0, 0x0

    const/4 v1, 0x3

    aput v0, v6, v1

    .line 1723
    iget-object v0, p0, Lo/eih$10;->g:Lo/eih;

    sget-object v1, Lo/eit$b;->e:Lo/eit$b;

    invoke-virtual {v0, v1}, Lo/eih;->b(Lo/eit$b;)Lo/eim;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/eim;->e([F)V

    .line 1724
    const/4 v0, 0x2

    aget v0, v6, v0

    const/4 v1, 0x0

    aget v1, v6, v1

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v7

    .line 1726
    iget-object v0, p0, Lo/eih$10;->g:Lo/eih;

    invoke-virtual {v0}, Lo/eih;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ehw;->c(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lo/eih$10;->a:Z

    if-nez v0, :cond_2

    :cond_1
    iget-object v0, p0, Lo/eih$10;->g:Lo/eih;

    .line 1727
    invoke-virtual {v0}, Lo/eih;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ehw;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lo/eih$10;->a:Z

    if-nez v0, :cond_3

    .line 1728
    :cond_2
    neg-float v0, v7

    mul-float/2addr v0, v4

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    goto :goto_0

    .line 1730
    :cond_3
    mul-float v0, v7, v4

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 1734
    :goto_0
    iget-object v0, p0, Lo/eih$10;->g:Lo/eih;

    invoke-virtual {v0}, Lo/eih;->getViewPortHandler()Lo/oa;

    move-result-object v0

    check-cast v0, Lo/eip;

    invoke-virtual {v0, v5}, Lo/eip;->d(Landroid/graphics/Matrix;)V

    .line 1735
    iget-object v0, p0, Lo/eih$10;->g:Lo/eih;

    invoke-virtual {v0}, Lo/eih;->postInvalidate()V

    .line 1737
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, v4, v0

    if-nez v0, :cond_4

    .line 1738
    iget-object v0, p0, Lo/eih$10;->i:Lo/eki;

    iget-object v1, p0, Lo/eih$10;->k:Lo/eki$e;

    invoke-virtual {v0, v1}, Lo/eki;->c(Lo/eki$b;)V

    .line 1740
    :cond_4
    return-void
.end method
