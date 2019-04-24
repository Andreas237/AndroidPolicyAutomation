.class public Lo/ffb;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ffb$a;
    }
.end annotation


# static fields
.field private static e:Lo/ffb$a;


# instance fields
.field private a:F

.field private c:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 22
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 19
    const/4 v0, 0x0

    iput v0, p0, Lo/ffb;->a:F

    .line 20
    const/4 v0, 0x0

    iput v0, p0, Lo/ffb;->c:F

    .line 23
    invoke-direct {p0}, Lo/ffb;->d()V

    .line 24
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 27
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 19
    const/4 v0, 0x0

    iput v0, p0, Lo/ffb;->a:F

    .line 20
    const/4 v0, 0x0

    iput v0, p0, Lo/ffb;->c:F

    .line 28
    invoke-direct {p0}, Lo/ffb;->d()V

    .line 29
    return-void
.end method

.method public static b()V
    .locals 2

    .line 94
    sget-object v0, Lo/ffb;->e:Lo/ffb$a;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 95
    const/4 v0, 0x0

    sput-object v0, Lo/ffb;->e:Lo/ffb$a;

    .line 97
    :cond_0
    return-void
.end method

.method private d()V
    .locals 0

    .line 33
    return-void
.end method

.method public static setUserSlidWeightDayViewListener(Lo/ffb$a;)V
    .locals 1

    .line 88
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 89
    sput-object p0, Lo/ffb;->e:Lo/ffb$a;

    .line 91
    :cond_0
    return-void
.end method


# virtual methods
.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 73
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    .line 74
    if-eqz v2, :cond_0

    const/4 v0, 0x2

    if-ne v2, v0, :cond_1

    .line 75
    :cond_0
    invoke-virtual {p0}, Lo/ffb;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    goto :goto_0

    .line 76
    :cond_1
    const/4 v0, 0x1

    if-ne v2, v0, :cond_2

    .line 77
    invoke-virtual {p0}, Lo/ffb;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 79
    :cond_2
    :goto_0
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    .line 37
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v4

    .line 38
    sparse-switch v4, :sswitch_data_0

    goto/16 :goto_0

    .line 40
    :sswitch_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lo/ffb;->a:F

    .line 41
    goto/16 :goto_0

    .line 43
    :sswitch_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lo/ffb;->c:F

    .line 44
    iget v0, p0, Lo/ffb;->c:F

    iget v1, p0, Lo/ffb;->a:F

    sub-float v5, v0, v1

    .line 46
    const/high16 v0, 0x42c80000    # 100.0f

    cmpl-float v0, v5, v0

    if-lez v0, :cond_1

    .line 47
    const-string v0, "WeightDetailView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "RIGHT_SLID"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    sget-object v0, Lo/ffb;->e:Lo/ffb$a;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 49
    sget-object v0, Lo/ffb;->e:Lo/ffb$a;

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Lo/ffb$a;->a(I)V

    goto :goto_0

    .line 51
    :cond_0
    const-string v0, "WeightDetailView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "userSlidWeightDayViewListener is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 53
    :cond_1
    const/high16 v0, -0x3d380000    # -100.0f

    cmpg-float v0, v5, v0

    if-gez v0, :cond_3

    .line 54
    const-string v0, "WeightDetailView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "LEFT_SLID"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    sget-object v0, Lo/ffb;->e:Lo/ffb$a;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 56
    sget-object v0, Lo/ffb;->e:Lo/ffb$a;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lo/ffb$a;->a(I)V

    goto :goto_0

    .line 58
    :cond_2
    const-string v0, "WeightDetailView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "userSlidWeightDayViewListener is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    :cond_3
    :goto_0
    const/4 v0, 0x1

    return v0

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method
