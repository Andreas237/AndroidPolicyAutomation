.class Lo/eir$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eir;->d(FFZLo/eih$k;Lo/eih$a;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/eih$k;

.field final synthetic c:Lo/eih$a;

.field final synthetic d:Lo/eir;


# direct methods
.method constructor <init>(Lo/eir;Lo/eih$a;Lo/eih$k;)V
    .locals 0

    .line 434
    iput-object p1, p0, Lo/eir$5;->d:Lo/eir;

    iput-object p2, p0, Lo/eir$5;->c:Lo/eih$a;

    iput-object p3, p0, Lo/eir$5;->a:Lo/eih$k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 4

    .line 437
    iget-object v0, p0, Lo/eir$5;->d:Lo/eir;

    iget-object v0, v0, Lo/eir;->y:Lo/ekj;

    invoke-virtual {v0}, Lo/ekj;->b()F

    move-result v2

    .line 438
    iget-object v0, p0, Lo/eir$5;->c:Lo/eih$a;

    invoke-interface {v0, v2}, Lo/eih$a;->b(F)F

    move-result v2

    .line 439
    iget-object v0, p0, Lo/eir$5;->d:Lo/eir;

    invoke-static {v0}, Lo/eir;->d(Lo/eir;)F

    move-result v0

    iget-object v1, p0, Lo/eir$5;->d:Lo/eir;

    invoke-static {v1}, Lo/eir;->e(Lo/eir;)F

    move-result v1

    mul-float/2addr v1, v2

    add-float v3, v0, v1

    .line 444
    iget-object v0, p0, Lo/eir$5;->d:Lo/eir;

    invoke-static {v0}, Lo/eir;->a(Lo/eir;)Lo/lp;

    move-result-object v0

    invoke-virtual {v0, v3}, Lo/lp;->a(F)V

    .line 447
    iget-object v0, p0, Lo/eir$5;->d:Lo/eir;

    invoke-static {v0, v3}, Lo/eir;->e(Lo/eir;F)F

    .line 448
    iget-object v0, p0, Lo/eir$5;->d:Lo/eir;

    iget-object v0, v0, Lo/eir;->u:Lo/eie;

    invoke-virtual {v0}, Lo/eie;->postInvalidate()V

    .line 449
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, v2, v0

    if-nez v0, :cond_0

    .line 450
    iget-object v0, p0, Lo/eir$5;->a:Lo/eih$k;

    invoke-virtual {v0}, Lo/eih$k;->e()V

    .line 451
    iget-object v0, p0, Lo/eir$5;->d:Lo/eir;

    invoke-static {v0}, Lo/eir;->c(Lo/eir;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 452
    iget-object v0, p0, Lo/eir$5;->d:Lo/eir;

    invoke-static {v0}, Lo/eir;->b(Lo/eir;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 454
    :cond_0
    return-void
.end method
