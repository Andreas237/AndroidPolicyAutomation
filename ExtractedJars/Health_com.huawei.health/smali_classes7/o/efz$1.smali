.class Lo/efz$1;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/efz;->setAutoRotate(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Z

.field final synthetic c:Lo/efz;


# direct methods
.method constructor <init>(Lo/efz;Z)V
    .locals 0

    .line 481
    iput-object p1, p0, Lo/efz$1;->c:Lo/efz;

    iput-boolean p2, p0, Lo/efz$1;->b:Z

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 484
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 485
    iget-object v0, p0, Lo/efz$1;->c:Lo/efz;

    invoke-static {v0}, Lo/efz;->e(Lo/efz;)Lo/efw;

    move-result-object v0

    if-nez v0, :cond_0

    .line 486
    return-void

    .line 488
    :cond_0
    iget-object v0, p0, Lo/efz$1;->c:Lo/efz;

    invoke-static {v0}, Lo/efz;->e(Lo/efz;)Lo/efw;

    move-result-object v0

    iget-boolean v1, p0, Lo/efz$1;->b:Z

    invoke-virtual {v0, v1}, Lo/efw;->b(Z)V

    .line 489
    return-void
.end method
