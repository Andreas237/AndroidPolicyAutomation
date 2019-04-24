.class Lo/cir$9$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cir$9;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cir$9;


# direct methods
.method constructor <init>(Lo/cir$9;)V
    .locals 0

    .line 1010
    iput-object p1, p0, Lo/cir$9$4;->a:Lo/cir$9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    .line 1034
    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 4

    .line 1018
    iget-object v0, p0, Lo/cir$9$4;->a:Lo/cir$9;

    iget-object v0, v0, Lo/cir$9;->d:Lo/cir;

    invoke-static {v0}, Lo/cir;->t(Lo/cir;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1019
    iget-object v0, p0, Lo/cir$9$4;->a:Lo/cir$9;

    iget-object v0, v0, Lo/cir$9;->d:Lo/cir;

    invoke-static {v0}, Lo/cir;->s(Lo/cir;)I

    move-result v0

    const/16 v1, 0x108

    if-eq v0, v1, :cond_0

    .line 1020
    iget-object v0, p0, Lo/cir$9$4;->a:Lo/cir$9;

    iget-object v0, v0, Lo/cir$9;->d:Lo/cir;

    invoke-static {v0}, Lo/cir;->u(Lo/cir;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1023
    :cond_0
    iget-object v0, p0, Lo/cir$9$4;->a:Lo/cir$9;

    iget-object v0, v0, Lo/cir$9;->d:Lo/cir;

    invoke-static {v0}, Lo/cir;->f(Lo/cir;)Lo/cir$e;

    move-result-object v0

    new-instance v1, Lo/cir$9$4$5;

    invoke-direct {v1, p0}, Lo/cir$9$4$5;-><init>(Lo/cir$9$4;)V

    const-wide/16 v2, 0x32

    invoke-virtual {v0, v1, v2, v3}, Lo/cir$e;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1029
    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    .line 1039
    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    .line 1014
    return-void
.end method
