.class public Lo/bwk;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bwk$c;
    }
.end annotation


# static fields
.field private static final G:I

.field private static final j:I


# instance fields
.field private A:I

.field private B:F

.field private C:I

.field private D:F

.field private E:I

.field private F:Landroid/graphics/Paint;

.field private H:Z

.field private I:Landroid/graphics/RectF;

.field private K:Lo/bwk$c;

.field private L:I

.field private N:Z

.field private a:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<Lo/bwk;Ljava/lang/Float;>;"
        }
    .end annotation
.end field

.field private b:Landroid/animation/ObjectAnimator;

.field private c:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<Lo/bwk;Ljava/lang/Float;>;"
        }
    .end annotation
.end field

.field private d:Landroid/animation/ObjectAnimator;

.field private e:Landroid/animation/ObjectAnimator;

.field private f:I

.field private g:Landroid/view/GestureDetector$SimpleOnGestureListener;

.field private h:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<Lo/bwk;Ljava/lang/Float;>;"
        }
    .end annotation
.end field

.field private i:Landroid/view/GestureDetector;

.field private k:I

.field private l:F

.field private m:I

.field private n:I

.field private o:I

.field private p:I

.field private q:Landroid/graphics/RectF;

.field private r:F

.field private s:F

.field private t:F

.field private u:F

.field private v:F

.field private w:Z

.field private x:Z

.field private y:Z

