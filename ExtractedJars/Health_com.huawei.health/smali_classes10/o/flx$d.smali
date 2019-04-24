.class Lo/flx$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fmt;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/flx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final synthetic a:Lo/flx;


# direct methods
.method private constructor <init>(Lo/flx;)V
    .locals 0

    .line 652
    iput-object p1, p0, Lo/flx$d;->a:Lo/flx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/flx;Lo/flx$1;)V
    .locals 0

    .line 652
    invoke-direct {p0, p1}, Lo/flx$d;-><init>(Lo/flx;)V

    return-void
.end method

.method private e(Lo/flq;)V
    .locals 2

    .line 742
    invoke-virtual {p1}, Lo/flq;->u()Lo/fow;

    move-result-object v0

    if-nez v0, :cond_0

    .line 743
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Message has no endpoint context"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 745
    :cond_0
    return-void
.end method


# virtual methods
.method public c(Lo/fmb;Lo/fly;)V
    .locals 6

    .line 693
    invoke-direct {p0, p2}, Lo/flx$d;->e(Lo/flq;)V

    .line 694
    iget-object v0, p0, Lo/flx$d;->a:Lo/flx;

    invoke-static {v0}, Lo/flx;->d(Lo/flx;)Lo/fmo;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/fmo;->d(Lo/fmb;Lo/fly;)V

    .line 701
    iget-object v0, p0, Lo/flx$d;->a:Lo/flx;

    invoke-static {v0}, Lo/flx;->c(Lo/flx;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/fnj;

    .line 702
    invoke-interface {v5, p2}, Lo/fnj;->e(Lo/fly;)V

    .line 703
    goto :goto_0

    .line 704
    :cond_0
    invoke-virtual {p2}, Lo/fly;->z()V

    .line 707
    invoke-virtual {p2}, Lo/fly;->y()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 708
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    .line 709
    invoke-virtual {p1}, Lo/fmb;->l()V

    goto :goto_1

    .line 712
    :cond_1
    iget-object v0, p0, Lo/flx$d;->a:Lo/flx;

    invoke-static {v0}, Lo/flx;->k(Lo/flx;)Lo/fov;

    move-result-object v0

    iget-object v1, p0, Lo/flx$d;->a:Lo/flx;

    invoke-static {v1}, Lo/flx;->b(Lo/flx;)Lo/fng;

    move-result-object v1

    new-instance v2, Lo/flx$a;

    iget-object v3, p0, Lo/flx$d;->a:Lo/flx;

    invoke-direct {v2, v3, p2}, Lo/flx$a;-><init>(Lo/flx;Lo/flq;)V

    invoke-virtual {v1, p2, v2}, Lo/fng;->c(Lo/fly;Lo/fpf;)Lo/fpd;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/fov;->c(Lo/fpd;)V

    .line 714
    :cond_2
    :goto_1
    return-void
.end method

.method public c(Lo/fmb;Lo/fma;)V
    .locals 5

    .line 657
    invoke-direct {p0, p2}, Lo/flx$d;->e(Lo/flq;)V

    .line 658
    iget-object v0, p0, Lo/flx$d;->a:Lo/flx;

    invoke-static {v0}, Lo/flx;->d(Lo/flx;)Lo/fmo;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/fmo;->c(Lo/fmb;Lo/fma;)V

    .line 666
    iget-object v0, p0, Lo/flx$d;->a:Lo/flx;

    invoke-static {v0}, Lo/flx;->c(Lo/flx;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/fnj;

    .line 667
    invoke-interface {v4, p2}, Lo/fnj;->d(Lo/fma;)V

    .line 668
    goto :goto_0

    .line 670
    :cond_0
    invoke-virtual {p2}, Lo/fma;->z()V

    .line 673
    invoke-virtual {p2}, Lo/fma;->y()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 682
    invoke-virtual {p1}, Lo/fmb;->l()V

    goto :goto_1

    .line 685
    :cond_1
    iget-object v0, p0, Lo/flx$d;->a:Lo/flx;

    invoke-static {v0}, Lo/flx;->b(Lo/flx;)Lo/fng;

    move-result-object v0

    new-instance v1, Lo/flx$h;

    iget-object v2, p0, Lo/flx$d;->a:Lo/flx;

    invoke-direct {v1, v2, p1, p2}, Lo/flx$h;-><init>(Lo/flx;Lo/fmb;Lo/fma;)V

    invoke-virtual {v0, p2, v1}, Lo/fng;->d(Lo/fma;Lo/fpf;)Lo/fpd;

    move-result-object v3

    .line 686
    iget-object v0, p0, Lo/flx$d;->a:Lo/flx;

    invoke-static {v0}, Lo/flx;->k(Lo/flx;)Lo/fov;

    move-result-object v0

    invoke-interface {v0, v3}, Lo/fov;->c(Lo/fpd;)V

    .line 688
    :goto_1
    return-void
.end method

.method public d(Lo/fmb;Lo/flo;)V
    .locals 6

    .line 719
    invoke-direct {p0, p2}, Lo/flx$d;->e(Lo/flq;)V

    .line 720
    iget-object v0, p0, Lo/flx$d;->a:Lo/flx;

    invoke-static {v0}, Lo/flx;->d(Lo/flx;)Lo/fmo;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/fmo;->a(Lo/fmb;Lo/flo;)V

    .line 727
    iget-object v0, p0, Lo/flx$d;->a:Lo/flx;

    invoke-static {v0}, Lo/flx;->c(Lo/flx;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/fnj;

    .line 728
    invoke-interface {v5, p2}, Lo/fnj;->c(Lo/flo;)V

    .line 729
    goto :goto_0

    .line 730
    :cond_0
    invoke-virtual {p2}, Lo/flo;->z()V

    .line 732
    invoke-virtual {p2}, Lo/flo;->y()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 733
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    .line 734
    invoke-virtual {p1}, Lo/fmb;->l()V

    goto :goto_1

    .line 737
    :cond_1
    iget-object v0, p0, Lo/flx$d;->a:Lo/flx;

    invoke-static {v0}, Lo/flx;->k(Lo/flx;)Lo/fov;

    move-result-object v0

    iget-object v1, p0, Lo/flx$d;->a:Lo/flx;

    invoke-static {v1}, Lo/flx;->b(Lo/flx;)Lo/fng;

    move-result-object v1

    new-instance v2, Lo/flx$a;

    iget-object v3, p0, Lo/flx$d;->a:Lo/flx;

    invoke-direct {v2, v3, p2}, Lo/flx$a;-><init>(Lo/flx;Lo/flq;)V

    invoke-virtual {v1, p2, v2}, Lo/fng;->e(Lo/flo;Lo/fpf;)Lo/fpd;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/fov;->c(Lo/fpd;)V

    .line 739
    :cond_2
    :goto_1
    return-void
.end method
