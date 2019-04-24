.class public Lo/ewu;
.super Landroid/view/SurfaceView;
.source "SourceFile"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ewu$b;
    }
.end annotation


# instance fields
.field private A:Landroid/os/CountDownTimer;

.field private B:I

.field private C:Lo/ewu$b;

.field private D:[I

.field private H:Landroid/widget/TextView;

.field private a:Landroid/view/SurfaceHolder;

.field private b:Landroid/content/Context;

.field private c:I

.field private d:Landroid/graphics/Canvas;

.field private e:I

.field private f:I

.field private g:I

.field private h:F

.field private i:I

.field private j:I

.field private k:F

.field private l:Landroid/graphics/Paint;

.field private m:Landroid/graphics/Paint;

.field private n:Landroid/graphics/Paint;

.field private o:Landroid/graphics/Paint;

.field private p:Landroid/graphics/Paint;

.field private q:I

.field private r:I

.field private s:Landroid/graphics/Paint;

.field private t:Landroid/graphics/RectF;

.field private u:Landroid/graphics/RectF;

.field private v:[I

.field private w:I

.field private x:I

.field private y:I

.field private z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 71
    invoke-direct {p0, p1}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V

    .line 39
    const/4 v0, 0x0

    iput v0, p0, Lo/ewu;->k:F

    .line 40
    const/high16 v0, 0x40c00000    # 6.0f

    iput v0, p0, Lo/ewu;->h:F

    .line 44
    const/4 v0, 0x0

    iput v0, p0, Lo/ewu;->q:I

    .line 45
    const/16 v0, 0x99

    const/16 v1, 0xfb

    const/16 v2, 0x65

    const/16 v3, 0x22

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/ewu;->r:I

    .line 46
    const/16 v0, 0x99

    const/16 v1, 0xfc

    const/16 v2, 0x84

    const/16 v3, 0x4e

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/ewu;->z:I

    .line 47
    const/4 v0, 0x0

    const/16 v1, 0xfc

    const/16 v2, 0x84

    const/16 v3, 0x4e

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/ewu;->w:I

    .line 48
    const/4 v0, 0x3

    new-array v0, v0, [I

    iget v1, p0, Lo/ewu;->w:I

    const/4 v2, 0x0

    aput v1, v0, v2

    iget v1, p0, Lo/ewu;->z:I

    const/4 v2, 0x1

    aput v1, v0, v2

    iget v1, p0, Lo/ewu;->r:I

    const/4 v2, 0x2

    aput v1, v0, v2

    iput-object v0, p0, Lo/ewu;->v:[I

    .line 49
    const/16 v0, 0xcc

    const/16 v1, 0xfb

    const/16 v2, 0x65

    const/16 v3, 0x22

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/ewu;->x:I

    .line 50
    const/16 v0, 0xff

    const/16 v1, 0xfc

    const/16 v2, 0x84

    const/16 v3, 0x4e

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/ewu;->y:I

    .line 51
    const/4 v0, 0x0

    const/16 v1, 0xfc

    const/16 v2, 0x84

    const/16 v3, 0x4e

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/ewu;->B:I

    .line 52
    const/4 v0, 0x3

    new-array v0, v0, [I

    iget v1, p0, Lo/ewu;->B:I

    const/4 v2, 0x0

    aput v1, v0, v2

    iget v1, p0, Lo/ewu;->y:I

    const/4 v2, 0x1

    aput v1, v0, v2

    iget v1, p0, Lo/ewu;->x:I

    const/4 v2, 0x2

    aput v1, v0, v2

    iput-object v0, p0, Lo/ewu;->D:[I

    .line 72
    iput-object p1, p0, Lo/ewu;->b:Landroid/content/Context;

    .line 73
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/ewu;->setZOrderOnTop(Z)V

    .line 74
    invoke-direct {p0}, Lo/ewu;->d()V

    .line 75
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .line 85
    invoke-direct {p0, p1, p2}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 39
    const/4 v0, 0x0

    iput v0, p0, Lo/ewu;->k:F

    .line 40
    const/high16 v0, 0x40c00000    # 6.0f

    iput v0, p0, Lo/ewu;->h:F

    .line 44
    const/4 v0, 0x0

    iput v0, p0, Lo/ewu;->q:I

    .line 45
    const/16 v0, 0x99

    const/16 v1, 0xfb

    const/16 v2, 0x65

    const/16 v3, 0x22

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/ewu;->r:I

    .line 46
    const/16 v0, 0x99

    const/16 v1, 0xfc

    const/16 v2, 0x84

    const/16 v3, 0x4e

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/ewu;->z:I

    .line 47
    const/4 v0, 0x0

    const/16 v1, 0xfc

    const/16 v2, 0x84

    const/16 v3, 0x4e

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/ewu;->w:I

    .line 48
    const/4 v0, 0x3

    new-array v0, v0, [I

    iget v1, p0, Lo/ewu;->w:I

    const/4 v2, 0x0

    aput v1, v0, v2

    iget v1, p0, Lo/ewu;->z:I

    const/4 v2, 0x1

    aput v1, v0, v2

    iget v1, p0, Lo/ewu;->r:I

    const/4 v2, 0x2

    aput v1, v0, v2

    iput-object v0, p0, Lo/ewu;->v:[I

    .line 49
    const/16 v0, 0xcc

    const/16 v1, 0xfb

    const/16 v2, 0x65

    const/16 v3, 0x22

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/ewu;->x:I

    .line 50
    const/16 v0, 0xff

    const/16 v1, 0xfc

    const/16 v2, 0x84

    const/16 v3, 0x4e

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/ewu;->y:I

    .line 51
    const/4 v0, 0x0

    const/16 v1, 0xfc

    const/16 v2, 0x84

    const/16 v3, 0x4e

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/ewu;->B:I

    .line 52
    const/4 v0, 0x3

    new-array v0, v0, [I

    iget v1, p0, Lo/ewu;->B:I

    const/4 v2, 0x0

    aput v1, v0, v2

    iget v1, p0, Lo/ewu;->y:I

    const/4 v2, 0x1

    aput v1, v0, v2

    iget v1, p0, Lo/ewu;->x:I

    const/4 v2, 0x2

    aput v1, v0, v2

    iput-object v0, p0, Lo/ewu;->D:[I

    .line 86
    iput-object p1, p0, Lo/ewu;->b:Landroid/content/Context;

    .line 87
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/ewu;->setZOrderOnTop(Z)V

    .line 88
    invoke-direct {p0}, Lo/ewu;->d()V

    .line 89
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .line 92
    invoke-direct {p0, p1, p2, p3}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 39
    const/4 v0, 0x0

    iput v0, p0, Lo/ewu;->k:F

    .line 40
    const/high16 v0, 0x40c00000    # 6.0f

    iput v0, p0, Lo/ewu;->h:F

    .line 44
    const/4 v0, 0x0

    iput v0, p0, Lo/ewu;->q:I

    .line 45
    const/16 v0, 0x99

    const/16 v1, 0xfb

    const/16 v2, 0x65

    const/16 v3, 0x22

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/ewu;->r:I

    .line 46
    const/16 v0, 0x99

    const/16 v1, 0xfc

    const/16 v2, 0x84

    const/16 v3, 0x4e

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/ewu;->z:I

    .line 47
    const/4 v0, 0x0

    const/16 v1, 0xfc

    const/16 v2, 0x84

    const/16 v3, 0x4e

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/ewu;->w:I

    .line 48
    const/4 v0, 0x3

    new-array v0, v0, [I

    iget v1, p0, Lo/ewu;->w:I

    const/4 v2, 0x0

    aput v1, v0, v2

    iget v1, p0, Lo/ewu;->z:I

    const/4 v2, 0x1

    aput v1, v0, v2

    iget v1, p0, Lo/ewu;->r:I

    const/4 v2, 0x2

    aput v1, v0, v2

    iput-object v0, p0, Lo/ewu;->v:[I

    .line 49
    const/16 v0, 0xcc

    const/16 v1, 0xfb

    const/16 v2, 0x65

    const/16 v3, 0x22

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/ewu;->x:I

    .line 50
    const/16 v0, 0xff

    const/16 v1, 0xfc

    const/16 v2, 0x84

    const/16 v3, 0x4e

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/ewu;->y:I

    .line 51
    const/4 v0, 0x0

    const/16 v1, 0xfc

    const/16 v2, 0x84

    const/16 v3, 0x4e

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/ewu;->B:I

    .line 52
    const/4 v0, 0x3

    new-array v0, v0, [I

    iget v1, p0, Lo/ewu;->B:I

    const/4 v2, 0x0

    aput v1, v0, v2

    iget v1, p0, Lo/ewu;->y:I

    const/4 v2, 0x1

    aput v1, v0, v2

    iget v1, p0, Lo/ewu;->x:I

    const/4 v2, 0x2

    aput v1, v0, v2

    iput-object v0, p0, Lo/ewu;->D:[I

    .line 93
    iput-object p1, p0, Lo/ewu;->b:Landroid/content/Context;

    .line 94
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/ewu;->setZOrderOnTop(Z)V

    .line 95
    invoke-direct {p0}, Lo/ewu;->d()V

    .line 96
    return-void
.end method

.method private a(I)I
    .locals 7

    .line 150
    const/16 v3, 0x1f4

    .line 151
    invoke-static {}, Lo/ewo;->d()Lo/ewo;

    move-result-object v0

    iget-object v1, p0, Lo/ewu;->b:Landroid/content/Context;

    const/high16 v2, 0x43fa0000    # 500.0f

    invoke-virtual {v0, v1, v2}, Lo/ewo;->e(Landroid/content/Context;F)I

    move-result v4

    .line 152
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v5

    .line 153
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v6

    .line 154
    const/high16 v0, 0x40000000    # 2.0f

    if-ne v5, v0, :cond_0

    .line 155
    move v4, v6

    goto :goto_0

    .line 157
    :cond_0
    const/high16 v0, -0x80000000

    if-ne v5, v0, :cond_1

    .line 158
    invoke-static {v4, v6}, Ljava/lang/Math;->min(II)I

    move-result v4

    .line 161
    :cond_1
    :goto_0
    return v4
.end method

.method private a()V
    .locals 6

    .line 269
    :try_start_0
    iget-object v0, p0, Lo/ewu;->a:Landroid/view/SurfaceHolder;

    invoke-interface {v0}, Landroid/view/SurfaceHolder;->lockCanvas()Landroid/graphics/Canvas;

    move-result-object v0

    iput-object v0, p0, Lo/ewu;->d:Landroid/graphics/Canvas;

    .line 270
    iget-object v0, p0, Lo/ewu;->d:Landroid/graphics/Canvas;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 271
    iget-object v0, p0, Lo/ewu;->d:Landroid/graphics/Canvas;

    invoke-direct {p0, v0}, Lo/ewu;->d(Landroid/graphics/Canvas;)V

    .line 272
    iget-object v0, p0, Lo/ewu;->d:Landroid/graphics/Canvas;

    invoke-virtual {v0}, Landroid/graphics/Canvas;->save()I

    .line 273
    iget-object v0, p0, Lo/ewu;->d:Landroid/graphics/Canvas;

    invoke-direct {p0, v0}, Lo/ewu;->e(Landroid/graphics/Canvas;)V

    .line 274
    iget-object v0, p0, Lo/ewu;->d:Landroid/graphics/Canvas;

    invoke-virtual {v0}, Landroid/graphics/Canvas;->save()I

    .line 275
    iget-object v0, p0, Lo/ewu;->d:Landroid/graphics/Canvas;

    invoke-virtual {p0, v0}, Lo/ewu;->a(Landroid/graphics/Canvas;)V

    .line 276
    iget-object v0, p0, Lo/ewu;->d:Landroid/graphics/Canvas;

    invoke-direct {p0, v0}, Lo/ewu;->b(Landroid/graphics/Canvas;)V

    .line 277
    iget-object v0, p0, Lo/ewu;->H:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 278
    iget v0, p0, Lo/ewu;->q:I

    const/16 v1, 0x9

    if-gt v0, v1, :cond_0

    .line 279
    iget-object v0, p0, Lo/ewu;->H:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "00:00:0"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/ewu;->q:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 281
    :cond_0
    iget-object v0, p0, Lo/ewu;->H:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "00:00:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/ewu;->q:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 284
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lo/ewu;->postInvalidate()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 289
    iget-object v0, p0, Lo/ewu;->d:Landroid/graphics/Canvas;

    if-eqz v0, :cond_3

    .line 290
    iget-object v0, p0, Lo/ewu;->a:Landroid/view/SurfaceHolder;

    iget-object v1, p0, Lo/ewu;->d:Landroid/graphics/Canvas;

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    goto :goto_1

    .line 286
    :catch_0
    move-exception v4

    .line 287
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "viewIntereptChange fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 289
    iget-object v0, p0, Lo/ewu;->d:Landroid/graphics/Canvas;

    if-eqz v0, :cond_3

    .line 290
    iget-object v0, p0, Lo/ewu;->a:Landroid/view/SurfaceHolder;

    iget-object v1, p0, Lo/ewu;->d:Landroid/graphics/Canvas;

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    goto :goto_1

    .line 289
    :catchall_0
    move-exception v5

    iget-object v0, p0, Lo/ewu;->d:Landroid/graphics/Canvas;

    if-eqz v0, :cond_2

    .line 290
    iget-object v0, p0, Lo/ewu;->a:Landroid/view/SurfaceHolder;

    iget-object v1, p0, Lo/ewu;->d:Landroid/graphics/Canvas;

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    .line 292
    :cond_2
    throw v5

    .line 293
    :cond_3
    :goto_1
    return-void
.end method

.method static synthetic b(Lo/ewu;)I
    .locals 1

    .line 28
    iget v0, p0, Lo/ewu;->q:I

    return v0
.end method

.method private b()V
    .locals 9

    .line 113
    const/16 v6, 0x78

    .line 114
    invoke-static {}, Lo/ewo;->d()Lo/ewo;

    move-result-object v0

    iget-object v1, p0, Lo/ewu;->b:Landroid/content/Context;

    const/high16 v2, 0x42f00000    # 120.0f

    invoke-virtual {v0, v1, v2}, Lo/ewo;->e(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lo/ewu;->e:I

    .line 115
    invoke-static {}, Lo/ewo;->d()Lo/ewo;

    move-result-object v0

    iget-object v1, p0, Lo/ewu;->b:Landroid/content/Context;

    const/high16 v2, 0x42f00000    # 120.0f

    invoke-virtual {v0, v1, v2}, Lo/ewo;->e(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lo/ewu;->c:I

    .line 116
    const/16 v7, 0x76

    .line 117
    invoke-static {}, Lo/ewo;->d()Lo/ewo;

    move-result-object v0

    iget-object v1, p0, Lo/ewu;->b:Landroid/content/Context;

    const/high16 v2, 0x42ec0000    # 118.0f

    invoke-virtual {v0, v1, v2}, Lo/ewo;->e(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lo/ewu;->i:I

    .line 118
    const/16 v8, 0x9

    .line 119
    invoke-static {}, Lo/ewo;->d()Lo/ewo;

    move-result-object v0

    iget-object v1, p0, Lo/ewu;->b:Landroid/content/Context;

    const/high16 v2, 0x41100000    # 9.0f

    invoke-virtual {v0, v1, v2}, Lo/ewo;->e(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lo/ewu;->f:I

    .line 120
    invoke-static {}, Lo/ewo;->d()Lo/ewo;

    move-result-object v0

    iget-object v1, p0, Lo/ewu;->b:Landroid/content/Context;

    const/high16 v2, 0x3fc00000    # 1.5f

    invoke-virtual {v0, v1, v2}, Lo/ewo;->e(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lo/ewu;->g:I

    .line 121
    new-instance v0, Landroid/graphics/RectF;

    iget v1, p0, Lo/ewu;->i:I

    neg-int v1, v1

    int-to-float v1, v1

    iget v2, p0, Lo/ewu;->i:I

    neg-int v2, v2

    int-to-float v2, v2

    iget v3, p0, Lo/ewu;->i:I

    int-to-float v3, v3

    iget v4, p0, Lo/ewu;->i:I

    int-to-float v4, v4

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lo/ewu;->t:Landroid/graphics/RectF;

    .line 122
    new-instance v0, Landroid/graphics/RectF;

    iget v1, p0, Lo/ewu;->i:I

    iget v2, p0, Lo/ewu;->f:I

    sub-int/2addr v1, v2

    neg-int v1, v1

    int-to-float v1, v1

    iget v2, p0, Lo/ewu;->i:I

    iget v3, p0, Lo/ewu;->f:I

    sub-int/2addr v2, v3

    neg-int v2, v2

    int-to-float v2, v2

    iget v3, p0, Lo/ewu;->i:I

    iget v4, p0, Lo/ewu;->f:I

    sub-int/2addr v3, v4

    int-to-float v3, v3

    iget v4, p0, Lo/ewu;->i:I

    iget v5, p0, Lo/ewu;->f:I

    sub-int/2addr v4, v5

    int-to-float v4, v4

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lo/ewu;->u:Landroid/graphics/RectF;

    .line 123
    return-void
.end method

.method private b(Landroid/graphics/Canvas;)V
    .locals 4

    .line 190
    iget-object v0, p0, Lo/ewu;->o:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 191
    iget-object v0, p0, Lo/ewu;->o:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 192
    invoke-static {}, Lo/ewo;->d()Lo/ewo;

    move-result-object v0

    iget-object v1, p0, Lo/ewu;->b:Landroid/content/Context;

    const/high16 v2, 0x40000000    # 2.0f

    invoke-virtual {v0, v1, v2}, Lo/ewo;->e(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lo/ewu;->o:Landroid/graphics/Paint;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p1, v2, v3, v0, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 193
    return-void
.end method

.method private c(Landroid/graphics/Canvas;)V
    .locals 7

    .line 196
    iget-object v0, p0, Lo/ewu;->n:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->reset()V

    .line 197
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 198
    iget-object v0, p0, Lo/ewu;->n:Landroid/graphics/Paint;

    invoke-static {}, Lo/ewo;->d()Lo/ewo;

    move-result-object v1

    iget-object v2, p0, Lo/ewu;->b:Landroid/content/Context;

    invoke-virtual {v1, v2, v6}, Lo/ewo;->e(Landroid/content/Context;F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 199
    iget-object v0, p0, Lo/ewu;->n:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 200
    iget-object v0, p0, Lo/ewu;->n:Landroid/graphics/Paint;

    const/16 v1, 0xcc

    const/16 v2, 0xfb

    const/16 v3, 0x65

    const/16 v4, 0x22

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 201
    iget-object v0, p0, Lo/ewu;->n:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 202
    iget-object v0, p0, Lo/ewu;->n:Landroid/graphics/Paint;

    const-string v1, "#80FB6522"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    const/high16 v2, 0x41200000    # 10.0f

    const/high16 v3, -0x3f600000    # -5.0f

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v3, v4, v1}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 203
    iget v0, p0, Lo/ewu;->k:F

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 204
    move-object v0, p1

    invoke-static {}, Lo/ewo;->d()Lo/ewo;

    move-result-object v1

    iget-object v2, p0, Lo/ewu;->b:Landroid/content/Context;

    const/high16 v3, 0x41100000    # 9.0f

    invoke-virtual {v1, v2, v3}, Lo/ewo;->e(Landroid/content/Context;F)I

    move-result v1

    int-to-float v2, v1

    iget v1, p0, Lo/ewu;->i:I

    neg-int v1, v1

    int-to-float v4, v1

    iget-object v5, p0, Lo/ewu;->n:Landroid/graphics/Paint;

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 205
    return-void
.end method

.method static synthetic d(Lo/ewu;)Lo/ewu$b;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/ewu;->C:Lo/ewu$b;

    return-object v0
.end method

.method private d()V
    .locals 4

    .line 125
    const-string v0, "PressureMeasureMessageTimeClockView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/ewu;->l:Landroid/graphics/Paint;

    .line 127
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/ewu;->p:Landroid/graphics/Paint;

    .line 128
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/ewu;->m:Landroid/graphics/Paint;

    .line 129
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/ewu;->o:Landroid/graphics/Paint;

    .line 130
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/ewu;->n:Landroid/graphics/Paint;

    .line 131
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/ewu;->s:Landroid/graphics/Paint;

    .line 132
    invoke-virtual {p0}, Lo/ewu;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    iput-object v0, p0, Lo/ewu;->a:Landroid/view/SurfaceHolder;

    .line 133
    iget-object v0, p0, Lo/ewu;->a:Landroid/view/SurfaceHolder;

    const/4 v1, -0x2

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->setFormat(I)V

    .line 134
    iget-object v0, p0, Lo/ewu;->a:Landroid/view/SurfaceHolder;

    invoke-interface {v0, p0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 135
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/ewu;->setFocusable(Z)V

    .line 136
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/ewu;->setFocusableInTouchMode(Z)V

    .line 137
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/ewu;->setKeepScreenOn(Z)V

    .line 139
    return-void
.end method

.method private d(Landroid/graphics/Canvas;)V
    .locals 9

    .line 165
    iget-object v0, p0, Lo/ewu;->p:Landroid/graphics/Paint;

    const/16 v1, 0xff

    const/16 v2, 0xcc

    const/16 v3, 0xcc

    const/16 v4, 0xcc

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 166
    iget-object v0, p0, Lo/ewu;->p:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 167
    const/4 v6, 0x1

    .line 168
    iget-object v0, p0, Lo/ewu;->p:Landroid/graphics/Paint;

    invoke-static {}, Lo/ewo;->d()Lo/ewo;

    move-result-object v1

    iget-object v2, p0, Lo/ewu;->b:Landroid/content/Context;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {v1, v2, v3}, Lo/ewo;->e(Landroid/content/Context;F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 169
    const/16 v7, 0xb4

    .line 170
    iget v0, p0, Lo/ewu;->e:I

    int-to-float v0, v0

    iget v1, p0, Lo/ewu;->c:I

    int-to-float v1, v1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 171
    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_0

    .line 172
    move-object v0, p1

    iget v1, p0, Lo/ewu;->i:I

    invoke-static {}, Lo/ewo;->d()Lo/ewo;

    move-result-object v2

    iget-object v3, p0, Lo/ewu;->b:Landroid/content/Context;

    const/high16 v4, 0x41000000    # 8.0f

    invoke-virtual {v2, v3, v4}, Lo/ewo;->e(Landroid/content/Context;F)I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v2, v1

    iget v1, p0, Lo/ewu;->i:I

    int-to-float v4, v1

    iget-object v5, p0, Lo/ewu;->p:Landroid/graphics/Paint;

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 173
    const-wide v0, 0x4076800000000000L    # 360.0

    const-wide v2, 0x4066800000000000L    # 180.0

    div-double/2addr v0, v2

    const/high16 v0, 0x40000000    # 2.0f

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 171
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 175
    :cond_0
    return-void
.end method

.method private e()V
    .locals 6

    .line 299
    :try_start_0
    iget-object v0, p0, Lo/ewu;->a:Landroid/view/SurfaceHolder;

    invoke-interface {v0}, Landroid/view/SurfaceHolder;->lockCanvas()Landroid/graphics/Canvas;

    move-result-object v0

    iput-object v0, p0, Lo/ewu;->d:Landroid/graphics/Canvas;

    .line 300
    iget-object v0, p0, Lo/ewu;->d:Landroid/graphics/Canvas;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 301
    iget-object v0, p0, Lo/ewu;->d:Landroid/graphics/Canvas;

    invoke-direct {p0, v0}, Lo/ewu;->d(Landroid/graphics/Canvas;)V

    .line 302
    iget-object v0, p0, Lo/ewu;->d:Landroid/graphics/Canvas;

    invoke-virtual {v0}, Landroid/graphics/Canvas;->save()I

    .line 303
    iget-object v0, p0, Lo/ewu;->d:Landroid/graphics/Canvas;

    invoke-direct {p0, v0}, Lo/ewu;->e(Landroid/graphics/Canvas;)V

    .line 304
    iget-object v0, p0, Lo/ewu;->d:Landroid/graphics/Canvas;

    invoke-virtual {v0}, Landroid/graphics/Canvas;->save()I

    .line 305
    iget-object v0, p0, Lo/ewu;->d:Landroid/graphics/Canvas;

    invoke-virtual {p0, v0}, Lo/ewu;->a(Landroid/graphics/Canvas;)V

    .line 306
    iget-object v0, p0, Lo/ewu;->d:Landroid/graphics/Canvas;

    invoke-direct {p0, v0}, Lo/ewu;->b(Landroid/graphics/Canvas;)V

    .line 307
    invoke-virtual {p0}, Lo/ewu;->postInvalidate()V

    .line 308
    iget-object v0, p0, Lo/ewu;->H:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 309
    iget v0, p0, Lo/ewu;->q:I

    const/16 v1, 0x9

    if-gt v0, v1, :cond_0

    .line 310
    iget-object v0, p0, Lo/ewu;->H:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "00:00:0"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/ewu;->q:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 312
    :cond_0
    iget-object v0, p0, Lo/ewu;->H:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "00:00:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/ewu;->q:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 315
    :cond_1
    :goto_0
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "second = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/ewu;->q:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 316
    iget v0, p0, Lo/ewu;->k:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_2

    .line 317
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startAngle + "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/ewu;->k:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 318
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    iget v1, p0, Lo/ewu;->j:I

    const/4 v2, 0x4

    invoke-virtual {v0, v2, v1}, Lo/ewd;->d(II)V

    .line 320
    :cond_2
    iget v0, p0, Lo/ewu;->q:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/ewu;->q:I

    .line 321
    iget v0, p0, Lo/ewu;->k:F

    iget v1, p0, Lo/ewu;->h:F

    sub-float/2addr v0, v1

    iput v0, p0, Lo/ewu;->k:F
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 332
    iget-object v0, p0, Lo/ewu;->d:Landroid/graphics/Canvas;

    if-eqz v0, :cond_5

    .line 333
    iget-object v0, p0, Lo/ewu;->a:Landroid/view/SurfaceHolder;

    iget-object v1, p0, Lo/ewu;->d:Landroid/graphics/Canvas;

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    goto/16 :goto_1

    .line 323
    :catch_0
    move-exception v4

    .line 324
    :try_start_1
    iget v0, p0, Lo/ewu;->k:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_3

    .line 325
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startAngle + "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/ewu;->k:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 326
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    iget v1, p0, Lo/ewu;->j:I

    const/4 v2, 0x4

    invoke-virtual {v0, v2, v1}, Lo/ewd;->d(II)V

    .line 328
    :cond_3
    iget v0, p0, Lo/ewu;->q:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/ewu;->q:I

    .line 329
    iget v0, p0, Lo/ewu;->k:F

    iget v1, p0, Lo/ewu;->h:F

    sub-float/2addr v0, v1

    iput v0, p0, Lo/ewu;->k:F

    .line 330
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "viewChange fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 332
    iget-object v0, p0, Lo/ewu;->d:Landroid/graphics/Canvas;

    if-eqz v0, :cond_5

    .line 333
    iget-object v0, p0, Lo/ewu;->a:Landroid/view/SurfaceHolder;

    iget-object v1, p0, Lo/ewu;->d:Landroid/graphics/Canvas;

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    goto :goto_1

    .line 332
    :catchall_0
    move-exception v5

    iget-object v0, p0, Lo/ewu;->d:Landroid/graphics/Canvas;

    if-eqz v0, :cond_4

    .line 333
    iget-object v0, p0, Lo/ewu;->a:Landroid/view/SurfaceHolder;

    iget-object v1, p0, Lo/ewu;->d:Landroid/graphics/Canvas;

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    .line 335
    :cond_4
    throw v5

    .line 336
    :cond_5
    :goto_1
    return-void
.end method

.method private e(Landroid/graphics/Canvas;)V
    .locals 0

    .line 186
    invoke-direct {p0, p1}, Lo/ewu;->g(Landroid/graphics/Canvas;)V

    .line 187
    invoke-direct {p0, p1}, Lo/ewu;->c(Landroid/graphics/Canvas;)V

    .line 188
    return-void
.end method

.method static synthetic e(Lo/ewu;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Lo/ewu;->e()V

    return-void
.end method

.method private g(Landroid/graphics/Canvas;)V
    .locals 8

    .line 208
    iget-object v0, p0, Lo/ewu;->s:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->reset()V

    .line 209
    iget-object v0, p0, Lo/ewu;->s:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 210
    iget-object v0, p0, Lo/ewu;->s:Landroid/graphics/Paint;

    iget v1, p0, Lo/ewu;->g:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 211
    iget-object v0, p0, Lo/ewu;->s:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 213
    iget-object v0, p0, Lo/ewu;->m:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->reset()V

    .line 214
    iget-object v0, p0, Lo/ewu;->m:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 215
    iget-object v0, p0, Lo/ewu;->m:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 216
    iget-object v0, p0, Lo/ewu;->m:Landroid/graphics/Paint;

    iget v1, p0, Lo/ewu;->f:I

    mul-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 218
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 219
    new-instance v6, Landroid/graphics/SweepGradient;

    iget-object v0, p0, Lo/ewu;->v:[I

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v6, v1, v2, v0, v3}, Landroid/graphics/SweepGradient;-><init>(FF[I[F)V

    .line 220
    new-instance v7, Landroid/graphics/SweepGradient;

    iget-object v0, p0, Lo/ewu;->D:[I

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v7, v1, v2, v0, v3}, Landroid/graphics/SweepGradient;-><init>(FF[I[F)V

    .line 221
    iget-object v0, p0, Lo/ewu;->m:Landroid/graphics/Paint;

    invoke-virtual {v0, v6}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 222
    iget-object v0, p0, Lo/ewu;->s:Landroid/graphics/Paint;

    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 223
    const/high16 v0, -0x3d4c0000    # -90.0f

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 224
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startAngle = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/ewu;->k:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 225
    move-object v0, p1

    iget-object v1, p0, Lo/ewu;->u:Landroid/graphics/RectF;

    iget v3, p0, Lo/ewu;->k:F

    iget-object v5, p0, Lo/ewu;->m:Landroid/graphics/Paint;

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 226
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 227
    move-object v0, p1

    iget-object v1, p0, Lo/ewu;->t:Landroid/graphics/RectF;

    iget v3, p0, Lo/ewu;->k:F

    iget-object v5, p0, Lo/ewu;->s:Landroid/graphics/Paint;

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 228
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 229
    return-void
.end method

.method private i()V
    .locals 7

    .line 362
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "threadStart"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 363
    iget-object v0, p0, Lo/ewu;->A:Landroid/os/CountDownTimer;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 364
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "CountDownTimer second = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/ewu;->q:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 365
    const/16 v6, 0x3de

    .line 366
    new-instance v0, Lo/ewu$5;

    move-object v1, p0

    const-wide/32 v2, 0x1d4c0

    const-wide/16 v4, 0x3de

    invoke-direct/range {v0 .. v5}, Lo/ewu$5;-><init>(Lo/ewu;JJ)V

    .line 379
    invoke-virtual {v0}, Lo/ewu$5;->start()Landroid/os/CountDownTimer;

    move-result-object v0

    iput-object v0, p0, Lo/ewu;->A:Landroid/os/CountDownTimer;

    .line 383
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Canvas;)V
    .locals 5

    .line 178
    iget-object v0, p0, Lo/ewu;->l:Landroid/graphics/Paint;

    const/16 v1, 0xcc

    const/16 v2, 0xfb

    const/16 v3, 0x65

    const/16 v4, 0x22

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 179
    iget-object v0, p0, Lo/ewu;->l:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 180
    iget-object v0, p0, Lo/ewu;->l:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 181
    iget-object v0, p0, Lo/ewu;->l:Landroid/graphics/Paint;

    invoke-static {}, Lo/ewo;->d()Lo/ewo;

    move-result-object v1

    iget-object v2, p0, Lo/ewu;->b:Landroid/content/Context;

    const/high16 v3, 0x40000000    # 2.0f

    invoke-virtual {v1, v2, v3}, Lo/ewo;->e(Landroid/content/Context;F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 182
    invoke-static {}, Lo/ewo;->d()Lo/ewo;

    move-result-object v0

    iget-object v1, p0, Lo/ewu;->b:Landroid/content/Context;

    const/high16 v2, 0x40800000    # 4.0f

    invoke-virtual {v0, v1, v2}, Lo/ewo;->e(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lo/ewu;->l:Landroid/graphics/Paint;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p1, v2, v3, v0, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 183
    return-void
.end method

.method public c()V
    .locals 4

    .line 386
    iget-object v0, p0, Lo/ewu;->A:Landroid/os/CountDownTimer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 387
    iget-object v0, p0, Lo/ewu;->A:Landroid/os/CountDownTimer;

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    .line 389
    :cond_0
    iget-object v0, p0, Lo/ewu;->C:Lo/ewu$b;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 390
    iget-object v0, p0, Lo/ewu;->C:Lo/ewu$b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ewu$b;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 391
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ewu;->C:Lo/ewu$b;

    .line 392
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TimeClockView threadStop"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 394
    :cond_1
    return-void
.end method

.method public c(IILandroid/widget/TextView;)V
    .locals 2

    .line 232
    iput-object p3, p0, Lo/ewu;->H:Landroid/widget/TextView;

    .line 233
    iget-object v0, p0, Lo/ewu;->H:Landroid/widget/TextView;

    const/high16 v1, 0x41900000    # 18.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 234
    if-le p1, p2, :cond_0

    return-void

    .line 235
    :cond_0
    int-to-float v0, p2

    const/high16 v1, 0x43b40000    # 360.0f

    div-float v0, v1, v0

    iput v0, p0, Lo/ewu;->h:F

    .line 236
    if-ne p1, p2, :cond_1

    .line 237
    iput p1, p0, Lo/ewu;->q:I

    .line 238
    int-to-float v0, p1

    const/high16 v1, 0x43b40000    # 360.0f

    mul-float/2addr v0, v1

    int-to-float v1, p2

    div-float/2addr v0, v1

    iput v0, p0, Lo/ewu;->k:F

    .line 239
    const/4 v0, 0x0

    iput v0, p0, Lo/ewu;->j:I

    goto :goto_0

    .line 241
    :cond_1
    sub-int v0, p2, p1

    iput v0, p0, Lo/ewu;->q:I

    .line 242
    sub-int v0, p2, p1

    int-to-float v0, v0

    const/high16 v1, 0x43b40000    # 360.0f

    mul-float/2addr v0, v1

    int-to-float v1, p2

    div-float/2addr v0, v1

    iput v0, p0, Lo/ewu;->k:F

    .line 243
    const/4 v0, 0x2

    iput v0, p0, Lo/ewu;->j:I

    .line 245
    :goto_0
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 147
    invoke-super {p0, p1}, Landroid/view/SurfaceView;->onDraw(Landroid/graphics/Canvas;)V

    .line 148
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 2

    .line 107
    invoke-super/range {p0 .. p5}, Landroid/view/SurfaceView;->onLayout(ZIIII)V

    .line 108
    iget-object v0, p0, Lo/ewu;->a:Landroid/view/SurfaceHolder;

    const/4 v1, -0x2

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->setFormat(I)V

    .line 109
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/ewu;->setZOrderOnTop(Z)V

    .line 110
    invoke-direct {p0}, Lo/ewu;->b()V

    .line 111
    return-void
.end method

.method protected onMeasure(II)V
    .locals 2

    .line 143
    invoke-direct {p0, p1}, Lo/ewu;->a(I)I

    move-result v0

    invoke-direct {p0, p2}, Lo/ewu;->a(I)I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lo/ewu;->setMeasuredDimension(II)V

    .line 144
    return-void
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 4

    .line 256
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TimeClockView surfaceChanged"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 257
    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 4

    .line 248
    new-instance v0, Lo/ewu$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/ewu$b;-><init>(Lo/ewu;Lo/ewu$5;)V

    iput-object v0, p0, Lo/ewu;->C:Lo/ewu$b;

    .line 249
    invoke-direct {p0}, Lo/ewu;->a()V

    .line 250
    invoke-direct {p0}, Lo/ewu;->i()V

    .line 251
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TimeClockView surfaceCreated"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 252
    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 4

    .line 261
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TimeClockView surfaceDestroyed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 262
    return-void
.end method
