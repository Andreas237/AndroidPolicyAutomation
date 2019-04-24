.class Lo/bwr$3;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bwr;->c(Landroid/view/View;F)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bwr;


# direct methods
.method constructor <init>(Lo/bwr;)V
    .locals 0

    .line 145
    iput-object p1, p0, Lo/bwr$3;->a:Lo/bwr;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 156
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 157
    iget-object v0, p0, Lo/bwr$3;->a:Lo/bwr;

    invoke-static {v0}, Lo/bwr;->e(Lo/bwr;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bwr$3;->a:Lo/bwr;

    invoke-static {v0}, Lo/bwr;->c(Lo/bwr;)Lo/bwg;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 158
    :cond_0
    return-void

    .line 160
    :cond_1
    iget-object v0, p0, Lo/bwr$3;->a:Lo/bwr;

    invoke-static {v0}, Lo/bwr;->b(Lo/bwr;)I

    move-result v0

    if-nez v0, :cond_2

    .line 161
    iget-object v0, p0, Lo/bwr$3;->a:Lo/bwr;

    invoke-static {v0}, Lo/bwr;->c(Lo/bwr;)Lo/bwg;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/bwg;->setVisibility(I)V

    goto :goto_0

    .line 163
    :cond_2
    iget-object v0, p0, Lo/bwr$3;->a:Lo/bwr;

    invoke-static {v0}, Lo/bwr;->c(Lo/bwr;)Lo/bwg;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bwg;->setVisibility(I)V

    .line 165
    :goto_0
    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 2

    .line 148
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationStart(Landroid/animation/Animator;)V

    .line 149
    iget-object v0, p0, Lo/bwr$3;->a:Lo/bwr;

    invoke-static {v0}, Lo/bwr;->c(Lo/bwr;)Lo/bwg;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 150
    iget-object v0, p0, Lo/bwr$3;->a:Lo/bwr;

    invoke-static {v0}, Lo/bwr;->c(Lo/bwr;)Lo/bwg;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/bwg;->setVisibility(I)V

    .line 152
    :cond_0
    return-void
.end method
