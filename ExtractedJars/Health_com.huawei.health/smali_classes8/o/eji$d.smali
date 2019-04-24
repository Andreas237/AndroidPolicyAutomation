.class Lo/eji$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eji$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eji;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field private a:Z

.field private b:Z

.field private c:Lo/nz;

.field private d:Lo/ejd;

.field final synthetic e:Lo/eji;


# direct methods
.method public constructor <init>(Lo/eji;)V
    .locals 2

    .line 173
    iput-object p1, p0, Lo/eji$d;->e:Lo/eji;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 167
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eji$d;->a:Z

    .line 168
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/nz;->d(FF)Lo/nz;

    move-result-object v0

    iput-object v0, p0, Lo/eji$d;->c:Lo/nz;

    .line 170
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eji$d;->b:Z

    .line 171
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eji$d;->d:Lo/ejd;

    .line 174
    new-instance v0, Lo/ejd;

    invoke-static {p1}, Lo/eji;->a(Lo/eji;)Lo/eie;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/ejd;-><init>(Lo/eie;)V

    iput-object v0, p0, Lo/eji$d;->d:Lo/ejd;

    .line 175
    return-void
.end method

.method private a(Landroid/view/MotionEvent;)Lo/eji$b;
    .locals 1

    .line 265
    iget-object v0, p0, Lo/eji$d;->e:Lo/eji;

    invoke-static {v0}, Lo/eji;->c(Lo/eji;)Lo/eji$b;

    move-result-object v0

    return-object v0
.end method

.method private b(Landroid/view/MotionEvent;)Lo/eji$b;
    .locals 1

    .line 252
    invoke-direct {p0, p1}, Lo/eji$d;->f(Landroid/view/MotionEvent;)Z

    move-result v0

    .line 253
    iput-boolean v0, p0, Lo/eji$d;->a:Z

    .line 254
    invoke-direct {p0, p1}, Lo/eji$d;->d(Landroid/view/MotionEvent;)V

    .line 255
    return-object p0
.end method

.method private d(Landroid/view/MotionEvent;)V
    .locals 2

    .line 259
    iget-object v0, p0, Lo/eji$d;->c:Lo/nz;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    iput v1, v0, Lo/nz;->e:F

    .line 260
    iget-object v0, p0, Lo/eji$d;->c:Lo/nz;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    iput v1, v0, Lo/nz;->c:F

    .line 261
    return-void
.end method

.method private e(Landroid/view/MotionEvent;)Lo/eji$b;
    .locals 4

    .line 228
    iget-boolean v0, p0, Lo/eji$d;->b:Z

    if-nez v0, :cond_0

    .line 229
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget-object v1, p0, Lo/eji$d;->c:Lo/nz;

    invoke-virtual {v1}, Lo/nz;->d()F

    move-result v1

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v2

    .line 230
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iget-object v1, p0, Lo/eji$d;->c:Lo/nz;

    invoke-virtual {v1}, Lo/nz;->c()F

    move-result v1

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v3

    .line 231
    sget v0, Lo/eji;->c:I

    int-to-float v0, v0

    cmpl-float v0, v2, v0

    if-lez v0, :cond_0

    sget v0, Lo/eji;->c:I

    int-to-float v0, v0

    cmpl-float v0, v3, v0

    if-lez v0, :cond_0

    .line 233
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eji$d;->b:Z

    .line 234
    const/high16 v0, 0x40000000    # 2.0f

    mul-float/2addr v0, v3

    cmpg-float v0, v2, v0

    if-gez v0, :cond_0

    .line 236
    iget-object v0, p0, Lo/eji$d;->e:Lo/eji;

    invoke-static {v0}, Lo/eji;->c(Lo/eji;)Lo/eji$b;

    move-result-object v0

    return-object v0

    .line 241
    :cond_0
    iget-boolean v0, p0, Lo/eji$d;->a:Z

    if-nez v0, :cond_1

    .line 242
    return-object p0

    .line 244
    :cond_1
    invoke-direct {p0, p1}, Lo/eji$d;->h(Landroid/view/MotionEvent;)V

    .line 245
    return-object p0
.end method

