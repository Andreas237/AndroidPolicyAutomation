.class public Lo/efd;
.super Lo/eev;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 8
    invoke-direct {p0, p1}, Lo/eev;-><init>(Landroid/content/Context;)V

    .line 9
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 45
    invoke-super {p0}, Lo/eev;->a()V

    .line 46
    iget-object v0, p0, Lo/efd;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/eew;

    .line 47
    invoke-virtual {v2}, Lo/eew;->a()V

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    return-void
.end method

.method protected a(Lo/eew;)V
    .locals 1

    .line 14
    invoke-virtual {p0}, Lo/efd;->h()Lo/efi$b;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/eew;->d(Lo/efi$b;)V

    .line 15
    iget-boolean v0, p0, Lo/efd;->m:Z

    if-eqz v0, :cond_0

    .line 16
    invoke-virtual {p1}, Lo/eew;->a()V

    .line 18
    :cond_0
    invoke-virtual {p1}, Lo/eew;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 19
    return-void

    .line 21
    :cond_1
    new-instance v0, Lo/efd$1;

    invoke-direct {v0, p0, p1}, Lo/efd$1;-><init>(Lo/efd;Lo/eew;)V

    invoke-virtual {p1, v0}, Lo/eew;->c(Ljava/lang/Runnable;)V

    .line 28
    invoke-virtual {p1}, Lo/eew;->k()V

    .line 29
    return-void
.end method

.method public b()V
    .locals 3

    .line 53
    iget-object v0, p0, Lo/efd;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/eew;

    .line 54
    invoke-virtual {v2}, Lo/eew;->b()V

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    return-void
.end method

.method public c()V
    .locals 3

    .line 60
    iget-object v0, p0, Lo/efd;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/eew;

    .line 61
    invoke-virtual {v2}, Lo/eew;->c()V

    .line 62
    goto :goto_0

    .line 63
    :cond_0
    iget-object v0, p0, Lo/efd;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 64
    return-void
.end method

.method public varargs c([Lo/eew;)V
    .locals 0

    .line 40
    invoke-virtual {p0, p1}, Lo/efd;->b([Lo/eew;)V

    .line 41
    return-void
.end method

.method public i()V
    .locals 2

    .line 33
    const/16 v0, 0x4100

    invoke-static {v0}, Landroid/opengl/GLES20;->glClear(I)V

    .line 34
    const/4 v1, 0x0

    :goto_0
    iget-object v0, p0, Lo/efd;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 35
    iget-object v0, p0, Lo/efd;->n:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eew;

    invoke-virtual {v0}, Lo/eew;->i()V

    .line 34
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 37
    :cond_0
    return-void
.end method
