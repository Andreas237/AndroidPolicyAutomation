.class Lo/ekw$3;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ekw;->D()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/ekw;


# direct methods
.method constructor <init>(Lo/ekw;)V
    .locals 0

    .line 130
    iput-object p1, p0, Lo/ekw$3;->b:Lo/ekw;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onDoubleTap(Landroid/view/MotionEvent;)Z
    .locals 6

    .line 133
    iget-object v0, p0, Lo/ekw$3;->b:Lo/ekw;

    invoke-static {v0}, Lo/ekw;->d(Lo/ekw;)Lo/ekw$d;

    move-result-object v0

    if-nez v0, :cond_0

    .line 134
    const/4 v0, 0x0

    return v0

    .line 136
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    .line 137
    iget-object v0, p0, Lo/ekw$3;->b:Lo/ekw;

    invoke-static {v0}, Lo/ekw;->a(Lo/ekw;)J

    move-result-wide v0

    sub-long v0, v4, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    invoke-static {}, Lo/ekw;->b()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    .line 138
    const/4 v0, 0x0

    return v0

    .line 140
    :cond_1
    iget-object v0, p0, Lo/ekw$3;->b:Lo/ekw;

    invoke-static {v0, v4, v5}, Lo/ekw;->d(Lo/ekw;J)J

    .line 141
    iget-object v0, p0, Lo/ekw$3;->b:Lo/ekw;

    invoke-static {v0}, Lo/ekw;->d(Lo/ekw;)Lo/ekw$d;

    move-result-object v0

    invoke-interface {v0, p1}, Lo/ekw$d;->d(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public onSingleTapConfirmed(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 147
    iget-object v0, p0, Lo/ekw$3;->b:Lo/ekw;

    invoke-static {v0}, Lo/ekw;->e(Lo/ekw;)Lo/ekw$f;

    move-result-object v0

    if-nez v0, :cond_0

    .line 148
    const/4 v0, 0x0

    return v0

    .line 150
    :cond_0
    iget-object v0, p0, Lo/ekw$3;->b:Lo/ekw;

    invoke-static {v0}, Lo/ekw;->e(Lo/ekw;)Lo/ekw$f;

    move-result-object v0

    invoke-interface {v0, p1}, Lo/ekw$f;->e(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method
