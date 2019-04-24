.class public Lo/eph;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:F

.field private b:Lo/epr;

.field private c:I

.field private d:Z

.field private e:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eph;->d:Z

    return-void
.end method

.method static synthetic b(Lo/eph;)F
    .locals 1

    .line 12
    iget v0, p0, Lo/eph;->a:F

    return v0
.end method

.method static synthetic b(Lo/eph;Z)Z
    .locals 0

    .line 12
    iput-boolean p1, p0, Lo/eph;->d:Z

    return p1
.end method

.method static synthetic c(Lo/eph;F)F
    .locals 0

    .line 12
    iput p1, p0, Lo/eph;->a:F

    return p1
.end method

.method static synthetic c(Lo/eph;)Lo/epr;
    .locals 1

    .line 12
    iget-object v0, p0, Lo/eph;->b:Lo/epr;

    return-object v0
.end method

.method static synthetic d(Lo/eph;)I
    .locals 1

    .line 12
    iget v0, p0, Lo/eph;->c:I

    return v0
.end method


# virtual methods
.method public b(JLo/epr;I)V
    .locals 5

    .line 25
    const-string v0, "AntimationRunner"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startAntimation dru: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 26
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eph;->d:Z

    .line 27
    iput-object p3, p0, Lo/eph;->b:Lo/epr;

    .line 28
    iput-wide p1, p0, Lo/eph;->e:J

    .line 29
    iput p4, p0, Lo/eph;->c:I

    .line 32
    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v4

    .line 33
    invoke-virtual {v4, p1, p2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 34
    new-instance v0, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    invoke-virtual {v4, v0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 36
    new-instance v0, Lo/eph$1;

    invoke-direct {v0, p0}, Lo/eph$1;-><init>(Lo/eph;)V

    invoke-virtual {v4, v0}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 60
    new-instance v0, Lo/eph$2;

    invoke-direct {v0, p0}, Lo/eph$2;-><init>(Lo/eph;)V

    invoke-virtual {v4, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 72
    invoke-virtual {v4}, Landroid/animation/ValueAnimator;->start()V

    .line 74
    return-void

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public c()J
    .locals 2

    .line 83
    iget-wide v0, p0, Lo/eph;->e:J

    return-wide v0
.end method

.method public e()Z
    .locals 1

    .line 79
    iget-boolean v0, p0, Lo/eph;->d:Z

    return v0
.end method