.field private z:Landroid/graphics/RectF;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 169
    const-string v0, "#95AAB3"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lo/bwk;->j:I

    .line 171
    const-string v0, "#FFFFFF"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lo/bwk;->G:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 187
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/bwk;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 188
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 191
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lo/bwk;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 192
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .line 195
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 30
    new-instance v0, Lo/bwk$2;

    const-class v1, Ljava/lang/Float;

    const-string v2, "innerBound"

    invoke-direct {v0, p0, v1, v2}, Lo/bwk$2;-><init>(Lo/bwk;Ljava/lang/Class;Ljava/lang/String;)V

    iput-object v0, p0, Lo/bwk;->c:Landroid/util/Property;

    .line 43
    new-instance v0, Lo/bwk$4;

    const-class v1, Ljava/lang/Float;

    const-string v2, "knobExpand"

    invoke-direct {v0, p0, v1, v2}, Lo/bwk$4;-><init>(Lo/bwk;Ljava/lang/Class;Ljava/lang/String;)V

    iput-object v0, p0, Lo/bwk;->a:Landroid/util/Property;

    .line 56
    new-instance v0, Lo/bwk$5;

    const-class v1, Ljava/lang/Float;

    const-string v2, "knobMove"

    invoke-direct {v0, p0, v1, v2}, Lo/bwk$5;-><init>(Lo/bwk;Ljava/lang/Class;Ljava/lang/String;)V

    iput-object v0, p0, Lo/bwk;->h:Landroid/util/Property;

    .line 69
    new-instance v0, Lo/bwk$1;

    invoke-direct {v0, p0}, Lo/bwk$1;-><init>(Lo/bwk;)V

    iput-object v0, p0, Lo/bwk;->g:Landroid/view/GestureDetector$SimpleOnGestureListener;

    .line 161
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lo/bwk;->v:F

    .line 165
    const-string v0, "#00CCFF"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/bwk;->C:I

    .line 170
    sget v0, Lo/bwk;->j:I

    iput v0, p0, Lo/bwk;->E:I

    .line 176
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bwk;->H:Z

    .line 177
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bwk;->N:Z

    .line 178
    const/4 v0, 0x4

    iput v0, p0, Lo/bwk;->L:I

    .line 197
    iget v0, p0, Lo/bwk;->C:I

    iput v0, p0, Lo/bwk;->A:I

    .line 198
    const/4 v0, 0x0

    iput v0, p0, Lo/bwk;->m:I

    .line 200
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lo/bwk;->q:Landroid/graphics/RectF;

    .line 201
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lo/bwk;->z:Landroid/graphics/RectF;

    .line 202
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lo/bwk;->I:Landroid/graphics/RectF;

    .line 203
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/bwk;->F:Landroid/graphics/Paint;

    .line 204
    new-instance v0, Landroid/view/GestureDetector;

    iget-object v1, p0, Lo/bwk;->g:Landroid/view/GestureDetector$SimpleOnGestureListener;

    invoke-direct {v0, p1, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lo/bwk;->i:Landroid/view/GestureDetector;

    .line 205
    iget-object v0, p0, Lo/bwk;->i:Landroid/view/GestureDetector;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/GestureDetector;->setIsLongpressEnabled(Z)V

    .line 207
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 208
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lo/bwk;->setLayerType(ILandroid/graphics/Paint;)V

    .line 211
    :cond_0
    iget-object v0, p0, Lo/bwk;->c:Landroid/util/Property;

    const/4 v1, 0x2

    new-array v1, v1, [F

    iget v2, p0, Lo/bwk;->v:F

    const/4 v3, 0x0

    aput v2, v1, v3

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x1

    aput v2, v1, v3

    invoke-static {p0, v0, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Lo/bwk;->e:Landroid/animation/ObjectAnimator;

    .line 212
    iget-object v0, p0, Lo/bwk;->e:Landroid/animation/ObjectAnimator;

    const-wide/16 v1, 0x12c

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 213
    iget-object v0, p0, Lo/bwk;->e:Landroid/animation/ObjectAnimator;

    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 215
    iget-object v0, p0, Lo/bwk;->a:Landroid/util/Property;

    const/4 v1, 0x2

    new-array v1, v1, [F

    iget v2, p0, Lo/bwk;->t:F

    const/4 v3, 0x0

    aput v2, v1, v3

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x1

    aput v2, v1, v3

    invoke-static {p0, v0, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Lo/bwk;->b:Landroid/animation/ObjectAnimator;

    .line 216
    iget-object v0, p0, Lo/bwk;->b:Landroid/animation/ObjectAnimator;

    const-wide/16 v1, 0x12c

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 217
    iget-object v0, p0, Lo/bwk;->b:Landroid/animation/ObjectAnimator;

    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 219
    iget-object v0, p0, Lo/bwk;->h:Landroid/util/Property;

    const/4 v1, 0x2

    new-array v1, v1, [F

    iget v2, p0, Lo/bwk;->u:F

    const/4 v3, 0x0

    aput v2, v1, v3

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x1

    aput v2, v1, v3

    invoke-static {p0, v0, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Lo/bwk;->d:Landroid/animation/ObjectAnimator;

    .line 220
    iget-object v0, p0, Lo/bwk;->d:Landroid/animation/ObjectAnimator;

    const-wide/16 v1, 0x12c

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 221
    iget-object v0, p0, Lo/bwk;->d:Landroid/animation/ObjectAnimator;

    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 222
    return-void
.end method

.method static synthetic a(Lo/bwk;)F
    .locals 1

    .line 25
    iget v0, p0, Lo/bwk;->v:F

    return v0
.end method

.method private a(FFFFFLandroid/graphics/Canvas;Landroid/graphics/Paint;)V
    .locals 1

    .line 505
    iget-object v0, p0, Lo/bwk;->I:Landroid/graphics/RectF;

    iput p1, v0, Landroid/graphics/RectF;->left:F

    .line 506
    iget-object v0, p0, Lo/bwk;->I:Landroid/graphics/RectF;

    iput p2, v0, Landroid/graphics/RectF;->top:F

    .line 507
    iget-object v0, p0, Lo/bwk;->I:Landroid/graphics/RectF;

    iput p3, v0, Landroid/graphics/RectF;->right:F

    .line 508
    iget-object v0, p0, Lo/bwk;->I:Landroid/graphics/RectF;

    iput p4, v0, Landroid/graphics/RectF;->bottom:F

    .line 510
    iget-object v0, p0, Lo/bwk;->I:Landroid/graphics/RectF;

    invoke-virtual {p6, v0, p5, p5, p7}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 511
    return-void
.end method

.method static synthetic a(Lo/bwk;Z)Z
    .locals 0

    .line 25
    iput-boolean p1, p0, Lo/bwk;->w:Z

    return p1
.end method

.method static synthetic b(Lo/bwk;)Z
    .locals 1

    .line 25
    iget-boolean v0, p0, Lo/bwk;->x:Z

    return v0
.end method

.method static synthetic b(Lo/bwk;Z)Z
    .locals 0

    .line 25
    iput-boolean p1, p0, Lo/bwk;->y:Z

    return p1
.end method

.method private c(FII)I
    .locals 12

    .line 516
    shr-int/lit8 v0, p2, 0x10

    and-int/lit16 v3, v0, 0xff

    .line 517
    shr-int/lit8 v0, p2, 0x8

    and-int/lit16 v4, v0, 0xff

    .line 518
    and-int/lit16 v5, p2, 0xff

    .line 520
    shr-int/lit8 v0, p3, 0x10

    and-int/lit16 v6, v0, 0xff

    .line 521
    shr-int/lit8 v0, p3, 0x8

    and-int/lit16 v7, v0, 0xff

    .line 522
    and-int/lit16 v8, p3, 0xff

    .line 524
    sub-int v0, v6, v3

    int-to-float v0, v0

    mul-float/2addr v0, p1

    float-to-int v9, v0

    .line 525
    sub-int v0, v7, v4

    int-to-float v0, v0

    mul-float/2addr v0, p1

    float-to-int v10, v0

    .line 526
    sub-int v0, v8, v5

    int-to-float v0, v0

    mul-float/2addr v0, p1

    float-to-int v11, v0

    .line 528
    add-int v0, v3, v9

    shl-int/lit8 v0, v0, 0x10

    const/high16 v1, -0x1000000

    or-int/2addr v0, v1

    add-int v1, v4, v10

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    add-int v1, v5, v11

    or-int/2addr v0, v1

    return v0
.end method

.method static synthetic c(Lo/bwk;)Landroid/animation/ObjectAnimator;
    .locals 1

    .line 25
    iget-object v0, p0, Lo/bwk;->b:Landroid/animation/ObjectAnimator;

    return-object v0
.end method

.method static synthetic c(Lo/bwk;Z)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lo/bwk;->d(Z)V

    return-void
.end method

.method static synthetic d(Lo/bwk;)F
    .locals 1

    .line 25
    iget v0, p0, Lo/bwk;->t:F

    return v0
.end method

.method private d(Z)V
    .locals 4

    .line 283
    if-eqz p1, :cond_0

    .line 285
    iget-object v0, p0, Lo/bwk;->d:Landroid/animation/ObjectAnimator;

    const/4 v1, 0x2

    new-array v1, v1, [F

    iget v2, p0, Lo/bwk;->u:F

    const/4 v3, 0x0

    aput v2, v1, v3

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x1

    aput v2, v1, v3

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->setFloatValues([F)V

    .line 286
    iget-object v0, p0, Lo/bwk;->d:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    .line 288
    iget-object v0, p0, Lo/bwk;->e:Landroid/animation/ObjectAnimator;

    const/4 v1, 0x2

    new-array v1, v1, [F

    iget v2, p0, Lo/bwk;->v:F

    const/4 v3, 0x0

    aput v2, v1, v3

    const/4 v2, 0x0

    const/4 v3, 0x1

    aput v2, v1, v3

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->setFloatValues([F)V

    .line 289
    iget-object v0, p0, Lo/bwk;->e:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    goto :goto_0

    .line 292
    :cond_0
    iget-object v0, p0, Lo/bwk;->d:Landroid/animation/ObjectAnimator;

    const/4 v1, 0x2

    new-array v1, v1, [F

    iget v2, p0, Lo/bwk;->u:F

    const/4 v3, 0x0

    aput v2, v1, v3

    const/4 v2, 0x0

    const/4 v3, 0x1

    aput v2, v1, v3

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->setFloatValues([F)V

    .line 293
    iget-object v0, p0, Lo/bwk;->d:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    .line 295
    iget-object v0, p0, Lo/bwk;->e:Landroid/animation/ObjectAnimator;

    const/4 v1, 0x2

    new-array v1, v1, [F

    iget v2, p0, Lo/bwk;->v:F

    const/4 v3, 0x0

    aput v2, v1, v3

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x1

    aput v2, v1, v3

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->setFloatValues([F)V

    .line 296
    iget-object v0, p0, Lo/bwk;->e:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    .line 298
    :goto_0
    return-void
.end method

.method static synthetic d(Lo/bwk;Z)Z
    .locals 0

    .line 25
    iput-boolean p1, p0, Lo/bwk;->x:Z

    return p1
.end method

.method static synthetic e(Lo/bwk;)Landroid/animation/ObjectAnimator;
    .locals 1

    .line 25
    iget-object v0, p0, Lo/bwk;->e:Landroid/animation/ObjectAnimator;

    return-object v0
.end method

.method static synthetic f(Lo/bwk;)I
    .locals 1

    .line 25
    iget v0, p0, Lo/bwk;->p:I

    return v0
.end method

.method static synthetic g(Lo/bwk;)Lo/bwk$c;
    .locals 1

    .line 25
    iget-object v0, p0, Lo/bwk;->K:Lo/bwk$c;

    return-object v0
.end method

.method static synthetic h(Lo/bwk;)F
    .locals 1

    .line 25
    iget v0, p0, Lo/bwk;->u:F

    return v0
.end method

.method static synthetic i(Lo/bwk;)Z
    .locals 1

    .line 25
    iget-boolean v0, p0, Lo/bwk;->y:Z

    return v0
.end method

.method static synthetic k(Lo/bwk;)Z
    .locals 1

    .line 25
    iget-boolean v0, p0, Lo/bwk;->w:Z

    return v0
.end method

.method static synthetic p(Lo/bwk;)Landroid/animation/ObjectAnimator;
    .locals 1

    .line 25
    iget-object v0, p0, Lo/bwk;->d:Landroid/animation/ObjectAnimator;

    return-object v0
.end method


# virtual methods
.method public b(Z)Lo/bwk;
    .locals 1

    .line 353
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lo/bwk;->setOn(ZZ)V

    .line 354
    return-object p0
.end method

.method getInnerContentRate()F
    .locals 1

    .line 239
    iget v0, p0, Lo/bwk;->v:F

    return v0
.end method

.method getKnobExpandRate()F
    .locals 1

    .line 249
    iget v0, p0, Lo/bwk;->t:F

    return v0
.end method

.method getKnobMoveRate()F
    .locals 1

    .line 259
    iget v0, p0, Lo/bwk;->u:F

    return v0
.end method

.method public getOnSwitchStateChangeListener()Lo/bwk$c;
    .locals 1

    .line 229
    iget-object v0, p0, Lo/bwk;->K:Lo/bwk$c;

    return-object v0
.end method

.method public getTintColor()I
    .locals 1

    .line 401
    iget v0, p0, Lo/bwk;->C:I

    return v0
.end method

.method protected onAttachedToWindow()V
    .locals 4

    .line 264
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 265
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bwk;->N:Z

    .line 267
    iget-boolean v0, p0, Lo/bwk;->H:Z

    if-eqz v0, :cond_1

    .line 268
    iget-boolean v0, p0, Lo/bwk;->x:Z

    iput-boolean v0, p0, Lo/bwk;->y:Z

    .line 269
    iget-boolean v0, p0, Lo/bwk;->y:Z

    invoke-direct {p0, v0}, Lo/bwk;->d(Z)V

    .line 271
    iget-object v0, p0, Lo/bwk;->b:Landroid/animation/ObjectAnimator;

    const/4 v1, 0x2

    new-array v1, v1, [F

    iget v2, p0, Lo/bwk;->t:F

    const/4 v3, 0x0

    aput v2, v1, v3

    const/4 v2, 0x0

    const/4 v3, 0x1

    aput v2, v1, v3

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->setFloatValues([F)V

    .line 272
    iget-object v0, p0, Lo/bwk;->b:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    .line 274
    iget-object v0, p0, Lo/bwk;->K:Lo/bwk$c;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lo/bwk;->x:Z

    iget-boolean v1, p0, Lo/bwk;->w:Z

    if-eq v0, v1, :cond_0

    .line 275
    iget-object v0, p0, Lo/bwk;->K:Lo/bwk$c;

    iget-boolean v1, p0, Lo/bwk;->x:Z

    invoke-interface {v0, p0, v1}, Lo/bwk$c;->d(Landroid/view/View;Z)V

    .line 278
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bwk;->H:Z

    .line 280
    :cond_1
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .line 302
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 303
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bwk;->N:Z

    .line 304
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 12

    .line 453
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 456
    iget v0, p0, Lo/bwk;->D:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget v1, p0, Lo/bwk;->v:F

    mul-float v8, v0, v1

    .line 457
    iget v0, p0, Lo/bwk;->B:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget v1, p0, Lo/bwk;->v:F

    mul-float v9, v0, v1

    .line 459
    iget-object v0, p0, Lo/bwk;->z:Landroid/graphics/RectF;

    iget v1, p0, Lo/bwk;->p:I

    int-to-float v1, v1

    sub-float/2addr v1, v8

    iput v1, v0, Landroid/graphics/RectF;->left:F

    .line 460
    iget-object v0, p0, Lo/bwk;->z:Landroid/graphics/RectF;

    iget v1, p0, Lo/bwk;->n:I

    int-to-float v1, v1

    sub-float/2addr v1, v9

    iput v1, v0, Landroid/graphics/RectF;->top:F

    .line 461
    iget-object v0, p0, Lo/bwk;->z:Landroid/graphics/RectF;

    iget v1, p0, Lo/bwk;->p:I

    int-to-float v1, v1

    add-float/2addr v1, v8

    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 462
    iget-object v0, p0, Lo/bwk;->z:Landroid/graphics/RectF;

    iget v1, p0, Lo/bwk;->n:I

    int-to-float v1, v1

    add-float/2addr v1, v9

    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 466
    iget v0, p0, Lo/bwk;->s:F

    iget v1, p0, Lo/bwk;->r:F

    iget v2, p0, Lo/bwk;->s:F

    sub-float/2addr v1, v2

    iget v2, p0, Lo/bwk;->t:F

    mul-float/2addr v1, v2

    add-float v8, v0, v1

    .line 468
    iget-object v0, p0, Lo/bwk;->q:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->left:F

    iget-object v1, p0, Lo/bwk;->q:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    add-float/2addr v0, v1

    iget v1, p0, Lo/bwk;->p:I

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    const/4 v10, 0x1

    goto :goto_0

    :cond_0
    const/4 v10, 0x0

    .line 470
    :goto_0
    if-eqz v10, :cond_1

    .line 471
    iget-object v0, p0, Lo/bwk;->q:Landroid/graphics/RectF;

    iget-object v1, p0, Lo/bwk;->q:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->right:F

    sub-float/2addr v1, v8

    iput v1, v0, Landroid/graphics/RectF;->left:F

    goto :goto_1

    .line 473
    :cond_1
    iget-object v0, p0, Lo/bwk;->q:Landroid/graphics/RectF;

    iget-object v1, p0, Lo/bwk;->q:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->left:F

    add-float/2addr v1, v8

    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 478
    :goto_1
    iget-object v0, p0, Lo/bwk;->q:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v11

    .line 479
    iget v0, p0, Lo/bwk;->k:I

    int-to-float v0, v0

    sub-float/2addr v0, v11

    iget v1, p0, Lo/bwk;->m:I

    iget v2, p0, Lo/bwk;->L:I

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    sub-float/2addr v0, v1

    iget v1, p0, Lo/bwk;->u:F

    mul-float v8, v0, v1

    .line 482
    iget v0, p0, Lo/bwk;->C:I

    iput v0, p0, Lo/bwk;->E:I

    .line 483
    iget-object v0, p0, Lo/bwk;->q:Landroid/graphics/RectF;

    iget v1, p0, Lo/bwk;->m:I

    iget v2, p0, Lo/bwk;->L:I

    add-int/2addr v1, v2

    int-to-float v1, v1

    add-float/2addr v1, v8

    iput v1, v0, Landroid/graphics/RectF;->left:F

    .line 484
    iget-object v0, p0, Lo/bwk;->q:Landroid/graphics/RectF;

    iget-object v1, p0, Lo/bwk;->q:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->left:F

    add-float/2addr v1, v11

    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 487
    iget-object v0, p0, Lo/bwk;->F:Landroid/graphics/Paint;

    iget v1, p0, Lo/bwk;->E:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 488
    iget-object v0, p0, Lo/bwk;->F:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 490
    move-object v0, p0

    iget v1, p0, Lo/bwk;->m:I

    int-to-float v1, v1

    iget v2, p0, Lo/bwk;->m:I

    int-to-float v2, v2

    iget v3, p0, Lo/bwk;->k:I

    iget v4, p0, Lo/bwk;->m:I

    sub-int/2addr v3, v4

    int-to-float v3, v3

    iget v4, p0, Lo/bwk;->f:I

    iget v5, p0, Lo/bwk;->m:I

    sub-int/2addr v4, v5

    int-to-float v4, v4

    iget v5, p0, Lo/bwk;->l:F

    move-object v6, p1

    iget-object v7, p0, Lo/bwk;->F:Landroid/graphics/Paint;

    invoke-direct/range {v0 .. v7}, Lo/bwk;->a(FFFFFLandroid/graphics/Canvas;Landroid/graphics/Paint;)V

    .line 493
    iget-object v0, p0, Lo/bwk;->F:Landroid/graphics/Paint;

    sget v1, Lo/bwk;->j:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 494
    iget-object v0, p0, Lo/bwk;->z:Landroid/graphics/RectF;

    iget-object v1, p0, Lo/bwk;->z:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    iget-object v2, p0, Lo/bwk;->z:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    iget-object v3, p0, Lo/bwk;->F:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 495
    iget-object v0, p0, Lo/bwk;->F:Landroid/graphics/Paint;

    iget v1, p0, Lo/bwk;->m:I

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    invoke-virtual {p0}, Lo/bwk;->isEnabled()Z

    move-result v2

    if-eqz v2, :cond_2

    const/high16 v2, 0x20000000

    goto :goto_2

    :cond_2
    const/high16 v2, 0x10000000

    :goto_2
    const/high16 v3, 0x40000000    # 2.0f

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4, v1, v2}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 497
    iget-object v0, p0, Lo/bwk;->F:Landroid/graphics/Paint;

    sget v1, Lo/bwk;->G:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 498
    iget-object v0, p0, Lo/bwk;->q:Landroid/graphics/RectF;

    iget v1, p0, Lo/bwk;->l:F

    iget v2, p0, Lo/bwk;->o:I

    int-to-float v2, v2

    sub-float/2addr v1, v2

    iget v2, p0, Lo/bwk;->l:F

    iget v3, p0, Lo/bwk;->o:I

    int-to-float v3, v3

    sub-float/2addr v2, v3

    iget-object v3, p0, Lo/bwk;->F:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 499
    iget-object v0, p0, Lo/bwk;->F:Landroid/graphics/Paint;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 501
    return-void
.end method

.method protected onMeasure(II)V
    .locals 3

    .line 308
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 310
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    iput v0, p0, Lo/bwk;->k:I

    .line 311
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    iput v0, p0, Lo/bwk;->f:I

    .line 314
    iget v0, p0, Lo/bwk;->f:I

    int-to-float v0, v0

    iget v1, p0, Lo/bwk;->k:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    const v1, 0x3eaaaa3b    # 0.33333f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 315
    iget v0, p0, Lo/bwk;->k:I

    int-to-float v0, v0

    const v1, 0x3eaaaa3b    # 0.33333f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lo/bwk;->f:I

    .line 317
    iget v0, p0, Lo/bwk;->k:I

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    .line 318
    iget v0, p0, Lo/bwk;->f:I

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 320
    invoke-super {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 323
    :cond_0
    iget v0, p0, Lo/bwk;->k:I

    div-int/lit8 v0, v0, 0x2

    iput v0, p0, Lo/bwk;->p:I

    .line 324
    iget v0, p0, Lo/bwk;->f:I

    div-int/lit8 v0, v0, 0x2

    iput v0, p0, Lo/bwk;->n:I

    .line 326
    iget v0, p0, Lo/bwk;->n:I

    iget v1, p0, Lo/bwk;->m:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    iput v0, p0, Lo/bwk;->l:F

    .line 328
    iget-object v0, p0, Lo/bwk;->z:Landroid/graphics/RectF;

    iget v1, p0, Lo/bwk;->o:I

    iget v2, p0, Lo/bwk;->m:I

    add-int/2addr v1, v2

    int-to-float v1, v1

    iput v1, v0, Landroid/graphics/RectF;->left:F

    .line 329
    iget-object v0, p0, Lo/bwk;->z:Landroid/graphics/RectF;

    iget v1, p0, Lo/bwk;->o:I

    iget v2, p0, Lo/bwk;->m:I

    add-int/2addr v1, v2

    int-to-float v1, v1

    iput v1, v0, Landroid/graphics/RectF;->top:F

    .line 330
    iget-object v0, p0, Lo/bwk;->z:Landroid/graphics/RectF;

    iget v1, p0, Lo/bwk;->k:I

    iget v2, p0, Lo/bwk;->o:I

    sub-int/2addr v1, v2

    iget v2, p0, Lo/bwk;->m:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 331
    iget-object v0, p0, Lo/bwk;->z:Landroid/graphics/RectF;

    iget v1, p0, Lo/bwk;->f:I

    iget v2, p0, Lo/bwk;->o:I

    sub-int/2addr v1, v2

    iget v2, p0, Lo/bwk;->m:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 333
    iget-object v0, p0, Lo/bwk;->z:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    iput v0, p0, Lo/bwk;->D:F

    .line 334
    iget-object v0, p0, Lo/bwk;->z:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    iput v0, p0, Lo/bwk;->B:F

    .line 336
    iget-object v0, p0, Lo/bwk;->q:Landroid/graphics/RectF;

    iget v1, p0, Lo/bwk;->L:I

    iget v2, p0, Lo/bwk;->m:I

    add-int/2addr v1, v2

    int-to-float v1, v1

    iput v1, v0, Landroid/graphics/RectF;->left:F

    .line 337
    iget-object v0, p0, Lo/bwk;->q:Landroid/graphics/RectF;

    iget v1, p0, Lo/bwk;->L:I

    iget v2, p0, Lo/bwk;->m:I

    add-int/2addr v1, v2

    int-to-float v1, v1

    iput v1, v0, Landroid/graphics/RectF;->top:F

    .line 338
    iget-object v0, p0, Lo/bwk;->q:Landroid/graphics/RectF;

    iget v1, p0, Lo/bwk;->f:I

    iget v2, p0, Lo/bwk;->L:I

    sub-int/2addr v1, v2

    iget v2, p0, Lo/bwk;->m:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 339
    iget-object v0, p0, Lo/bwk;->q:Landroid/graphics/RectF;

    iget v1, p0, Lo/bwk;->f:I

    iget v2, p0, Lo/bwk;->L:I

    sub-int/2addr v1, v2

    iget v2, p0, Lo/bwk;->m:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 341
    iget-object v0, p0, Lo/bwk;->q:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    iput v0, p0, Lo/bwk;->s:F

    .line 342
    iget v0, p0, Lo/bwk;->k:I

    int-to-float v0, v0

    const v1, 0x3f333333    # 0.7f

    mul-float/2addr v0, v1

    iput v0, p0, Lo/bwk;->r:F

    .line 343
    iget v0, p0, Lo/bwk;->r:F

    iget-object v1, p0, Lo/bwk;->q:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v1

    const/high16 v2, 0x3fa00000    # 1.25f

    mul-float/2addr v1, v2

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 344
    iget-object v0, p0, Lo/bwk;->q:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    const/high16 v1, 0x3fa00000    # 1.25f

    mul-float/2addr v0, v1

    iput v0, p0, Lo/bwk;->r:F

    .line 346
    :cond_1
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 407
    invoke-virtual {p0}, Lo/bwk;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 409
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 412
    :sswitch_0
    iget-boolean v0, p0, Lo/bwk;->y:Z

    if-nez v0, :cond_1

    .line 413
    iget-object v0, p0, Lo/bwk;->c:Landroid/util/Property;

    const/4 v1, 0x2

    new-array v1, v1, [F

    iget v2, p0, Lo/bwk;->v:F

    const/4 v3, 0x0

    aput v2, v1, v3

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x1

    aput v2, v1, v3

    invoke-static {p0, v0, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Lo/bwk;->e:Landroid/animation/ObjectAnimator;

    .line 414
    iget-object v0, p0, Lo/bwk;->e:Landroid/animation/ObjectAnimator;

    const-wide/16 v1, 0x12c

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 415
    iget-object v0, p0, Lo/bwk;->e:Landroid/animation/ObjectAnimator;

    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 417
    iget-object v0, p0, Lo/bwk;->e:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    .line 420
    :cond_1
    iget-object v0, p0, Lo/bwk;->a:Landroid/util/Property;

    const/4 v1, 0x2

    new-array v1, v1, [F

    iget v2, p0, Lo/bwk;->t:F

    const/4 v3, 0x0

    aput v2, v1, v3

    const/4 v2, 0x0

    const/4 v3, 0x1

    aput v2, v1, v3

    invoke-static {p0, v0, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Lo/bwk;->b:Landroid/animation/ObjectAnimator;

    .line 421
    iget-object v0, p0, Lo/bwk;->b:Landroid/animation/ObjectAnimator;

    const-wide/16 v1, 0x12c

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 422
    iget-object v0, p0, Lo/bwk;->b:Landroid/animation/ObjectAnimator;

    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 424
    iget-object v0, p0, Lo/bwk;->b:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    .line 426
    iget-boolean v0, p0, Lo/bwk;->y:Z

    iput-boolean v0, p0, Lo/bwk;->x:Z

    .line 428
    iget-object v0, p0, Lo/bwk;->K:Lo/bwk$c;

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lo/bwk;->x:Z

    iget-boolean v1, p0, Lo/bwk;->w:Z

    if-eq v0, v1, :cond_2

    .line 429
    iget-object v0, p0, Lo/bwk;->K:Lo/bwk$c;

    iget-boolean v1, p0, Lo/bwk;->x:Z

    invoke-interface {v0, p0, v1}, Lo/bwk$c;->d(Landroid/view/View;Z)V

    .line 437
    :cond_2
    :goto_0
    iget-object v0, p0, Lo/bwk;->i:Landroid/view/GestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x3 -> :sswitch_0
    .end sparse-switch
.end method

.method public setEnabled(Z)V
    .locals 3

    .line 442
    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 444
    if-eqz p1, :cond_0

    .line 445
    iget v0, p0, Lo/bwk;->A:I

    iput v0, p0, Lo/bwk;->C:I

    goto :goto_0

    .line 447
    :cond_0
    iget v0, p0, Lo/bwk;->A:I

    const/high16 v1, 0x3f000000    # 0.5f

    const/4 v2, -0x1

    invoke-direct {p0, v1, v0, v2}, Lo/bwk;->c(FII)I

    move-result v0

    iput v0, p0, Lo/bwk;->C:I

    .line 449
    :goto_0
    return-void
.end method

.method setInnerContentRate(F)V
    .locals 0

    .line 233
    iput p1, p0, Lo/bwk;->v:F

    .line 235
    invoke-virtual {p0}, Lo/bwk;->invalidate()V

    .line 236
    return-void
.end method

.method setKnobExpandRate(F)V
    .locals 0

    .line 243
    iput p1, p0, Lo/bwk;->t:F

    .line 245
    invoke-virtual {p0}, Lo/bwk;->invalidate()V

    .line 246
    return-void
.end method

.method setKnobMoveRate(F)V
    .locals 0

    .line 253
    iput p1, p0, Lo/bwk;->u:F

    .line 255
    invoke-virtual {p0}, Lo/bwk;->invalidate()V

    .line 256
    return-void
.end method

.method public setOn(ZZ)V
    .locals 4

    .line 359
    iget-boolean v0, p0, Lo/bwk;->x:Z

    if-ne v0, p1, :cond_0

    return-void

    .line 361
    :cond_0
    iget-boolean v0, p0, Lo/bwk;->N:Z

    if-nez v0, :cond_1

    if-eqz p2, :cond_1

    .line 362
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bwk;->H:Z

    .line 363
    iput-boolean p1, p0, Lo/bwk;->x:Z

    .line 365
    return-void

    .line 368
    :cond_1
    iput-boolean p1, p0, Lo/bwk;->x:Z

    .line 369
    iget-boolean v0, p0, Lo/bwk;->x:Z

    iput-boolean v0, p0, Lo/bwk;->y:Z

    .line 371
    if-nez p2, :cond_3

    .line 373
    if-eqz p1, :cond_2

    .line 374
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0}, Lo/bwk;->setKnobMoveRate(F)V

    .line 375
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/bwk;->setInnerContentRate(F)V

    goto :goto_0

    .line 377
    :cond_2
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/bwk;->setKnobMoveRate(F)V

    .line 378
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0}, Lo/bwk;->setInnerContentRate(F)V

    .line 381
    :goto_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/bwk;->setKnobExpandRate(F)V

    goto :goto_1

    .line 384
    :cond_3
    iget-boolean v0, p0, Lo/bwk;->y:Z

    invoke-direct {p0, v0}, Lo/bwk;->d(Z)V

    .line 386
    iget-object v0, p0, Lo/bwk;->b:Landroid/animation/ObjectAnimator;

    const/4 v1, 0x2

    new-array v1, v1, [F

    iget v2, p0, Lo/bwk;->t:F

    const/4 v3, 0x0

    aput v2, v1, v3

    const/4 v2, 0x0

    const/4 v3, 0x1

    aput v2, v1, v3

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->setFloatValues([F)V

    .line 387
    iget-object v0, p0, Lo/bwk;->b:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    .line 390
    :goto_1
    iget-object v0, p0, Lo/bwk;->K:Lo/bwk$c;

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lo/bwk;->x:Z

    iget-boolean v1, p0, Lo/bwk;->w:Z

    if-eq v0, v1, :cond_4

    .line 391
    iget-object v0, p0, Lo/bwk;->K:Lo/bwk$c;

    iget-boolean v1, p0, Lo/bwk;->x:Z

    invoke-interface {v0, p0, v1}, Lo/bwk$c;->d(Landroid/view/View;Z)V

    .line 393
    :cond_4
    return-void
.end method

.method public setOnSwitchStateChangeListener(Lo/bwk$c;)V
    .locals 0

    .line 225
    iput-object p1, p0, Lo/bwk;->K:Lo/bwk$c;

    .line 226
    return-void
.end method

.method public setTintColor(I)V
    .locals 1

    .line 396
    iput p1, p0, Lo/bwk;->C:I

    .line 397
    iget v0, p0, Lo/bwk;->C:I

    iput v0, p0, Lo/bwk;->A:I

    .line 398
    return-void
.end method
