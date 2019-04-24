.class Lo/cig$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cig;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cig;


# direct methods
.method constructor <init>(Lo/cig;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lo/cig$5;->a:Lo/cig;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    .line 100
    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 94
    iget-object v0, p0, Lo/cig$5;->a:Lo/cig;

    iget-object v1, p0, Lo/cig$5;->a:Lo/cig;

    invoke-static {v1}, Lo/cig;->b(Lo/cig;)I

    move-result v1

    invoke-static {v0, v1}, Lo/cig;->c(Lo/cig;I)V

    .line 95
    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    .line 105
    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    .line 90
    return-void
.end method
