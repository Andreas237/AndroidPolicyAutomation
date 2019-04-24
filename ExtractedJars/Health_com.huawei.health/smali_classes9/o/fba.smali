.class public Lo/fba;
.super Landroid/support/v4/view/ViewPager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fba$b;
    }
.end annotation


# instance fields
.field protected b:Lo/fbe;

.field private c:Lo/fba$b;

.field private e:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 18
    invoke-direct {p0, p1}, Landroid/support/v4/view/ViewPager;-><init>(Landroid/content/Context;)V

    .line 27
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fba;->e:Z

    .line 30
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fba;->b:Lo/fbe;

    .line 19
    invoke-direct {p0, p1}, Lo/fba;->b(Landroid/content/Context;)V

    .line 20
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 23
    invoke-direct {p0, p1, p2}, Landroid/support/v4/view/ViewPager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 27
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fba;->e:Z

    .line 30
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fba;->b:Lo/fbe;

    .line 24
    invoke-direct {p0, p1}, Lo/fba;->b(Landroid/content/Context;)V

    .line 25
    return-void
.end method

.method private b(Landroid/content/Context;)V
    .locals 2

    .line 33
    new-instance v0, Lo/fbe;

    new-instance v1, Lo/fba$4;

    invoke-direct {v1, p0}, Lo/fba$4;-><init>(Lo/fba;)V

    invoke-direct {v0, p1, v1}, Lo/fbe;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lo/fba;->b:Lo/fbe;

    .line 40
    return-void
.end method

.method static synthetic e(Lo/fba;Z)Z
    .locals 0

    .line 13
    iput-boolean p1, p0, Lo/fba;->e:Z

    return p1
.end method


# virtual methods
.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 50
    iget-object v0, p0, Lo/fba;->b:Lo/fbe;

    invoke-virtual {v0, p1}, Lo/fbe;->d(Landroid/view/MotionEvent;)V

    .line 52
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 55
    :pswitch_0
    const-string v0, "RestHeartRateViewPager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ACTION_MOVE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    iget-boolean v0, p0, Lo/fba;->e:Z

    if-eqz v0, :cond_1

    .line 58
    invoke-super {p0, p1}, Landroid/support/v4/view/ViewPager;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    .line 63
    :pswitch_1
    const-string v0, "RestHeartRateViewPager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ACTION_UP"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    iget-boolean v0, p0, Lo/fba;->e:Z

    if-eqz v0, :cond_0

    .line 65
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fba;->e:Z

    .line 66
    const-string v0, "RestHeartRateViewPager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mBeingLongPressed first action up,do not deal"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    invoke-super {p0, p1}, Landroid/support/v4/view/ViewPager;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    .line 70
    :cond_0
    iget-object v0, p0, Lo/fba;->c:Lo/fba$b;

    if-eqz v0, :cond_1

    .line 71
    iget-object v0, p0, Lo/fba;->c:Lo/fba$b;

    invoke-interface {v0, p1}, Lo/fba$b;->d(Landroid/view/MotionEvent;)V

    goto :goto_1

    .line 76
    :pswitch_2
    const-string v0, "RestHeartRateViewPager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ACTION_DOWN"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    iget-object v0, p0, Lo/fba;->c:Lo/fba$b;

    if-eqz v0, :cond_1

    .line 78
    iget-object v0, p0, Lo/fba;->c:Lo/fba$b;

    invoke-interface {v0, p1}, Lo/fba$b;->a(Landroid/view/MotionEvent;)V

    goto :goto_1

    .line 83
    :goto_0
    const-string v0, "RestHeartRateViewPager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "other"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fba;->e:Z

    .line 89
    :cond_1
    :goto_1
    invoke-super {p0, p1}, Landroid/support/v4/view/ViewPager;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 94
    const/4 v0, 0x0

    return v0
.end method

.method public setOnViewPagerTouchEventListener(Lo/fba$b;)V
    .locals 0

    .line 100
    iput-object p1, p0, Lo/fba;->c:Lo/fba$b;

    .line 101
    return-void
.end method
