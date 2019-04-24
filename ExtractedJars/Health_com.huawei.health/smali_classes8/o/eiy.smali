.class public Lo/eiy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eje;


# instance fields
.field private a:Z

.field private b:F

.field private c:F

.field private d:F

.field private e:Lo/nz;

.field private f:Landroid/graphics/Matrix;

.field private g:Landroid/graphics/Matrix;

.field private h:Lo/eja;

.field private i:F

.field private k:Lo/eie;


# direct methods
.method constructor <init>(Landroid/content/Context;Lo/eie;Lo/oa;Lo/eja;)V
    .locals 2

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eiy;->a:Z

    .line 25
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lo/eiy;->d:F

    .line 26
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lo/eiy;->c:F

    .line 27
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lo/eiy;->b:F

    .line 29
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/nz;->d(FF)Lo/nz;

    move-result-object v0

    iput-object v0, p0, Lo/eiy;->e:Lo/nz;

    .line 32
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eiy;->k:Lo/eie;

    .line 34
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eiy;->h:Lo/eja;

    .line 35
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eiy;->g:Landroid/graphics/Matrix;

    .line 40
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lo/eiy;->f:Landroid/graphics/Matrix;

    .line 47
    iput-object p2, p0, Lo/eiy;->k:Lo/eie;

    .line 49
    iput-object p4, p0, Lo/eiy;->h:Lo/eja;

    .line 51
    invoke-virtual {p3}, Lo/oa;->p()Landroid/graphics/Matrix;

    move-result-object v0

    iput-object v0, p0, Lo/eiy;->g:Landroid/graphics/Matrix;

    .line 52
    const/high16 v0, 0x40600000    # 3.5f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    iput v0, p0, Lo/eiy;->i:F

    .line 53
    return-void
.end method

.method private a(Landroid/view/MotionEvent;)V
    .locals 2

    .line 95
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    .line 96
    invoke-direct {p0}, Lo/eiy;->c()V

    .line 97
    return-void

    .line 100
    :cond_0
    iget-object v0, p0, Lo/eiy;->h:Lo/eja;

    iget-object v0, v0, Lo/eja;->k:Lo/eih$c;

    sget-object v1, Lo/eih$c;->e:Lo/eih$c;

    if-ne v0, v1, :cond_1

    .line 101
    invoke-direct {p0}, Lo/eiy;->c()V

    .line 102
    return-void

    .line 105
    :cond_1
    invoke-direct {p0, p1}, Lo/eiy;->e(Landroid/view/MotionEvent;)V

    .line 108
    invoke-static {p1}, Lo/eiy;->i(Landroid/view/MotionEvent;)F

    move-result v0

    iput v0, p0, Lo/eiy;->d:F

    .line 111
    invoke-static {p1}, Lo/eiy;->h(Landroid/view/MotionEvent;)F

    move-result v0

    iput v0, p0, Lo/eiy;->c:F

    .line 114
    invoke-static {p1}, Lo/eiy;->g(Landroid/view/MotionEvent;)F

    move-result v0

    iput v0, p0, Lo/eiy;->b:F

    .line 116
    iget-object v0, p0, Lo/eiy;->k:Lo/eie;

    invoke-virtual {v0}, Lo/eie;->n()Z

    move-result v0

    if-nez v0, :cond_2

    .line 117
    invoke-direct {p0}, Lo/eiy;->c()V

    .line 118
    return-void

    .line 121
    :cond_2
    iget v0, p0, Lo/eiy;->b:F

    const/high16 v1, 0x41200000    # 10.0f

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_3

    .line 122
    invoke-direct {p0}, Lo/eiy;->c()V

    .line 123
    return-void

    .line 126
    :cond_3
    iget v0, p0, Lo/eiy;->d:F

    iget v1, p0, Lo/eiy;->c:F

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_4

    .line 127
    invoke-direct {p0}, Lo/eiy;->c()V

    .line 128
    return-void

    .line 132
    :cond_4
    iget-object v0, p0, Lo/eiy;->e:Lo/nz;

    invoke-static {v0, p1}, Lo/eiy;->c(Lo/nz;Landroid/view/MotionEvent;)V

    .line 133
    return-void
.end method

.method private c()V
    .locals 1

    .line 228
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eiy;->a:Z

    .line 229
    return-void
.end method

.method private c(Landroid/view/MotionEvent;)V
    .locals 0

    .line 90
    invoke-direct {p0}, Lo/eiy;->c()V

    .line 91
    return-void
.end method

.method private static c(Lo/nz;Landroid/view/MotionEvent;)V
    .locals 4

    .line 140
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    add-float v2, v0, v1

    .line 141
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getY(I)F

    move-result v1

    add-float v3, v0, v1

    .line 142
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v2, v0

    iput v0, p0, Lo/nz;->e:F

    .line 143
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v3, v0

    iput v0, p0, Lo/nz;->c:F

    .line 144
    return-void
.end method

.method private e(Landroid/view/MotionEvent;)V
    .locals 2

    .line 136
    iget-object v0, p0, Lo/eiy;->f:Landroid/graphics/Matrix;

    iget-object v1, p0, Lo/eiy;->g:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 137
    return-void
.end method

