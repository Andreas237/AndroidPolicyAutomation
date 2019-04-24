.class public Lo/chr;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:F

.field private b:Ljava/lang/String;

.field private c:F

.field private d:F

.field private e:Landroid/graphics/PointF;

.field private f:F

.field private g:F

.field private h:F

.field private i:Ljava/lang/String;

.field private k:I

.field private m:Ljava/lang/String;


# direct methods
.method private constructor <init>(FFLjava/lang/String;Ljava/lang/String;I)V
    .locals 3

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lo/chr;->e:Landroid/graphics/PointF;

    .line 43
    iput p2, p0, Lo/chr;->f:F

    .line 44
    iput p1, p0, Lo/chr;->h:F

    .line 45
    sub-float v0, p2, p1

    iput v0, p0, Lo/chr;->g:F

    iput v0, p0, Lo/chr;->d:F

    .line 46
    iput-object p4, p0, Lo/chr;->i:Ljava/lang/String;

    .line 47
    iget-object v0, p0, Lo/chr;->e:Landroid/graphics/PointF;

    iget v1, p0, Lo/chr;->h:F

    iput v1, v0, Landroid/graphics/PointF;->y:F

    .line 48
    iput-object p3, p0, Lo/chr;->m:Ljava/lang/String;

    .line 49
    iput p5, p0, Lo/chr;->k:I

    .line 50
    new-instance v0, Ljava/text/DecimalFormat;

    const-string v1, "##"

    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lo/chr;->d:F

    float-to-double v1, v1

    invoke-virtual {v0, v1, v2}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/chr;->b:Ljava/lang/String;

    .line 51
    return-void
.end method

.method public constructor <init>(FLjava/lang/String;)V
    .locals 1

    .line 34
    const-string v0, ""

    invoke-direct {p0, p1, v0, p2}, Lo/chr;-><init>(FLjava/lang/String;Ljava/lang/String;)V

    .line 35
    return-void
.end method

.method private constructor <init>(FLjava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 38
    move-object v0, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    const/4 v1, 0x0

    const v5, -0x777778

    invoke-direct/range {v0 .. v5}, Lo/chr;-><init>(FFLjava/lang/String;Ljava/lang/String;I)V

    .line 39
    return-void
.end method

.method private f()F
    .locals 3

    .line 105
    iget-object v0, p0, Lo/chr;->e:Landroid/graphics/PointF;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 106
    iget-object v0, p0, Lo/chr;->e:Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->x:F

    iget v1, p0, Lo/chr;->a:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    add-float/2addr v0, v1

    iput v0, p0, Lo/chr;->c:F

    goto :goto_0

    .line 108
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "mStart \u4e0d\u80fd\u4e3a\u7a7a"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 110
    :goto_0
    iget v0, p0, Lo/chr;->c:F

    return v0
.end method


# virtual methods
.method public a()Landroid/graphics/PointF;
    .locals 1

    .line 95
    iget-object v0, p0, Lo/chr;->e:Landroid/graphics/PointF;

    return-object v0
.end method

.method public b()F
    .locals 1

    .line 82
    iget v0, p0, Lo/chr;->d:F

    return v0
.end method

.method public b(F)V
    .locals 0

    .line 90
    iput p1, p0, Lo/chr;->d:F

    .line 91
    return-void
.end method

.method public c()I
    .locals 1

    .line 114
    iget v0, p0, Lo/chr;->k:I

    return v0
.end method

.method public d()F
    .locals 1

    .line 165
    iget v0, p0, Lo/chr;->h:F

    return v0
.end method

.method public e()Landroid/graphics/PointF;
    .locals 4

    .line 54
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {p0}, Lo/chr;->f()F

    move-result v1

    iget-object v2, p0, Lo/chr;->e:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->y:F

    iget v3, p0, Lo/chr;->d:F

    sub-float/2addr v2, v3

    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    return-object v0
.end method

.method public e(F)V
    .locals 0

    .line 86
    iput p1, p0, Lo/chr;->a:F

    .line 87
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 186
    iput-object p1, p0, Lo/chr;->b:Ljava/lang/String;

    .line 187
    return-void
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .line 182
    iget-object v0, p0, Lo/chr;->b:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 191
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "height: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/chr;->d:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
