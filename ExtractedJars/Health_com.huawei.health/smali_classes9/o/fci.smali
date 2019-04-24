.class public Lo/fci;
.super Landroid/support/v4/view/ViewPager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fci$c;
    }
.end annotation


# instance fields
.field private b:Lo/fci$c;

.field private d:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 20
    invoke-direct {p0, p1}, Landroid/support/v4/view/ViewPager;-><init>(Landroid/content/Context;)V

    .line 13
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fci;->d:Z

    .line 21
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 29
    invoke-direct {p0, p1, p2}, Landroid/support/v4/view/ViewPager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 13
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fci;->d:Z

    .line 30
    return-void
.end method


# virtual methods
.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 92
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 94
    :sswitch_0
    iget-object v0, p0, Lo/fci;->b:Lo/fci$c;

    if-eqz v0, :cond_0

    .line 95
    iget-object v0, p0, Lo/fci;->b:Lo/fci$c;

    invoke-interface {v0, p1}, Lo/fci$c;->c(Landroid/view/MotionEvent;)V

    .line 96
    goto :goto_0

    .line 99
    :cond_0
    :sswitch_1
    iget-object v0, p0, Lo/fci;->b:Lo/fci$c;

    if-eqz v0, :cond_1

    .line 100
    iget-object v0, p0, Lo/fci;->b:Lo/fci$c;

    invoke-interface {v0, p1}, Lo/fci$c;->b(Landroid/view/MotionEvent;)V

    .line 106
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

    .line 78
    iget-boolean v0, p0, Lo/fci;->d:Z

    if-eqz v0, :cond_0

    .line 79
    invoke-super {p0, p1}, Landroid/support/v4/view/ViewPager;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    .line 81
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 54
    iget-boolean v0, p0, Lo/fci;->d:Z

    if-eqz v0, :cond_0

    .line 55
    invoke-super {p0, p1}, Landroid/support/v4/view/ViewPager;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    .line 57
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public scrollTo(II)V
    .locals 0

    .line 42
    invoke-super {p0, p1, p2}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V

    .line 43
    return-void
.end method

.method public setCurrentItem(I)V
    .locals 0

    .line 73
    invoke-super {p0, p1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 74
    return-void
.end method

.method public setCurrentItem(IZ)V
    .locals 0

    .line 68
    invoke-super {p0, p1, p2}, Landroid/support/v4/view/ViewPager;->setCurrentItem(IZ)V

    .line 69
    return-void
.end method

.method public setOnViewPagerTouchEventListener(Lo/fci$c;)V
    .locals 0

    .line 117
    iput-object p1, p0, Lo/fci;->b:Lo/fci$c;

    .line 118
    return-void
.end method

.method public setScanScroll(Z)V
    .locals 0

    .line 37
    iput-boolean p1, p0, Lo/fci;->d:Z

    .line 38
    return-void
.end method
