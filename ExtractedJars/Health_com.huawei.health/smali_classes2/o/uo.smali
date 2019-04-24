.class public final Lo/uo;
.super Lo/ou;
.source "SourceFile"


# instance fields
.field private final c:I

.field private final e:F


# direct methods
.method constructor <init>(FFF)V
    .locals 1

    .line 34
    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, p3, v0}, Lo/uo;-><init>(FFFI)V

    .line 35
    return-void
.end method

.method private constructor <init>(FFFI)V
    .locals 0

    .line 38
    invoke-direct {p0, p1, p2}, Lo/ou;-><init>(FF)V

    .line 39
    iput p3, p0, Lo/uo;->e:F

    .line 40
    iput p4, p0, Lo/uo;->c:I

    .line 41
    return-void
.end method


# virtual methods
.method a()I
    .locals 1

    .line 48
    iget v0, p0, Lo/uo;->c:I

    return v0
.end method

.method b(FFF)Z
    .locals 2

    .line 62
    invoke-virtual {p0}, Lo/uo;->e()F

    move-result v0

    sub-float v0, p2, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpg-float v0, v0, p1

    if-gtz v0, :cond_2

    invoke-virtual {p0}, Lo/uo;->b()F

    move-result v0

    sub-float v0, p3, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpg-float v0, v0, p1

    if-gtz v0, :cond_2

    .line 63
    iget v0, p0, Lo/uo;->e:F

    sub-float v0, p1, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v1

    .line 64
    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, v1, v0

    if-lez v0, :cond_0

    iget v0, p0, Lo/uo;->e:F

    cmpg-float v0, v1, v0

    if-gtz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 66
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public d()F
    .locals 1

    .line 44
    iget v0, p0, Lo/uo;->e:F

    return v0
.end method

.method d(FFF)Lo/uo;
    .locals 6

    .line 75
    iget v0, p0, Lo/uo;->c:I

    add-int/lit8 v2, v0, 0x1

    .line 76
    iget v0, p0, Lo/uo;->c:I

    int-to-float v0, v0

    invoke-virtual {p0}, Lo/uo;->b()F

    move-result v1

    mul-float/2addr v0, v1

    add-float/2addr v0, p2

    int-to-float v1, v2

    div-float v3, v0, v1

    .line 77
    iget v0, p0, Lo/uo;->c:I

    int-to-float v0, v0

    invoke-virtual {p0}, Lo/uo;->e()F

    move-result v1

    mul-float/2addr v0, v1

    add-float/2addr v0, p1

    int-to-float v1, v2

    div-float v4, v0, v1

    .line 78
    iget v0, p0, Lo/uo;->c:I

    int-to-float v0, v0

    iget v1, p0, Lo/uo;->e:F

    mul-float/2addr v0, v1

    add-float/2addr v0, p3

    int-to-float v1, v2

    div-float v5, v0, v1

    .line 79
    new-instance v0, Lo/uo;

    invoke-direct {v0, v3, v4, v5, v2}, Lo/uo;-><init>(FFFI)V

    return-object v0
.end method
