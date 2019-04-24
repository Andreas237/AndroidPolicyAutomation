.class Lo/dyp$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dyp;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/dyp;


# direct methods
.method constructor <init>(Lo/dyp;)V
    .locals 0

    .line 645
    iput-object p1, p0, Lo/dyp$5;->c:Lo/dyp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 5

    .line 648
    iget-object v0, p0, Lo/dyp$5;->c:Lo/dyp;

    iget-object v0, v0, Lo/dyp;->a:Lo/dym;

    invoke-virtual {v0}, Lo/dym;->c()F

    move-result v4

    .line 649
    iget-object v0, p0, Lo/dyp$5;->c:Lo/dyp;

    iget-object v1, p0, Lo/dyp$5;->c:Lo/dyp;

    invoke-static {v1}, Lo/dyp;->d(Lo/dyp;)F

    move-result v1

    iget-object v2, p0, Lo/dyp$5;->c:Lo/dyp;

    invoke-static {v2}, Lo/dyp;->e(Lo/dyp;)F

    move-result v2

    iget-object v3, p0, Lo/dyp$5;->c:Lo/dyp;

    invoke-static {v3}, Lo/dyp;->d(Lo/dyp;)F

    move-result v3

    sub-float/2addr v2, v3

    mul-float/2addr v2, v4

    add-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lo/dyp;->a(F)V

    .line 650
    return-void
.end method
