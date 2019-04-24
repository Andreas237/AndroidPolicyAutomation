.class Lo/enm$5;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/enm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/enm;


# direct methods
.method constructor <init>(Lo/enm;)V
    .locals 0

    .line 849
    iput-object p1, p0, Lo/enm$5;->e:Lo/enm;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onDown(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 859
    iget-object v0, p0, Lo/enm$5;->e:Lo/enm;

    invoke-static {v0}, Lo/enm;->b(Lo/enm;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 860
    iget-object v0, p0, Lo/enm$5;->e:Lo/enm;

    invoke-static {v0}, Lo/enm;->c(Lo/enm;)Landroid/widget/Scroller;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Scroller;->forceFinished(Z)V

    .line 861
    iget-object v0, p0, Lo/enm$5;->e:Lo/enm;

    invoke-static {v0}, Lo/enm;->d(Lo/enm;)V

    .line 862
    const/4 v0, 0x1

    return v0

    .line 864
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 11

    .line 869
    iget-object v0, p0, Lo/enm$5;->e:Lo/enm;

    iget-object v1, p0, Lo/enm$5;->e:Lo/enm;

    invoke-static {v1}, Lo/enm;->e(Lo/enm;)I

    move-result v1

    iget-object v2, p0, Lo/enm$5;->e:Lo/enm;

    invoke-static {v2}, Lo/enm;->h(Lo/enm;)I

    move-result v2

    mul-int/2addr v1, v2

    iget-object v2, p0, Lo/enm$5;->e:Lo/enm;

    invoke-static {v2}, Lo/enm;->g(Lo/enm;)I

    move-result v2

    add-int/2addr v1, v2

    invoke-static {v0, v1}, Lo/enm;->a(Lo/enm;I)I

    .line 870
    iget-object v0, p0, Lo/enm$5;->e:Lo/enm;

    iget-boolean v0, v0, Lo/enm;->b:Z

    if-eqz v0, :cond_0

    const v9, 0x7fffffff

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo/enm$5;->e:Lo/enm;

    invoke-static {v0}, Lo/enm;->i(Lo/enm;)Lo/enn;

    move-result-object v0

    invoke-interface {v0}, Lo/enn;->d()I

    move-result v0

    iget-object v1, p0, Lo/enm$5;->e:Lo/enm;

    .line 871
    invoke-static {v1}, Lo/enm;->h(Lo/enm;)I

    move-result v1

    mul-int v9, v0, v1

    .line 872
    :goto_0
    iget-object v0, p0, Lo/enm$5;->e:Lo/enm;

    iget-boolean v0, v0, Lo/enm;->b:Z

    if-eqz v0, :cond_1

    neg-int v10, v9

    goto :goto_1

    :cond_1
    const/4 v10, 0x0

    .line 873
    :goto_1
    iget-object v0, p0, Lo/enm$5;->e:Lo/enm;

    invoke-static {v0}, Lo/enm;->c(Lo/enm;)Landroid/widget/Scroller;

    move-result-object v0

    iget-object v1, p0, Lo/enm$5;->e:Lo/enm;

    invoke-static {v1}, Lo/enm;->f(Lo/enm;)I

    move-result v2

    neg-float v1, p4

    float-to-int v1, v1

    div-int/lit8 v4, v1, 0x2

    move v7, v10

    move v8, v9

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v8}, Landroid/widget/Scroller;->fling(IIIIIIII)V

    .line 875
    iget-object v0, p0, Lo/enm$5;->e:Lo/enm;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/enm;->e(Lo/enm;I)V

    .line 876
    const/4 v0, 0x1

    return v0
.end method

.method public onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 2

    .line 853
    iget-object v0, p0, Lo/enm$5;->e:Lo/enm;

    invoke-static {v0}, Lo/enm;->a(Lo/enm;)V

    .line 854
    iget-object v0, p0, Lo/enm$5;->e:Lo/enm;

    neg-float v1, p4

    float-to-int v1, v1

    invoke-static {v0, v1}, Lo/enm;->d(Lo/enm;I)V

    .line 855
    const/4 v0, 0x1

    return v0
.end method
