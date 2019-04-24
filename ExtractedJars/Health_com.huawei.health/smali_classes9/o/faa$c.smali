.class Lo/faa$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/faa;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field a:Lo/faa$d;

.field b:F

.field c:Lo/faa$d;

.field private e:Landroid/widget/Scroller;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 80
    const/4 v0, 0x0

    iput-object v0, p0, Lo/faa$c;->a:Lo/faa$d;

    .line 81
    const/4 v0, 0x0

    iput-object v0, p0, Lo/faa$c;->c:Lo/faa$d;

    .line 82
    const/4 v0, 0x0

    iput v0, p0, Lo/faa$c;->b:F

    .line 86
    new-instance v0, Landroid/widget/Scroller;

    invoke-static {}, Lo/faa;->f()Landroid/view/animation/Interpolator;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    iput-object v0, p0, Lo/faa$c;->e:Landroid/widget/Scroller;

    .line 87
    return-void
.end method


# virtual methods
.method public b(Landroid/graphics/Canvas;)V
    .locals 3

    .line 114
    iget-object v0, p0, Lo/faa$c;->a:Lo/faa$d;

    if-eqz v0, :cond_0

    .line 115
    iget-object v0, p0, Lo/faa$c;->a:Lo/faa$d;

    iget v1, p0, Lo/faa$c;->b:F

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float v1, v2, v1

    invoke-virtual {v0, p1, v1}, Lo/faa$d;->b(Landroid/graphics/Canvas;F)V

    .line 118
    :cond_0
    iget-object v0, p0, Lo/faa$c;->c:Lo/faa$d;

    if-eqz v0, :cond_1

    .line 119
    iget-object v0, p0, Lo/faa$c;->c:Lo/faa$d;

    iget v1, p0, Lo/faa$c;->b:F

    invoke-virtual {v0, p1, v1}, Lo/faa$d;->b(Landroid/graphics/Canvas;F)V

    .line 121
    :cond_1
    return-void
.end method

.method public b()Z
    .locals 2

    .line 124
    iget v0, p0, Lo/faa$c;->b:F

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_0

    .line 126
    const/4 v0, 0x1

    return v0

    .line 128
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public c()V
    .locals 2

    .line 139
    const/4 v0, 0x0

    iput-object v0, p0, Lo/faa$c;->a:Lo/faa$d;

    .line 140
    const/4 v0, 0x0

    iput-object v0, p0, Lo/faa$c;->c:Lo/faa$d;

    .line 141
    const/4 v0, 0x0

    iput v0, p0, Lo/faa$c;->b:F

    .line 142
    iget-object v0, p0, Lo/faa$c;->e:Landroid/widget/Scroller;

    if-eqz v0, :cond_0

    .line 143
    iget-object v0, p0, Lo/faa$c;->e:Landroid/widget/Scroller;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Scroller;->forceFinished(Z)V

    .line 145
    :cond_0
    return-void
.end method

.method public d()V
    .locals 2

    .line 105
    iget-object v0, p0, Lo/faa$c;->e:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->computeScrollOffset()Z

    .line 106
    iget-object v0, p0, Lo/faa$c;->e:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z

    move-result v0

    if-nez v0, :cond_0

    .line 107
    iget-object v0, p0, Lo/faa$c;->e:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->getCurrX()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    iput v0, p0, Lo/faa$c;->b:F

    goto :goto_0

    .line 109
    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lo/faa$c;->b:F

    .line 111
    :goto_0
    return-void
.end method

.method d(Lo/faa$d;Lo/faa$d;)V
    .locals 5

    .line 90
    iput-object p1, p0, Lo/faa$c;->a:Lo/faa$d;

    .line 91
    iput-object p2, p0, Lo/faa$c;->c:Lo/faa$d;

    .line 92
    if-nez p1, :cond_0

    .line 94
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lo/faa$c;->b:F

    .line 95
    iget-object v0, p0, Lo/faa$c;->e:Landroid/widget/Scroller;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/16 v3, 0x3e8

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/Scroller;->startScroll(IIII)V

    .line 96
    iget-object v0, p0, Lo/faa$c;->e:Landroid/widget/Scroller;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Scroller;->forceFinished(Z)V

    goto :goto_0

    .line 99
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lo/faa$c;->b:F

    .line 100
    iget-object v0, p0, Lo/faa$c;->e:Landroid/widget/Scroller;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/16 v3, 0x3e8

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/Scroller;->startScroll(IIII)V

    .line 102
    :goto_0
    return-void
.end method

.method public e(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 132
    iget-object v0, p0, Lo/faa$c;->c:Lo/faa$d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/faa$c;->c:Lo/faa$d;

    iget-object v0, v0, Lo/faa$d;->a:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 133
    iget-object v0, p0, Lo/faa$c;->c:Lo/faa$d;

    iget-object v0, v0, Lo/faa$d;->a:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    .line 135
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
