.class public Lo/byr;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/byr$c;
    }
.end annotation


# instance fields
.field private a:Lo/byr$c;

.field private b:I

.field private c:Landroid/view/View;

.field private d:I

.field private e:Z

.field private i:Landroid/animation/ValueAnimator;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 22
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/byr;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 23
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 26
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 27
    return-void
.end method

.method private a(J)V
    .locals 2

    .line 112
    iget-object v0, p0, Lo/byr;->i:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, p1, p2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 113
    iget-object v0, p0, Lo/byr;->i:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 114
    iget-object v0, p0, Lo/byr;->i:Landroid/animation/ValueAnimator;

    new-instance v1, Lo/byr$1;

    invoke-direct {v1, p0}, Lo/byr$1;-><init>(Lo/byr;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 121
    return-void
.end method

.method static synthetic e(Lo/byr;I)V
    .locals 0

    .line 12
    invoke-direct {p0, p1}, Lo/byr;->setAnimatedHeight(I)V

    return-void
.end method

.method private setAnimatedHeight(I)V
    .locals 5

    .line 124
    iget-object v0, p0, Lo/byr;->c:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 125
    iput p1, v3, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 126
    iget-object v0, p0, Lo/byr;->c:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 128
    iget-object v0, p0, Lo/byr;->a:Lo/byr$c;

    if-eqz v0, :cond_0

    .line 129
    iget v0, p0, Lo/byr;->b:I

    sub-int v0, p1, v0

    int-to-float v0, v0

    iget v1, p0, Lo/byr;->d:I

    iget v2, p0, Lo/byr;->b:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    div-float v4, v0, v1

    .line 130
    iget-object v0, p0, Lo/byr;->a:Lo/byr$c;

    invoke-interface {v0, v4}, Lo/byr$c;->d(F)V

    .line 132
    :cond_0
    return-void
.end method


# virtual methods
.method public d(J)V
    .locals 3

    .line 61
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/byr;->e:Z

    .line 63
    iget-object v0, p0, Lo/byr;->c:Landroid/view/View;

    if-nez v0, :cond_0

    .line 64
    return-void

    .line 67
    :cond_0
    iget-object v0, p0, Lo/byr;->c:Landroid/view/View;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/View;->measure(II)V

    .line 68
    iget-object v0, p0, Lo/byr;->c:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    iput v0, p0, Lo/byr;->d:I

    .line 70
    iget-object v0, p0, Lo/byr;->i:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_1

    .line 71
    iget-object v0, p0, Lo/byr;->i:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 74
    :cond_1
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-eqz v0, :cond_2

    .line 75
    const/4 v0, 0x2

    new-array v0, v0, [I

    iget-object v1, p0, Lo/byr;->c:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    iget v1, p0, Lo/byr;->d:I

    const/4 v2, 0x1

    aput v1, v0, v2

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lo/byr;->i:Landroid/animation/ValueAnimator;

    .line 76
    invoke-direct {p0, p1, p2}, Lo/byr;->a(J)V

    goto :goto_0

    .line 78
    :cond_2
    iget v0, p0, Lo/byr;->d:I

    invoke-direct {p0, v0}, Lo/byr;->setAnimatedHeight(I)V

    .line 80
    :goto_0
    return-void
.end method

.method public d()Z
    .locals 1

    .line 107
    iget-boolean v0, p0, Lo/byr;->e:Z

    return v0
.end method

.method public e(J)V
    .locals 3

    .line 84
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/byr;->e:Z

    .line 86
    iget-object v0, p0, Lo/byr;->c:Landroid/view/View;

    if-nez v0, :cond_0

    .line 87
    return-void

    .line 90
    :cond_0
    iget v0, p0, Lo/byr;->b:I

    if-nez v0, :cond_1

    .line 91
    return-void

    .line 94
    :cond_1
    iget-object v0, p0, Lo/byr;->i:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_2

    .line 95
    iget-object v0, p0, Lo/byr;->i:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 98
    :cond_2
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-eqz v0, :cond_3

    .line 99
    const/4 v0, 0x2

    new-array v0, v0, [I

    iget-object v1, p0, Lo/byr;->c:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    iget v1, p0, Lo/byr;->b:I

    const/4 v2, 0x1

    aput v1, v0, v2

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lo/byr;->i:Landroid/animation/ValueAnimator;

    .line 100
    invoke-direct {p0, p1, p2}, Lo/byr;->a(J)V

    goto :goto_0

    .line 102
    :cond_3
    iget v0, p0, Lo/byr;->b:I

    invoke-direct {p0, v0}, Lo/byr;->setAnimatedHeight(I)V

    .line 104
    :goto_0
    return-void
.end method

.method public getFiexdHeight()I
    .locals 1

    .line 47
    iget v0, p0, Lo/byr;->b:I

    return v0
.end method

.method public setAnimUpdateListener(Lo/byr$c;)V
    .locals 0

    .line 140
    iput-object p1, p0, Lo/byr;->a:Lo/byr$c;

    .line 141
    return-void
.end method

.method public setFiexdHeight(I)V
    .locals 0

    .line 43
    iput p1, p0, Lo/byr;->b:I

    .line 44
    return-void
.end method

.method public setView(Landroid/view/View;)V
    .locals 1

    .line 30
    iput-object p1, p0, Lo/byr;->c:Landroid/view/View;

    .line 31
    iget-object v0, p0, Lo/byr;->c:Landroid/view/View;

    invoke-virtual {p0, v0}, Lo/byr;->addView(Landroid/view/View;)V

    .line 32
    return-void
.end method
