.class public final Lo/ur;
.super Lo/ou;
.source "SourceFile"


# instance fields
.field private final c:F


# direct methods
.method constructor <init>(FFF)V
    .locals 0

    .line 32
    invoke-direct {p0, p1, p2}, Lo/ou;-><init>(FF)V

    .line 33
    iput p3, p0, Lo/ur;->c:F

    .line 34
    return-void
.end method


# virtual methods
.method c(FFF)Z
    .locals 2

    .line 41
    invoke-virtual {p0}, Lo/ur;->e()F

    move-result v0

    sub-float v0, p2, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpg-float v0, v0, p1

    if-gtz v0, :cond_2

    invoke-virtual {p0}, Lo/ur;->b()F

    move-result v0

    sub-float v0, p3, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpg-float v0, v0, p1

    if-gtz v0, :cond_2

    .line 42
    iget v0, p0, Lo/ur;->c:F

    sub-float v0, p1, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v1

    .line 43
    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, v1, v0

    if-lez v0, :cond_0

    iget v0, p0, Lo/ur;->c:F

    cmpg-float v0, v1, v0

    if-gtz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 45
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method d(FFF)Lo/ur;
    .locals 5

    .line 53
    invoke-virtual {p0}, Lo/ur;->b()F

    move-result v0

    add-float/2addr v0, p2

    const/high16 v1, 0x40000000    # 2.0f

    div-float v2, v0, v1

    .line 54
    invoke-virtual {p0}, Lo/ur;->e()F

    move-result v0

    add-float/2addr v0, p1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v3, v0, v1

    .line 55
    iget v0, p0, Lo/ur;->c:F

    add-float/2addr v0, p3

    const/high16 v1, 0x40000000    # 2.0f

    div-float v4, v0, v1

    .line 56
    new-instance v0, Lo/ur;

    invoke-direct {v0, v2, v3, v4}, Lo/ur;-><init>(FFF)V

    return-object v0
.end method
