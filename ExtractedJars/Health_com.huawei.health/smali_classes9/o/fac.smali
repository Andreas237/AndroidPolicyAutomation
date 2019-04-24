.class public Lo/fac;
.super Landroid/support/v4/view/ViewPager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fac$c;
    }
.end annotation


# instance fields
.field private b:Z

.field private d:Lo/fac$c;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 22
    invoke-direct {p0, p1}, Landroid/support/v4/view/ViewPager;-><init>(Landroid/content/Context;)V

    .line 19
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fac;->b:Z

    .line 23
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 26
    invoke-direct {p0, p1, p2}, Landroid/support/v4/view/ViewPager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 19
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fac;->b:Z

    .line 27
    return-void
.end method


# virtual methods
.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 76
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 78
    :sswitch_0
    iget-object v0, p0, Lo/fac;->d:Lo/fac$c;

    if-eqz v0, :cond_0

    .line 79
    iget-object v0, p0, Lo/fac;->d:Lo/fac$c;

    invoke-interface {v0, p1}, Lo/fac$c;->c(Landroid/view/MotionEvent;)V

    .line 80
    goto :goto_0

    .line 83
    :cond_0
    :sswitch_1
    iget-object v0, p0, Lo/fac;->d:Lo/fac$c;

    if-eqz v0, :cond_1

    .line 84
    iget-object v0, p0, Lo/fac;->d:Lo/fac$c;

    invoke-interface {v0, p1}, Lo/fac$c;->d(Landroid/view/MotionEvent;)V

    .line 90
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Landroid/support/v4/view/ViewPager;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 67
    iget-boolean v0, p0, Lo/fac;->b:Z

    if-eqz v0, :cond_0

    .line 68
    invoke-super {p0, p1}, Landroid/support/v4/view/ViewPager;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    .line 70
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    .line 41
    iget-boolean v0, p0, Lo/fac;->b:Z

    if-eqz v0, :cond_0

    .line 42
    const/4 v4, 0x0

    .line 44
    :try_start_0
    invoke-super {p0, p1}, Landroid/support/v4/view/ViewPager;->onTouchEvent(Landroid/view/MotionEvent;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v4, v0

    .line 47
    goto :goto_0

    .line 45
    :catch_0
    move-exception v5

    .line 46
    const-string v0, "Lsc_BarChartViewPager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    :goto_0
    return v4

    .line 50
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public scrollTo(II)V
    .locals 0

    .line 35
    invoke-super {p0, p1, p2}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V

    .line 36
    return-void
.end method

.method public setCurrentItem(I)V
    .locals 0

    .line 62
    invoke-super {p0, p1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 63
    return-void
.end method

.method public setCurrentItem(IZ)V
    .locals 0

    .line 57
    invoke-super {p0, p1, p2}, Landroid/support/v4/view/ViewPager;->setCurrentItem(IZ)V

    .line 58
    return-void
.end method

.method public setOnViewPagerTouchEventListener(Lo/fac$c;)V
    .locals 0

    .line 97
    iput-object p1, p0, Lo/fac;->d:Lo/fac$c;

    .line 98
    return-void
.end method

.method public setScanScroll(Z)V
    .locals 0

    .line 30
    iput-boolean p1, p0, Lo/fac;->b:Z

    .line 31
    return-void
.end method
