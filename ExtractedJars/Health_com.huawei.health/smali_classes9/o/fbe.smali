.class public Lo/fbe;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fbe$c;
    }
.end annotation


# instance fields
.field private final a:Landroid/os/Handler;

.field private final b:Landroid/view/GestureDetector$OnGestureListener;

.field private c:Z

.field private d:I

.field private e:Z

.field private h:Landroid/view/MotionEvent;

.field private i:F

.field private k:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V
    .locals 1

    .line 59
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lo/fbe;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;Landroid/os/Handler;)V

    .line 60
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;Landroid/os/Handler;)V
    .locals 3

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    if-eqz p3, :cond_0

    .line 64
    new-instance v0, Lo/fbe$c;

    invoke-direct {v0, p0, p3}, Lo/fbe$c;-><init>(Lo/fbe;Landroid/os/Handler;)V

    iput-object v0, p0, Lo/fbe;->a:Landroid/os/Handler;

    goto :goto_0

    .line 66
    :cond_0
    new-instance v0, Lo/fbe$c;

    invoke-direct {v0, p0}, Lo/fbe$c;-><init>(Lo/fbe;)V

    iput-object v0, p0, Lo/fbe;->a:Landroid/os/Handler;

    .line 68
    :goto_0
    iput-object p2, p0, Lo/fbe;->b:Landroid/view/GestureDetector$OnGestureListener;

    .line 69
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v1

    .line 70
    invoke-virtual {v1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v2

    .line 71
    mul-int v0, v2, v2

    iput v0, p0, Lo/fbe;->d:I

    .line 72
    return-void
.end method

.method private a()V
    .locals 2

    .line 152
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fbe;->c:Z

    .line 153
    iget-object v0, p0, Lo/fbe;->b:Landroid/view/GestureDetector$OnGestureListener;

    iget-object v1, p0, Lo/fbe;->h:Landroid/view/MotionEvent;

    invoke-interface {v0, v1}, Landroid/view/GestureDetector$OnGestureListener;->onLongPress(Landroid/view/MotionEvent;)V

    .line 154
    return-void
.end method

.method static synthetic e(Lo/fbe;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Lo/fbe;->a()V

    return-void
.end method


# virtual methods
.method public d(Landroid/view/MotionEvent;)V
    .locals 13

    .line 76
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v5

    .line 78
    and-int/lit16 v0, v5, 0xff

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    const/4 v6, 0x1

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    .line 82
    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v7

    .line 83
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v8

    .line 85
    and-int/lit16 v0, v5, 0xff

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    .line 88
    :pswitch_0
    iput v7, p0, Lo/fbe;->i:F

    .line 89
    iput v8, p0, Lo/fbe;->k:F

    .line 90
    iget-object v0, p0, Lo/fbe;->h:Landroid/view/MotionEvent;

    if-eqz v0, :cond_1

    .line 91
    iget-object v0, p0, Lo/fbe;->h:Landroid/view/MotionEvent;

    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 93
    :cond_1
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v0

    iput-object v0, p0, Lo/fbe;->h:Landroid/view/MotionEvent;

    .line 94
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fbe;->e:Z

    .line 95
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fbe;->c:Z

    .line 97
    const-string v0, "CustomGestureDetector"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "LONGPRESS_TIMEOUT:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/16 v2, 0x32

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    iget-object v0, p0, Lo/fbe;->a:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 100
    iget-object v0, p0, Lo/fbe;->a:Landroid/os/Handler;

    iget-object v1, p0, Lo/fbe;->h:Landroid/view/MotionEvent;

    .line 101
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getDownTime()J

    move-result-wide v1

    const-wide/16 v3, 0x32

    add-long/2addr v1, v3

    .line 100
    const/4 v3, 0x2

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->sendEmptyMessageAtTime(IJ)Z

    .line 103
    goto/16 :goto_1

    .line 106
    :pswitch_1
    iget-boolean v0, p0, Lo/fbe;->c:Z

    if-eqz v0, :cond_2

    .line 107
    goto/16 :goto_1

    .line 109
    :cond_2
    iget-boolean v0, p0, Lo/fbe;->e:Z

    if-eqz v0, :cond_5

    .line 110
    iget v0, p0, Lo/fbe;->i:F

    sub-float v0, v7, v0

    float-to-int v9, v0

    .line 111
    iget v0, p0, Lo/fbe;->k:F

    sub-float v0, v8, v0

    float-to-int v10, v0

    .line 112
    mul-int v0, v9, v9

    mul-int v1, v10, v10

    add-int v11, v0, v1

    .line 113
    iget v12, p0, Lo/fbe;->d:I

    .line 114
    if-le v11, v12, :cond_3

    .line 115
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fbe;->e:Z

    .line 116
    iget-object v0, p0, Lo/fbe;->a:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 118
    :cond_3
    goto :goto_1

    .line 123
    :pswitch_2
    iget-boolean v0, p0, Lo/fbe;->e:Z

    if-eqz v0, :cond_4

    .line 124
    iget-object v0, p0, Lo/fbe;->b:Landroid/view/GestureDetector$OnGestureListener;

    invoke-interface {v0, p1}, Landroid/view/GestureDetector$OnGestureListener;->onSingleTapUp(Landroid/view/MotionEvent;)Z

    .line 127
    :cond_4
    iget-object v0, p0, Lo/fbe;->a:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 128
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fbe;->e:Z

    .line 129
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fbe;->c:Z

    .line 130
    goto :goto_1

    .line 133
    :pswitch_3
    iget-object v0, p0, Lo/fbe;->a:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 134
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fbe;->e:Z

    .line 135
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fbe;->c:Z

    .line 136
    goto :goto_1

    .line 139
    :pswitch_4
    iget-object v0, p0, Lo/fbe;->a:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 140
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fbe;->e:Z

    .line 141
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fbe;->c:Z

    .line 142
    .line 147
    :cond_5
    :goto_1
    :pswitch_5
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_4
        :pswitch_5
        :pswitch_3
    .end packed-switch
.end method
