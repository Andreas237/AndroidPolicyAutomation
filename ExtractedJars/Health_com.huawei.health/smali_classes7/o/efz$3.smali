.class Lo/efz$3;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/efz;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/efz;


# direct methods
.method constructor <init>(Lo/efz;)V
    .locals 0

    .line 322
    iput-object p1, p0, Lo/efz$3;->c:Lo/efz;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 325
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 326
    iget-object v0, p0, Lo/efz$3;->c:Lo/efz;

    invoke-static {v0}, Lo/efz;->e(Lo/efz;)Lo/efw;

    move-result-object v0

    if-nez v0, :cond_0

    .line 327
    return-void

    .line 329
    :cond_0
    iget-object v0, p0, Lo/efz$3;->c:Lo/efz;

    invoke-static {v0}, Lo/efz;->e(Lo/efz;)Lo/efw;

    move-result-object v0

    new-instance v1, Lo/efz$3$3;

    invoke-direct {v1, p0}, Lo/efz$3$3;-><init>(Lo/efz$3;)V

    invoke-virtual {v0, v1}, Lo/efw;->c(Ljava/lang/Runnable;)V

    .line 337
    iget-object v0, p0, Lo/efz$3;->c:Lo/efz;

    invoke-static {v0}, Lo/efz;->e(Lo/efz;)Lo/efw;

    move-result-object v0

    invoke-virtual {v0}, Lo/efw;->k()V

    .line 338
    return-void
.end method
