.class public Lo/byh;
.super Landroid/view/View;
.source "SourceFile"


# static fields
.field private static b:I

.field private static c:I


# instance fields
.field private a:Z

.field private e:Landroid/animation/ObjectAnimator;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 20
    const/16 v0, 0x12c

    sput v0, Lo/byh;->b:I

    .line 25
    const/16 v0, 0x1f4

    sput v0, Lo/byh;->c:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 35
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 31
    return-void
.end method

.method private a(Landroid/view/View;FFI)V
    .locals 3

    .line 50
    const-string v0, "Alpha"

    const/4 v1, 0x2

    new-array v1, v1, [F

    const/4 v2, 0x0

    aput p2, v1, v2

    const/4 v2, 0x1

    aput p3, v1, v2

    invoke-static {p1, v0, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Lo/byh;->e:Landroid/animation/ObjectAnimator;

    .line 51
    iget-object v0, p0, Lo/byh;->e:Landroid/animation/ObjectAnimator;

    int-to-long v1, p4

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 52
    iget-object v0, p0, Lo/byh;->e:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    .line 53
    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 56
    const-string v0, "CoachHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cancellAlphaAnimator"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    iget-object v0, p0, Lo/byh;->e:Landroid/animation/ObjectAnimator;

    if-nez v0, :cond_0

    .line 58
    return-void

    .line 60
    :cond_0
    iget-boolean v0, p0, Lo/byh;->a:Z

    if-eqz v0, :cond_1

    .line 61
    iget-object v0, p0, Lo/byh;->e:Landroid/animation/ObjectAnimator;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setCurrentPlayTime(J)V

    .line 62
    iget-object v0, p0, Lo/byh;->e:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->cancel()V

    .line 63
    const-string v0, "CoachHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mIsToBlack"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    :cond_1
    return-void
.end method

.method public d(Z)V
    .locals 3

    .line 39
    iput-boolean p1, p0, Lo/byh;->a:Z

    .line 40
    invoke-virtual {p0}, Lo/byh;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$color;->black:I

    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lo/byh;->setBackgroundColor(I)V

    .line 41
    if-eqz p1, :cond_0

    .line 42
    sget v0, Lo/byh;->c:I

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {p0, p0, v1, v2, v0}, Lo/byh;->a(Landroid/view/View;FFI)V

    goto :goto_0

    .line 45
    :cond_0
    sget v0, Lo/byh;->b:I

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    invoke-direct {p0, p0, v1, v2, v0}, Lo/byh;->a(Landroid/view/View;FFI)V

    .line 47
    :goto_0
    return-void
.end method
