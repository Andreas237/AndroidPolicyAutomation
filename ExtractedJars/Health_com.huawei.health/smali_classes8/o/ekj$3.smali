.class Lo/ekj$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ekj;->a(Landroid/animation/ValueAnimator$AnimatorUpdateListener;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/ekj;

.field final synthetic e:Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# direct methods
.method constructor <init>(Lo/ekj;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
    .locals 0

    .line 18
    iput-object p1, p0, Lo/ekj$3;->a:Lo/ekj;

    iput-object p2, p0, Lo/ekj$3;->e:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    .line 21
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v1

    .line 22
    iget-object v0, p0, Lo/ekj$3;->a:Lo/ekj;

    invoke-virtual {v0, v1}, Lo/ekj;->b(F)V

    .line 23
    iget-object v0, p0, Lo/ekj$3;->e:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    invoke-interface {v0, p1}, Landroid/animation/ValueAnimator$AnimatorUpdateListener;->onAnimationUpdate(Landroid/animation/ValueAnimator;)V

    .line 24
    return-void
.end method
