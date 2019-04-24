.class public Lo/eip;
.super Lo/oa;
.source "SourceFile"


# instance fields
.field private k:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Lo/oa;-><init>()V

    .line 20
    iput-object p1, p0, Lo/eip;->k:Landroid/content/Context;

    .line 21
    return-void
.end method


# virtual methods
.method public D()Z
    .locals 3

    .line 50
    const/16 v0, 0x9

    new-array v2, v0, [F

    .line 51
    iget-object v0, p0, Lo/eip;->b:Landroid/graphics/Matrix;

    invoke-virtual {v0, v2}, Landroid/graphics/Matrix;->getValues([F)V

    .line 53
    iget-object v0, p0, Lo/eip;->k:Landroid/content/Context;

    invoke-static {v0}, Lo/ehw;->c(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 54
    const/4 v0, 0x2

    aget v0, v2, v0

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 56
    const/4 v0, 0x1

    return v0

    .line 58
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 60
    :cond_1
    const/4 v0, 0x2

    aget v0, v2, v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    .line 61
    const/4 v0, 0x1

    return v0

    .line 63
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public d(Landroid/graphics/Matrix;Landroid/view/View;Z)Landroid/graphics/Matrix;
    .locals 3

    .line 27
    instance-of v0, p2, Lo/eih;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lo/eih;

    .line 28
    invoke-virtual {v0}, Lo/eih;->Z()Lo/eih$c;

    move-result-object v0

    sget-object v1, Lo/eih$c;->e:Lo/eih$c;

    if-ne v0, v1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 30
    :goto_0
    iget-object v0, p0, Lo/eip;->b:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 32
    if-nez v2, :cond_1

    .line 34
    iget-object v0, p0, Lo/eip;->b:Landroid/graphics/Matrix;

    iget-object v1, p0, Lo/eip;->e:Landroid/graphics/RectF;

    invoke-virtual {p0, v0, v1}, Lo/eip;->c(Landroid/graphics/Matrix;Landroid/graphics/RectF;)V

    .line 37
    :cond_1
    if-eqz p3, :cond_2

    instance-of v0, p2, Lo/eie;

    if-eqz v0, :cond_2

    .line 38
    move-object v0, p2

    check-cast v0, Lo/eie;

    invoke-virtual {v0}, Lo/eie;->L()V

    .line 41
    :cond_2
    iget-object v0, p0, Lo/eip;->b:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 42
    return-object p1
.end method

.method public d(Landroid/graphics/Matrix;)V
    .locals 1

    .line 46
    iget-object v0, p0, Lo/eip;->b:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 47
    return-void
.end method
