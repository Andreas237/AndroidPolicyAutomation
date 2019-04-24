.class public Lo/dym;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private e:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lo/dym;->e:F

    return-void
.end method


# virtual methods
.method public a(Landroid/animation/ValueAnimator$AnimatorUpdateListener;I)V
    .locals 3

    .line 13
    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v2

    .line 15
    new-instance v0, Lo/dym$4;

    invoke-direct {v0, p0, p1}, Lo/dym$4;-><init>(Lo/dym;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    invoke-virtual {v2, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 23
    int-to-long v0, p2

    invoke-virtual {v2, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 24
    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->start()V

    .line 25
    return-void

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public b(F)V
    .locals 0

    .line 28
    iput p1, p0, Lo/dym;->e:F

    .line 29
    return-void
.end method

.method public c()F
    .locals 1

    .line 31
    iget v0, p0, Lo/dym;->e:F

    return v0
.end method
