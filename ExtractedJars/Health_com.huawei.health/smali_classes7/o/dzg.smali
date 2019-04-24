.class public Lo/dzg;
.super Landroid/support/v4/view/ViewPager;
.source "SourceFile"


# instance fields
.field private e:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 16
    invoke-direct {p0, p1}, Landroid/support/v4/view/ViewPager;-><init>(Landroid/content/Context;)V

    .line 17
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dzg;->e:Z

    .line 18
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 21
    invoke-direct {p0, p1, p2}, Landroid/support/v4/view/ViewPager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 22
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dzg;->e:Z

    .line 23
    return-void
.end method


# virtual methods
.method public b()V
    .locals 1

    .line 30
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dzg;->e:Z

    .line 31
    return-void
.end method

.method public d()V
    .locals 1

    .line 26
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dzg;->e:Z

    .line 27
    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 43
    iget-boolean v0, p0, Lo/dzg;->e:Z

    if-nez v0, :cond_0

    .line 44
    const/4 v0, 0x0

    return v0

    .line 46
    :cond_0
    invoke-super {p0, p1}, Landroid/support/v4/view/ViewPager;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 35
    iget-boolean v0, p0, Lo/dzg;->e:Z

    if-nez v0, :cond_0

    .line 36
    const/4 v0, 0x0

    return v0

    .line 38
    :cond_0
    invoke-super {p0, p1}, Landroid/support/v4/view/ViewPager;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method
