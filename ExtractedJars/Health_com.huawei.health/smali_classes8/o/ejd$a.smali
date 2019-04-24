.class Lo/ejd$a;
.super Lo/ejd$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ejd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic e:Lo/ejd;


# direct methods
.method private constructor <init>(Lo/ejd;)V
    .locals 1

    .line 148
    iput-object p1, p0, Lo/ejd$a;->e:Lo/ejd;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/ejd$d;-><init>(Lo/ejd;Lo/ejd$4;)V

    return-void
.end method

.method synthetic constructor <init>(Lo/ejd;Lo/ejd$4;)V
    .locals 0

    .line 148
    invoke-direct {p0, p1}, Lo/ejd$a;-><init>(Lo/ejd;)V

    return-void
.end method

.method private b(Landroid/view/MotionEvent;)V
    .locals 3

    .line 173
    invoke-direct {p0, p1}, Lo/ejd$a;->i(Landroid/view/MotionEvent;)F

    move-result v2

    .line 174
    iget-object v0, p0, Lo/ejd$a;->e:Lo/ejd;

    invoke-static {v0}, Lo/ejd;->a(Lo/ejd;)Lo/eie;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v2, v1}, Lo/eie;->a(FZ)V

    .line 175
    iget-object v0, p0, Lo/ejd$a;->e:Lo/ejd;

    invoke-static {v0}, Lo/ejd;->a(Lo/ejd;)Lo/eie;

    move-result-object v0

    invoke-virtual {v0}, Lo/eie;->L()V

    .line 176
    return-void
.end method

.method private i(Landroid/view/MotionEvent;)F
    .locals 2

    .line 182
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget-object v1, p0, Lo/ejd$a;->e:Lo/ejd;

    invoke-static {v1}, Lo/ejd;->a(Lo/ejd;)Lo/eie;

    move-result-object v1

    invoke-virtual {v1}, Lo/eie;->getViewPortHandler()Lo/oa;

    move-result-object v1

    invoke-virtual {v1}, Lo/oa;->h()F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 183
    iget-object v0, p0, Lo/ejd$a;->e:Lo/ejd;

    invoke-static {v0}, Lo/ejd;->a(Lo/ejd;)Lo/eie;

    move-result-object v0

    invoke-virtual {v0}, Lo/eie;->getViewPortHandler()Lo/oa;

    move-result-object v0

    invoke-virtual {v0}, Lo/oa;->h()F

    move-result v0

    return v0

    .line 184
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget-object v1, p0, Lo/ejd$a;->e:Lo/ejd;

    invoke-static {v1}, Lo/ejd;->a(Lo/ejd;)Lo/eie;

    move-result-object v1

    invoke-virtual {v1}, Lo/eie;->getViewPortHandler()Lo/oa;

    move-result-object v1

    invoke-virtual {v1}, Lo/oa;->f()F

    move-result v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    .line 185
    iget-object v0, p0, Lo/ejd$a;->e:Lo/ejd;

    invoke-static {v0}, Lo/ejd;->a(Lo/ejd;)Lo/eie;

    move-result-object v0

    invoke-virtual {v0}, Lo/eie;->getViewPortHandler()Lo/oa;

    move-result-object v0

    invoke-virtual {v0}, Lo/oa;->f()F

    move-result v0

    return v0

    .line 187
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    return v0
.end method


# virtual methods
.method public c(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 193
    const/4 v0, 0x0

    return v0
.end method

.method public d(Landroid/view/MotionEvent;)Z
    .locals 8

    .line 152
    invoke-super {p0, p1}, Lo/ejd$d;->d(Landroid/view/MotionEvent;)Z

    .line 154
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget-object v1, p0, Lo/ejd$a;->b:Lo/nz;

    invoke-virtual {v1}, Lo/nz;->d()F

    move-result v1

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v6

    .line 155
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iget-object v1, p0, Lo/ejd$a;->b:Lo/nz;

    invoke-virtual {v1}, Lo/nz;->c()F

    move-result v1

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v7

    .line 157
    const-string v0, "cming"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SystemClock.elapsedRealtime() - _mActionDownClockTime = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-wide v4, p0, Lo/ejd$a;->a:J

    sub-long/2addr v2, v4

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 159
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lo/ejd$a;->a:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0xc8

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    sget v0, Lo/eji;->c:I

    int-to-float v0, v0

    cmpg-float v0, v6, v0

    if-gez v0, :cond_0

    sget v0, Lo/eji;->c:I

    int-to-float v0, v0

    cmpg-float v0, v7, v0

    if-gez v0, :cond_0

    .line 163
    invoke-direct {p0, p1}, Lo/ejd$a;->b(Landroid/view/MotionEvent;)V

    .line 165
    invoke-virtual {p0}, Lo/ejd$a;->c()V

    .line 168
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
