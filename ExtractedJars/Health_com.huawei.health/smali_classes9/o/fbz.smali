.class public Lo/fbz;
.super Landroid/support/v4/view/ViewPager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fbz$a;
    }
.end annotation


# instance fields
.field a:F

.field b:F

.field private c:Z

.field d:F

.field e:F

.field private h:Lo/fbz$a;

.field private i:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 24
    invoke-direct {p0, p1}, Landroid/support/v4/view/ViewPager;-><init>(Landroid/content/Context;)V

    .line 16
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fbz;->c:Z

    .line 18
    const/4 v0, 0x0

    iput v0, p0, Lo/fbz;->d:F

    .line 19
    const/4 v0, 0x0

    iput v0, p0, Lo/fbz;->e:F

    .line 20
    const/4 v0, 0x0

    iput v0, p0, Lo/fbz;->a:F

    .line 21
    const/4 v0, 0x0

    iput v0, p0, Lo/fbz;->b:F

    .line 25
    iput-object p1, p0, Lo/fbz;->i:Landroid/content/Context;

    .line 26
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 29
    invoke-direct {p0, p1, p2}, Landroid/support/v4/view/ViewPager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 16
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fbz;->c:Z

    .line 18
    const/4 v0, 0x0

    iput v0, p0, Lo/fbz;->d:F

    .line 19
    const/4 v0, 0x0

    iput v0, p0, Lo/fbz;->e:F

    .line 20
    const/4 v0, 0x0

    iput v0, p0, Lo/fbz;->a:F

    .line 21
    const/4 v0, 0x0

    iput v0, p0, Lo/fbz;->b:F

    .line 30
    iput-object p1, p0, Lo/fbz;->i:Landroid/content/Context;

    .line 31
    return-void
.end method


# virtual methods
.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 82
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 84
    :pswitch_0
    invoke-virtual {p0}, Lo/fbz;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 85
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lo/fbz;->d:F

    .line 86
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lo/fbz;->e:F

    .line 87
    iget-object v0, p0, Lo/fbz;->h:Lo/fbz$a;

    if-eqz v0, :cond_2

    .line 88
    iget-object v0, p0, Lo/fbz;->h:Lo/fbz$a;

    invoke-interface {v0, p1}, Lo/fbz$a;->a(Landroid/view/MotionEvent;)V

    goto/16 :goto_0

    .line 92
    :pswitch_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lo/fbz;->a:F

    .line 93
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lo/fbz;->b:F

    .line 94
    iget v0, p0, Lo/fbz;->a:F

    iget v1, p0, Lo/fbz;->e:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v1, p0, Lo/fbz;->b:F

    iget v2, p0, Lo/fbz;->d:F

    sub-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    iget v0, p0, Lo/fbz;->b:F

    iget-object v1, p0, Lo/fbz;->i:Landroid/content/Context;

    const/high16 v2, 0x43340000    # 180.0f

    invoke-static {v1, v2}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v1

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    .line 95
    invoke-virtual {p0}, Lo/fbz;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    goto :goto_0

    .line 96
    :cond_0
    iget v0, p0, Lo/fbz;->b:F

    iget-object v1, p0, Lo/fbz;->i:Landroid/content/Context;

    const/high16 v2, 0x43340000    # 180.0f

    invoke-static {v1, v2}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v1

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 97
    invoke-virtual {p0}, Lo/fbz;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    goto :goto_0

    .line 100
    :cond_1
    invoke-virtual {p0}, Lo/fbz;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 102
    goto :goto_0

    .line 104
    :pswitch_2
    iget-object v0, p0, Lo/fbz;->h:Lo/fbz$a;

    if-eqz v0, :cond_2

    .line 105
    iget-object v0, p0, Lo/fbz;->h:Lo/fbz$a;

    invoke-interface {v0, p1}, Lo/fbz$a;->c(Landroid/view/MotionEvent;)V

    .line 111
    :cond_2
    :goto_0
    invoke-super {p0, p1}, Landroid/support/v4/view/ViewPager;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 73
    iget-boolean v0, p0, Lo/fbz;->c:Z

    if-eqz v0, :cond_0

    .line 74
    invoke-super {p0, p1}, Landroid/support/v4/view/ViewPager;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    .line 76
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    .line 47
    iget-boolean v0, p0, Lo/fbz;->c:Z

    if-eqz v0, :cond_0

    .line 48
    const/4 v4, 0x0

    .line 50
    :try_start_0
    invoke-super {p0, p1}, Landroid/support/v4/view/ViewPager;->onTouchEvent(Landroid/view/MotionEvent;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v4, v0

    .line 53
    goto :goto_0

    .line 51
    :catch_0
    move-exception v5

    .line 52
    const-string v0, "PressureDiagramViewPager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    :goto_0
    return v4

    .line 56
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public scrollTo(II)V
    .locals 0

    .line 40
    invoke-super {p0, p1, p2}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V

    .line 42
    return-void
.end method

.method public setCurrentItem(I)V
    .locals 0

    .line 68
    invoke-super {p0, p1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 69
    return-void
.end method

.method public setCurrentItem(IZ)V
    .locals 0

    .line 63
    invoke-super {p0, p1, p2}, Landroid/support/v4/view/ViewPager;->setCurrentItem(IZ)V

    .line 64
    return-void
.end method

.method public setOnViewPagerTouchEventListener(Lo/fbz$a;)V
    .locals 0

    .line 118
    iput-object p1, p0, Lo/fbz;->h:Lo/fbz$a;

    .line 119
    return-void
.end method

.method public setScanScroll(Z)V
    .locals 0

    .line 34
    iput-boolean p1, p0, Lo/fbz;->c:Z

    .line 36
    return-void
.end method
