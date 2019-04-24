.class public Lo/cey;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:Ljava/lang/String;

.field private c:I

.field private d:I

.field private e:F

.field private f:F

.field private i:F

.field private k:F


# direct methods
.method public constructor <init>(Ljava/lang/String;IF)V
    .locals 6

    .line 27
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    const/4 v4, 0x1

    const/4 v5, 0x1

    invoke-direct/range {v0 .. v5}, Lo/cey;-><init>(Ljava/lang/String;IFII)V

    .line 28
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IFII)V
    .locals 1

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    const/4 v0, -0x1

    iput v0, p0, Lo/cey;->d:I

    .line 14
    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lo/cey;->e:F

    .line 15
    const/4 v0, 0x0

    iput v0, p0, Lo/cey;->f:F

    .line 16
    const/4 v0, 0x0

    iput v0, p0, Lo/cey;->k:F

    .line 17
    const/4 v0, 0x0

    iput v0, p0, Lo/cey;->i:F

    .line 32
    iput p4, p0, Lo/cey;->c:I

    .line 33
    iput-object p1, p0, Lo/cey;->b:Ljava/lang/String;

    .line 34
    iput p2, p0, Lo/cey;->d:I

    .line 35
    iput p3, p0, Lo/cey;->e:F

    .line 36
    iput p5, p0, Lo/cey;->a:I

    .line 37
    return-void
.end method


# virtual methods
.method public a()F
    .locals 1

    .line 66
    iget v0, p0, Lo/cey;->k:F

    return v0
.end method

.method public a(F)V
    .locals 0

    .line 78
    iput p1, p0, Lo/cey;->e:F

    .line 79
    return-void
.end method

.method public b()F
    .locals 1

    .line 53
    iget v0, p0, Lo/cey;->f:F

    return v0
.end method

.method public b(I)V
    .locals 0

    .line 74
    iput p1, p0, Lo/cey;->d:I

    .line 75
    return-void
.end method

.method public c()I
    .locals 1

    .line 58
    iget v0, p0, Lo/cey;->d:I

    return v0
.end method

.method public c(F)V
    .locals 2

    .line 44
    iput p1, p0, Lo/cey;->i:F

    .line 45
    iget v0, p0, Lo/cey;->k:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    iget v0, p0, Lo/cey;->i:F

    iget v1, p0, Lo/cey;->k:F

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    iget v0, p0, Lo/cey;->e:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 46
    iget v0, p0, Lo/cey;->i:F

    iget v1, p0, Lo/cey;->k:F

    sub-float/2addr v0, v1

    iget v1, p0, Lo/cey;->e:F

    div-float/2addr v0, v1

    iput v0, p0, Lo/cey;->f:F

    goto :goto_0

    .line 48
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lo/cey;->f:F

    .line 50
    :goto_0
    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 70
    iget-object v0, p0, Lo/cey;->b:Ljava/lang/String;

    return-object v0
.end method

.method public e()F
    .locals 1

    .line 62
    iget v0, p0, Lo/cey;->e:F

    return v0
.end method

.method public e(F)V
    .locals 0

    .line 40
    iput p1, p0, Lo/cey;->k:F

    .line 41
    return-void
.end method

.method public g()I
    .locals 1

    .line 82
    iget v0, p0, Lo/cey;->c:I

    return v0
.end method

.method public h()I
    .locals 1

    .line 86
    iget v0, p0, Lo/cey;->a:I

    return v0
.end method
