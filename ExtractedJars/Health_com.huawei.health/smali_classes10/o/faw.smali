.class public Lo/faw;
.super Landroid/widget/ScrollView;
.source "SourceFile"


# instance fields
.field protected b:Lo/fbe;

.field private d:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 14
    invoke-direct {p0, p1}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 33
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/faw;->d:Z

    .line 36
    const/4 v0, 0x0

    iput-object v0, p0, Lo/faw;->b:Lo/fbe;

    .line 15
    invoke-direct {p0, p1}, Lo/faw;->d(Landroid/content/Context;)V

    .line 16
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 19
    invoke-direct {p0, p1, p2}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 33
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/faw;->d:Z

    .line 36
    const/4 v0, 0x0

    iput-object v0, p0, Lo/faw;->b:Lo/fbe;

    .line 20
    invoke-direct {p0, p1}, Lo/faw;->d(Landroid/content/Context;)V

    .line 21
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 24
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 33
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/faw;->d:Z

    .line 36
    const/4 v0, 0x0

    iput-object v0, p0, Lo/faw;->b:Lo/fbe;

    .line 25
    invoke-direct {p0, p1}, Lo/faw;->d(Landroid/content/Context;)V

    .line 26
    return-void
.end method

.method private d(Landroid/content/Context;)V
    .locals 2

    .line 39
    new-instance v0, Lo/fbe;

    new-instance v1, Lo/faw$3;

    invoke-direct {v1, p0}, Lo/faw$3;-><init>(Lo/faw;)V

    invoke-direct {v0, p1, v1}, Lo/fbe;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lo/faw;->b:Lo/fbe;

    .line 45
    return-void
.end method

.method static synthetic d(Lo/faw;Z)Z
    .locals 0

    .line 11
    iput-boolean p1, p0, Lo/faw;->d:Z

    return p1
.end method


# virtual methods
.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 50
    iget-object v0, p0, Lo/faw;->b:Lo/fbe;

    invoke-virtual {v0, p1}, Lo/fbe;->d(Landroid/view/MotionEvent;)V

    .line 52
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 55
    :sswitch_0
    iget-boolean v0, p0, Lo/faw;->d:Z

    if-eqz v0, :cond_0

    .line 57
    const/4 v0, 0x0

    return v0

    .line 62
    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/faw;->d:Z

    .line 66
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/ScrollView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
    .end sparse-switch
.end method
