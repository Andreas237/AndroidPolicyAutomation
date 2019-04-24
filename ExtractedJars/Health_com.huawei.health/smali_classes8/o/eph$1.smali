.class Lo/eph$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eph;->b(JLo/epr;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/eph;


# direct methods
.method constructor <init>(Lo/eph;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lo/eph$1;->d:Lo/eph;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 2

    .line 51
    iget-object v0, p0, Lo/eph$1;->d:Lo/eph;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/eph;->b(Lo/eph;Z)Z

    .line 52
    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 46
    iget-object v0, p0, Lo/eph$1;->d:Lo/eph;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/eph;->b(Lo/eph;Z)Z

    .line 47
    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    .line 57
    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 2

    .line 40
    iget-object v0, p0, Lo/eph$1;->d:Lo/eph;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/eph;->b(Lo/eph;Z)Z

    .line 41
    return-void
.end method
