.class public Lo/bwm;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:Landroid/support/v4/widget/ViewDragHelper;

.field private c:Landroid/graphics/Point;

.field private d:Lo/bwf;

.field private e:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 30
    invoke-direct {p0, p1}, Lo/bwm;->b(Landroid/content/Context;)V

    .line 31
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 35
    invoke-direct {p0, p1}, Lo/bwm;->b(Landroid/content/Context;)V

    .line 36
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 39
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 40
    invoke-direct {p0, p1}, Lo/bwm;->b(Landroid/content/Context;)V

    .line 41
    return-void
.end method

.method static synthetic a(Lo/bwm;)Lo/bwf;
    .locals 1

    .line 21
    iget-object v0, p0, Lo/bwm;->d:Lo/bwf;

    return-object v0
.end method

.method static synthetic b(Lo/bwm;)Landroid/view/View;
    .locals 1

    .line 21
    iget-object v0, p0, Lo/bwm;->e:Landroid/view/View;

    return-object v0
.end method

.method private b(Landroid/content/Context;)V
    .locals 0

    .line 44
    return-void
.end method

.method static synthetic c(Lo/bwm;)I
    .locals 1

    .line 21
    iget v0, p0, Lo/bwm;->a:I

    return v0
.end method

.method static synthetic d(Lo/bwm;)Landroid/graphics/Point;
    .locals 1

    .line 21
    iget-object v0, p0, Lo/bwm;->c:Landroid/graphics/Point;

    return-object v0
.end method

.method static synthetic e(Lo/bwm;)Landroid/support/v4/widget/ViewDragHelper;
    .locals 1

    .line 21
    iget-object v0, p0, Lo/bwm;->b:Landroid/support/v4/widget/ViewDragHelper;

    return-object v0
.end method


# virtual methods
.method public computeScroll()V
    .locals 2

    .line 127
    iget-object v0, p0, Lo/bwm;->b:Landroid/support/v4/widget/ViewDragHelper;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/ViewDragHelper;->continueSettling(Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 129
    invoke-virtual {p0}, Lo/bwm;->postInvalidate()V

    .line 130
    iget-object v0, p0, Lo/bwm;->d:Lo/bwf;

    if-eqz v0, :cond_1

    .line 131
    iget-object v0, p0, Lo/bwm;->d:Lo/bwf;

    iget-object v1, p0, Lo/bwm;->e:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v1

    int-to-float v1, v1

    invoke-interface {v0, v1}, Lo/bwf;->a(F)V

    .line 132
    iget-object v0, p0, Lo/bwm;->e:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    iget v1, p0, Lo/bwm;->a:I

    if-ne v0, v1, :cond_0

    .line 133
    iget-object v0, p0, Lo/bwm;->d:Lo/bwf;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lo/bwf;->c(Z)V

    goto :goto_0

    .line 134
    :cond_0
    iget-object v0, p0, Lo/bwm;->e:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    if-nez v0, :cond_1

    .line 135
    iget-object v0, p0, Lo/bwm;->d:Lo/bwf;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/bwf;->c(Z)V

    .line 139
    :cond_1
    :goto_0
    return-void
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 111
    invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method protected onFinishInflate()V
    .locals 1

    .line 48
    invoke-super {p0}, Landroid/widget/RelativeLayout;->onFinishInflate()V

    .line 49
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/bwm;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/bwm;->e:Landroid/view/View;

    .line 50
    new-instance v0, Lo/bwm$5;

    invoke-direct {v0, p0}, Lo/bwm$5;-><init>(Lo/bwm;)V

    invoke-static {p0, v0}, Landroid/support/v4/widget/ViewDragHelper;->create(Landroid/view/ViewGroup;Landroid/support/v4/widget/ViewDragHelper$Callback;)Landroid/support/v4/widget/ViewDragHelper;

    move-result-object v0

    iput-object v0, p0, Lo/bwm;->b:Landroid/support/v4/widget/ViewDragHelper;

    .line 83
    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    .line 101
    :try_start_0
    iget-object v0, p0, Lo/bwm;->b:Landroid/support/v4/widget/ViewDragHelper;

    invoke-virtual {v0, p1}, Landroid/support/v4/widget/ViewDragHelper;->shouldInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v4

    .line 102
    return v4

    .line 103
    :catch_0
    move-exception v5

    .line 104
    const-string v0, "SlideDownLayout"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    const/4 v0, 0x0

    return v0
.end method

.method protected onLayout(ZIIII)V
    .locals 3

    .line 93
    invoke-super/range {p0 .. p5}, Landroid/widget/RelativeLayout;->onLayout(ZIIII)V

    .line 94
    new-instance v0, Landroid/graphics/Point;

    iget-object v1, p0, Lo/bwm;->e:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v1

    iget-object v2, p0, Lo/bwm;->e:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/graphics/Point;-><init>(II)V

    iput-object v0, p0, Lo/bwm;->c:Landroid/graphics/Point;

    .line 95
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .line 87
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/RelativeLayout;->onSizeChanged(IIII)V

    .line 88
    iput p2, p0, Lo/bwm;->a:I

    .line 89
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 117
    :try_start_0
    iget-object v0, p0, Lo/bwm;->b:Landroid/support/v4/widget/ViewDragHelper;

    invoke-virtual {v0, p1}, Landroid/support/v4/widget/ViewDragHelper;->processTouchEvent(Landroid/view/MotionEvent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 121
    goto :goto_0

    .line 118
    :catch_0
    move-exception v4

    .line 119
    const-string v0, "SlideDownLayout"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    const/4 v0, 0x0

    return v0

    .line 122
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public setOnSlidingListener(Lo/bwf;)V
    .locals 0

    .line 142
    iput-object p1, p0, Lo/bwm;->d:Lo/bwf;

    .line 143
    return-void
.end method
