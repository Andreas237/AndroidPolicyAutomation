.class public Lo/ekj;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private c:F

.field private d:F

.field private e:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lo/ekj;->d:F

    .line 12
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lo/ekj;->e:F

    .line 13
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lo/ekj;->c:F

    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 0

    .line 53
    iput p1, p0, Lo/ekj;->d:F

    .line 54
    return-void
.end method

.method public a(Landroid/animation/ValueAnimator$AnimatorUpdateListener;I)V
    .locals 3

    .line 16
    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v2

    .line 18
    new-instance v0, Lo/ekj$3;

    invoke-direct {v0, p0, p1}, Lo/ekj$3;-><init>(Lo/ekj;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    invoke-virtual {v2, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 26
    int-to-long v0, p2

    invoke-virtual {v2, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 27
    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->start()V

    .line 28
    return-void

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public b()F
    .locals 1

    .line 34
    iget v0, p0, Lo/ekj;->e:F

    return v0
.end method

.method public b(F)V
    .locals 0

    .line 31
    iput p1, p0, Lo/ekj;->e:F

    .line 32
    return-void
.end method

.method public c()F
    .locals 1

    .line 77
    iget v0, p0, Lo/ekj;->c:F

    return v0
.end method

.method public c(F)V
    .locals 0

    .line 74
    iput p1, p0, Lo/ekj;->c:F

    .line 75
    return-void
.end method

.method public c(Landroid/animation/ValueAnimator$AnimatorUpdateListener;I)V
    .locals 3

    .line 38
    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v2

    .line 40
    new-instance v0, Lo/ekj$2;

    invoke-direct {v0, p0, p1}, Lo/ekj$2;-><init>(Lo/ekj;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    invoke-virtual {v2, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 48
    int-to-long v0, p2

    invoke-virtual {v2, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 49
    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->start()V

    .line 50
    return-void

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public d()F
    .locals 1

    .line 56
    iget v0, p0, Lo/ekj;->d:F

    return v0
.end method

.method public d(Landroid/animation/ValueAnimator$AnimatorUpdateListener;I)V
    .locals 3

    .line 59
    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v2

    .line 61
    new-instance v0, Lo/ekj$1;

    invoke-direct {v0, p0, p1}, Lo/ekj$1;-><init>(Lo/ekj;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    invoke-virtual {v2, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 69
    int-to-long v0, p2

    invoke-virtual {v2, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 70
    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->start()V

    .line 71
    return-void

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method
