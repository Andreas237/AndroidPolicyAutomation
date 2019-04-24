.class Lo/eph$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eph;->b(JLo/epr;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/eph;


# direct methods
.method constructor <init>(Lo/eph;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lo/eph$2;->e:Lo/eph;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 4

    .line 65
    const-string v0, "AntimationRunner"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onAnimationUpdate "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/eph$2;->e:Lo/eph;

    invoke-static {v2}, Lo/eph;->b(Lo/eph;)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    iget-object v0, p0, Lo/eph$2;->e:Lo/eph;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-static {v0, v1}, Lo/eph;->c(Lo/eph;F)F

    .line 67
    iget-object v0, p0, Lo/eph$2;->e:Lo/eph;

    invoke-static {v0}, Lo/eph;->c(Lo/eph;)Lo/epr;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 68
    iget-object v0, p0, Lo/eph$2;->e:Lo/eph;

    invoke-static {v0}, Lo/eph;->c(Lo/eph;)Lo/epr;

    move-result-object v0

    iget-object v1, p0, Lo/eph$2;->e:Lo/eph;

    invoke-static {v1}, Lo/eph;->b(Lo/eph;)F

    move-result v1

    iget-object v2, p0, Lo/eph$2;->e:Lo/eph;

    invoke-static {v2}, Lo/eph;->d(Lo/eph;)I

    move-result v2

    invoke-interface {v0, v1, v2}, Lo/epr;->b(FI)V

    .line 70
    :cond_0
    return-void
.end method
