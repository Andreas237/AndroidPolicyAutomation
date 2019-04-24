.class Lo/ejd$b;
.super Lo/ejd$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ejd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic e:Lo/ejd;


# direct methods
.method private constructor <init>(Lo/ejd;)V
    .locals 1

    .line 198
    iput-object p1, p0, Lo/ejd$b;->e:Lo/ejd;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/ejd$d;-><init>(Lo/ejd;Lo/ejd$4;)V

    return-void
.end method

.method synthetic constructor <init>(Lo/ejd;Lo/ejd$4;)V
    .locals 0

    .line 198
    invoke-direct {p0, p1}, Lo/ejd$b;-><init>(Lo/ejd;)V

    return-void
.end method

.method private b(Landroid/view/MotionEvent;)V
    .locals 3

    .line 235
    iget-object v0, p0, Lo/ejd$b;->e:Lo/ejd;

    invoke-static {v0}, Lo/ejd;->a(Lo/ejd;)Lo/eie;

    move-result-object v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/eie;->e(FZ)V

    .line 236
    iget-object v0, p0, Lo/ejd$b;->e:Lo/ejd;

    invoke-static {v0}, Lo/ejd;->a(Lo/ejd;)Lo/eie;

    move-result-object v0

    invoke-virtual {v0}, Lo/eie;->L()V

    .line 237
    return-void
.end method


# virtual methods
.method public c(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 241
    const/4 v0, 0x1

    return v0
.end method

.method public d(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 228
    invoke-super {p0, p1}, Lo/ejd$d;->d(Landroid/view/MotionEvent;)Z

    .line 229
    iget-object v0, p0, Lo/ejd$b;->e:Lo/ejd;

    invoke-static {v0}, Lo/ejd;->a(Lo/ejd;)Lo/eie;

    move-result-object v0

    check-cast v0, Lo/eih;

    invoke-virtual {v0}, Lo/eih;->an()V

    .line 230
    const/4 v0, 0x0

    return v0
.end method

.method public e(Landroid/view/MotionEvent;)Z
    .locals 6

    .line 202
    invoke-super {p0, p1}, Lo/ejd$d;->e(Landroid/view/MotionEvent;)Z

    .line 204
    invoke-virtual {p0}, Lo/ejd$b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 205
    invoke-direct {p0, p1}, Lo/ejd$b;->b(Landroid/view/MotionEvent;)V

    .line 206
    const/4 v0, 0x1

    return v0

    .line 209
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget-object v1, p0, Lo/ejd$b;->b:Lo/nz;

    invoke-virtual {v1}, Lo/nz;->d()F

    move-result v1

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v4

    .line 210
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iget-object v1, p0, Lo/ejd$b;->b:Lo/nz;

    invoke-virtual {v1}, Lo/nz;->c()F

    move-result v1

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v5

    .line 212
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lo/ejd$b;->a:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0xfa

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    sget v0, Lo/eji;->c:I

    int-to-float v0, v0

    cmpg-float v0, v4, v0

    if-gez v0, :cond_1

    sget v0, Lo/eji;->c:I

    int-to-float v0, v0

    cmpg-float v0, v5, v0

    if-gez v0, :cond_1

    .line 216
    invoke-direct {p0, p1}, Lo/ejd$b;->b(Landroid/view/MotionEvent;)V

    .line 218
    invoke-virtual {p0}, Lo/ejd$b;->c()V

    .line 220
    const/4 v0, 0x1

    return v0

    .line 222
    :cond_1
    const/4 v0, 0x0

    return v0
.end method
