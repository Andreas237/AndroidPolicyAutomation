.class Lo/eih$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eih;->d(ILo/eih$k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:F

.field final synthetic b:Lo/eih$k;

.field final synthetic c:F

.field final synthetic d:Lo/eih;


# direct methods
.method constructor <init>(Lo/eih;FFLo/eih$k;)V
    .locals 0

    .line 2085
    iput-object p1, p0, Lo/eih$7;->d:Lo/eih;

    iput p2, p0, Lo/eih$7;->c:F

    iput p3, p0, Lo/eih$7;->a:F

    iput-object p4, p0, Lo/eih$7;->b:Lo/eih$k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 5

    .line 2088
    iget-object v0, p0, Lo/eih$7;->d:Lo/eih;

    iget-object v0, v0, Lo/eih;->ax:Lo/ekj;

    invoke-virtual {v0}, Lo/ekj;->d()F

    move-result v4

    .line 2089
    iget-object v0, p0, Lo/eih$7;->d:Lo/eih;

    iget v1, p0, Lo/eih$7;->c:F

    iget v2, p0, Lo/eih$7;->a:F

    iget v3, p0, Lo/eih$7;->c:F

    sub-float/2addr v2, v3

    mul-float/2addr v2, v4

    add-float/2addr v1, v2

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/eih;->e(FZ)V

    .line 2090
    iget-object v0, p0, Lo/eih$7;->d:Lo/eih;

    invoke-virtual {v0}, Lo/eih;->postInvalidate()V

    .line 2092
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, v4, v0

    if-nez v0, :cond_0

    .line 2093
    iget-object v0, p0, Lo/eih$7;->b:Lo/eih$k;

    invoke-virtual {v0}, Lo/eih$k;->e()V

    .line 2095
    :cond_0
    return-void
.end method