.method private f(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 276
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget-object v1, p0, Lo/eji$d;->e:Lo/eji;

    invoke-static {v1}, Lo/eji;->a(Lo/eji;)Lo/eie;

    move-result-object v1

    invoke-virtual {v1}, Lo/eie;->N()F

    move-result v1

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v1, 0x42200000    # 40.0f

    invoke-static {v1}, Lo/oc;->b(F)F

    move-result v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 277
    const/4 v0, 0x1

    return v0

    .line 279
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private h(Landroid/view/MotionEvent;)V
    .locals 3

    .line 270
    iget-object v0, p0, Lo/eji$d;->e:Lo/eji;

    invoke-static {v0}, Lo/eji;->a(Lo/eji;)Lo/eie;

    move-result-object v0

    invoke-direct {p0, p1}, Lo/eji$d;->k(Landroid/view/MotionEvent;)F

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/eie;->e(FZ)V

    .line 271
    iget-object v0, p0, Lo/eji$d;->e:Lo/eji;

    invoke-static {v0}, Lo/eji;->a(Lo/eji;)Lo/eie;

    move-result-object v0

    invoke-virtual {v0}, Lo/eie;->L()V

    .line 272
    return-void
.end method

.method private k(Landroid/view/MotionEvent;)F
    .locals 2

    .line 286
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget-object v1, p0, Lo/eji$d;->e:Lo/eji;

    invoke-static {v1}, Lo/eji;->a(Lo/eji;)Lo/eie;

    move-result-object v1

    invoke-virtual {v1}, Lo/eie;->getViewPortHandler()Lo/oa;

    move-result-object v1

    invoke-virtual {v1}, Lo/oa;->h()F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 287
    iget-object v0, p0, Lo/eji$d;->e:Lo/eji;

    invoke-static {v0}, Lo/eji;->a(Lo/eji;)Lo/eie;

    move-result-object v0

    invoke-virtual {v0}, Lo/eie;->getViewPortHandler()Lo/oa;

    move-result-object v0

    invoke-virtual {v0}, Lo/oa;->h()F

    move-result v0

    return v0

    .line 288
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget-object v1, p0, Lo/eji$d;->e:Lo/eji;

    invoke-static {v1}, Lo/eji;->a(Lo/eji;)Lo/eie;

    move-result-object v1

    invoke-virtual {v1}, Lo/eie;->getViewPortHandler()Lo/oa;

    move-result-object v1

    invoke-virtual {v1}, Lo/oa;->f()F

    move-result v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    .line 289
    iget-object v0, p0, Lo/eji$d;->e:Lo/eji;

    invoke-static {v0}, Lo/eji;->a(Lo/eji;)Lo/eie;

    move-result-object v0

    invoke-virtual {v0}, Lo/eie;->getViewPortHandler()Lo/oa;

    move-result-object v0

    invoke-virtual {v0}, Lo/oa;->f()F

    move-result v0

    return v0

    .line 291
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    return v0
.end method


# virtual methods
.method public c(Landroid/view/MotionEvent;)Lo/eji$b;
    .locals 3

    .line 180
    const/4 v2, 0x0

    .line 182
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 184
    :pswitch_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eji$d;->b:Z

    .line 185
    iget-object v0, p0, Lo/eji$d;->d:Lo/ejd;

    invoke-virtual {v0, p1}, Lo/ejd;->e(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 186
    invoke-direct {p0, p1}, Lo/eji$d;->b(Landroid/view/MotionEvent;)Lo/eji$b;

    move-result-object v2

    goto :goto_2

    .line 191
    :pswitch_1
    iget-object v0, p0, Lo/eji$d;->d:Lo/ejd;

    invoke-virtual {v0, p1}, Lo/ejd;->d(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 192
    invoke-direct {p0, p1}, Lo/eji$d;->e(Landroid/view/MotionEvent;)Lo/eji$b;

    move-result-object v2

    goto :goto_0

    .line 194
    :cond_0
    move-object v2, p0

    .line 197
    :goto_0
    iget-boolean v0, p0, Lo/eji$d;->b:Z

    if-eqz v0, :cond_2

    .line 198
    iget-object v0, p0, Lo/eji$d;->d:Lo/ejd;

    invoke-virtual {v0}, Lo/ejd;->d()V

    goto :goto_2

    .line 204
    :pswitch_2
    iget-object v0, p0, Lo/eji$d;->d:Lo/ejd;

    invoke-virtual {v0, p1}, Lo/ejd;->a(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 205
    invoke-direct {p0, p1}, Lo/eji$d;->a(Landroid/view/MotionEvent;)Lo/eji$b;

    move-result-object v2

    goto :goto_2

    .line 207
    :cond_1
    iget-object v0, p0, Lo/eji$d;->e:Lo/eji;

    invoke-static {v0}, Lo/eji;->c(Lo/eji;)Lo/eji$b;

    move-result-object v2

    .line 209
    goto :goto_2

    .line 212
    :goto_1
    iget-object v0, p0, Lo/eji$d;->e:Lo/eji;

    invoke-static {v0}, Lo/eji;->c(Lo/eji;)Lo/eji$b;

    move-result-object v2

    .line 216
    :cond_2
    :goto_2
    iget-object v0, p0, Lo/eji$d;->e:Lo/eji;

    invoke-static {v0}, Lo/eji;->c(Lo/eji;)Lo/eji$b;

    move-result-object v0

    if-ne v2, v0, :cond_3

    .line 217
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eji$d;->a:Z

    .line 219
    iget-object v0, p0, Lo/eji$d;->e:Lo/eji;

    invoke-static {v0}, Lo/eji;->a(Lo/eji;)Lo/eie;

    move-result-object v0

    instance-of v0, v0, Lo/eih;

    if-eqz v0, :cond_3

    .line 220
    iget-object v0, p0, Lo/eji$d;->e:Lo/eji;

    invoke-static {v0}, Lo/eji;->a(Lo/eji;)Lo/eie;

    move-result-object v0

    check-cast v0, Lo/eih;

    invoke-virtual {v0}, Lo/eih;->an()V

    .line 224
    :cond_3
    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
