.class Lo/dym$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dym;->a(Landroid/animation/ValueAnimator$AnimatorUpdateListener;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/dym;

.field final synthetic e:Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# direct methods
.method constructor <init>(Lo/dym;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
    .locals 0

    .line 15
    iput-object p1, p0, Lo/dym$4;->d:Lo/dym;

    iput-object p2, p0, Lo/dym$4;->e:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    .line 18
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v1

    .line 19
    iget-object v0, p0, Lo/dym$4;->d:Lo/dym;

    invoke-virtual {v0, v1}, Lo/dym;->b(F)V

    .line 20
    iget-object v0, p0, Lo/dym$4;->e:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    invoke-interface {v0, p1}, Landroid/animation/ValueAnimator$AnimatorUpdateListener;->onAnimationUpdate(Landroid/animation/ValueAnimator;)V

    .line 21
    return-void
.end method