.method private f(Landroid/view/MotionEvent;)V
    .locals 11

    .line 152
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    .line 153
    invoke-direct {p0}, Lo/eiy;->c()V

    .line 154
    return-void

    .line 158
    :cond_0
    invoke-static {p1}, Lo/eiy;->g(Landroid/view/MotionEvent;)F

    move-result v4

    .line 160
    iget v0, p0, Lo/eiy;->i:F

    cmpg-float v0, v4, v0

    if-gtz v0, :cond_1

    .line 161
    invoke-direct {p0}, Lo/eiy;->c()V

    .line 162
    return-void

    .line 166
    :cond_1
    iget-object v0, p0, Lo/eiy;->e:Lo/nz;

    iget v0, v0, Lo/nz;->e:F

    iget-object v1, p0, Lo/eiy;->e:Lo/nz;

    iget v1, v1, Lo/nz;->c:F

    invoke-virtual {p0, v0, v1}, Lo/eiy;->a(FF)Lo/nz;

    move-result-object v5

    .line 167
    iget-object v0, p0, Lo/eiy;->k:Lo/eie;

    invoke-virtual {v0}, Lo/eie;->getViewPortHandler()Lo/oa;

    move-result-object v6

    .line 171
    invoke-static {p1}, Lo/eiy;->i(Landroid/view/MotionEvent;)F

    move-result v7

    .line 172
    iget v0, p0, Lo/eiy;->d:F

    div-float v8, v7, v0

    .line 174
    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, v8, v0

    if-gez v0, :cond_2

    const/4 v9, 0x1

    goto :goto_0

    :cond_2
    const/4 v9, 0x0

    .line 175
    :goto_0
    if-eqz v9, :cond_3

    .line 176
    invoke-virtual {v6}, Lo/oa;->w()Z

    move-result v10

    goto :goto_1

    .line 177
    :cond_3
    invoke-virtual {v6}, Lo/oa;->y()Z

    move-result v10

    .line 179
    :goto_1
    if-eqz v10, :cond_4

    .line 181
    iget-object v0, p0, Lo/eiy;->g:Landroid/graphics/Matrix;

    iget-object v1, p0, Lo/eiy;->f:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 182
    iget-object v0, p0, Lo/eiy;->g:Landroid/graphics/Matrix;

    iget v1, v5, Lo/nz;->e:F

    iget v2, v5, Lo/nz;->c:F

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {v0, v8, v3, v1, v2}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 186
    :cond_4
    invoke-static {v5}, Lo/nz;->c(Lo/nz;)V

    .line 188
    return-void
.end method

.method private static g(Landroid/view/MotionEvent;)F
    .locals 4

    .line 232
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    sub-float v2, v0, v1

    .line 233
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Landroid/view/MotionEvent;->getY(I)F

    move-result v1

    sub-float v3, v0, v1

    .line 234
    mul-float v0, v2, v2

    mul-float v1, v3, v3

    add-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    return v0
.end method

.method private static h(Landroid/view/MotionEvent;)F
    .locals 3

    .line 208
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Landroid/view/MotionEvent;->getY(I)F

    move-result v1

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v2

    .line 209
    return v2
.end method

.method private static i(Landroid/view/MotionEvent;)F
    .locals 3

    .line 203
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v2

    .line 204
    return v2
.end method

.method private k(Landroid/view/MotionEvent;)V
    .locals 0

    .line 147
    invoke-direct {p0, p1}, Lo/eiy;->f(Landroid/view/MotionEvent;)V

    .line 148
    return-void
.end method


# virtual methods
.method public a(FF)Lo/nz;
    .locals 5

    .line 192
    iget-object v0, p0, Lo/eiy;->k:Lo/eie;

    invoke-virtual {v0}, Lo/eie;->getViewPortHandler()Lo/oa;

    move-result-object v2

    .line 194
    invoke-virtual {v2}, Lo/oa;->a()F

    move-result v0

    sub-float v3, p1, v0

    .line 197
    iget-object v0, p0, Lo/eiy;->k:Lo/eie;

    invoke-virtual {v0}, Lo/eie;->getMeasuredHeight()I

    move-result v0

    int-to-float v0, v0

    sub-float/2addr v0, p2

    invoke-virtual {v2}, Lo/oa;->d()F

    move-result v1

    sub-float/2addr v0, v1

    neg-float v4, v0

    .line 199
    invoke-static {v3, v4}, Lo/nz;->d(FF)Lo/nz;

    move-result-object v0

    return-object v0
.end method

.method public b()V
    .locals 0

    .line 225
    return-void
.end method

.method public b(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 58
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    .line 59
    const/4 v0, 0x1

    return v0

    .line 61
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public d(Landroid/view/MotionEvent;)V
    .locals 4

    .line 66
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 68
    :pswitch_0
    invoke-direct {p0, p1}, Lo/eiy;->a(Landroid/view/MotionEvent;)V

    .line 69
    goto :goto_1

    .line 72
    :pswitch_1
    invoke-direct {p0, p1}, Lo/eiy;->k(Landroid/view/MotionEvent;)V

    .line 73
    goto :goto_1

    .line 77
    :pswitch_2
    invoke-direct {p0, p1}, Lo/eiy;->c(Landroid/view/MotionEvent;)V

    .line 78
    goto :goto_1

    .line 81
    :goto_0
    :pswitch_3
    invoke-direct {p0}, Lo/eiy;->c()V

    .line 86
    :goto_1
    iget-object v0, p0, Lo/eiy;->k:Lo/eie;

    invoke-virtual {v0}, Lo/eie;->getViewPortHandler()Lo/oa;

    move-result-object v0

    iget-object v1, p0, Lo/eiy;->g:Landroid/graphics/Matrix;

    iget-object v2, p0, Lo/eiy;->k:Lo/eie;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lo/oa;->d(Landroid/graphics/Matrix;Landroid/view/View;Z)Landroid/graphics/Matrix;

    move-result-object v0

    iput-object v0, p0, Lo/eiy;->g:Landroid/graphics/Matrix;

    .line 87
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public d()Z
    .locals 1

    .line 214
    iget-boolean v0, p0, Lo/eiy;->a:Z

    return v0
.end method

.method public e()V
    .locals 1

    .line 219
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eiy;->a:Z

    .line 220
    return-void
.end method
