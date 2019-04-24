.class Lo/bfb$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bfb;->a(Landroid/view/View;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/bfb;


# direct methods
.method constructor <init>(Lo/bfb;)V
    .locals 0

    .line 519
    iput-object p1, p0, Lo/bfb$1;->d:Lo/bfb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 3

    .line 533
    iget-object v0, p0, Lo/bfb$1;->d:Lo/bfb;

    invoke-static {v0}, Lo/bfb;->d(Lo/bfb;)Lo/bey;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 535
    iget-object v0, p0, Lo/bfb$1;->d:Lo/bfb;

    invoke-static {v0}, Lo/bfb;->d(Lo/bfb;)Lo/bey;

    move-result-object v0

    iget-object v1, p0, Lo/bfb$1;->d:Lo/bfb;

    invoke-static {v1}, Lo/bfb;->b(Lo/bfb;)Lo/bfb$e;

    move-result-object v1

    sget-object v2, Lo/bey$a;->b:Lo/bey$a;

    invoke-interface {v0, v1, v2}, Lo/bey;->b(Lo/bfb$e;Lo/bey$a;)V

    .line 538
    :cond_0
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 3

    .line 543
    iget-object v0, p0, Lo/bfb$1;->d:Lo/bfb;

    invoke-static {v0}, Lo/bfb;->d(Lo/bfb;)Lo/bey;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 545
    iget-object v0, p0, Lo/bfb$1;->d:Lo/bfb;

    invoke-static {v0}, Lo/bfb;->d(Lo/bfb;)Lo/bey;

    move-result-object v0

    iget-object v1, p0, Lo/bfb$1;->d:Lo/bfb;

    invoke-static {v1}, Lo/bfb;->b(Lo/bfb;)Lo/bfb$e;

    move-result-object v1

    sget-object v2, Lo/bey$a;->d:Lo/bey$a;

    invoke-interface {v0, v1, v2}, Lo/bey;->b(Lo/bfb$e;Lo/bey$a;)V

    .line 547
    :cond_0
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 3

    .line 524
    iget-object v0, p0, Lo/bfb$1;->d:Lo/bfb;

    invoke-static {v0}, Lo/bfb;->d(Lo/bfb;)Lo/bey;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 526
    iget-object v0, p0, Lo/bfb$1;->d:Lo/bfb;

    invoke-static {v0}, Lo/bfb;->d(Lo/bfb;)Lo/bey;

    move-result-object v0

    iget-object v1, p0, Lo/bfb$1;->d:Lo/bfb;

    invoke-static {v1}, Lo/bfb;->b(Lo/bfb;)Lo/bfb$e;

    move-result-object v1

    sget-object v2, Lo/bey$a;->e:Lo/bey$a;

    invoke-interface {v0, v1, v2}, Lo/bey;->b(Lo/bfb$e;Lo/bey$a;)V

    .line 528
    :cond_0
    return-void
.end method
