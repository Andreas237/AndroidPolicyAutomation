.class public Lo/fgk;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:F

.field private b:F

.field private c:I

.field private d:I

.field private e:F

.field private f:F

.field private h:I

.field private i:F


# virtual methods
.method public a()F
    .locals 1

    .line 20
    iget v0, p0, Lo/fgk;->e:F

    return v0
.end method

.method public a(F)V
    .locals 0

    .line 56
    iput p1, p0, Lo/fgk;->b:F

    .line 57
    return-void
.end method

.method public b()I
    .locals 1

    .line 28
    iget v0, p0, Lo/fgk;->h:I

    return v0
.end method

.method public b(F)V
    .locals 0

    .line 72
    iput p1, p0, Lo/fgk;->i:F

    .line 73
    return-void
.end method

.method public c()I
    .locals 1

    .line 36
    iget v0, p0, Lo/fgk;->c:I

    return v0
.end method

.method public c(F)V
    .locals 0

    .line 48
    iput p1, p0, Lo/fgk;->a:F

    .line 49
    return-void
.end method

.method public d()I
    .locals 1

    .line 40
    iget v0, p0, Lo/fgk;->d:I

    return v0
.end method

.method public d(F)V
    .locals 0

    .line 64
    iput p1, p0, Lo/fgk;->f:F

    .line 65
    return-void
.end method

.method public d(I)V
    .locals 0

    .line 32
    iput p1, p0, Lo/fgk;->h:I

    .line 33
    return-void
.end method

.method public e()F
    .locals 1

    .line 44
    iget v0, p0, Lo/fgk;->a:F

    return v0
.end method

.method public e(F)V
    .locals 0

    .line 24
    iput p1, p0, Lo/fgk;->e:F

    .line 25
    return-void
.end method

.method public h()F
    .locals 1

    .line 52
    iget v0, p0, Lo/fgk;->b:F

    return v0
.end method

.method public i()F
    .locals 1

    .line 68
    iget v0, p0, Lo/fgk;->i:F

    return v0
.end method

.method public k()F
    .locals 1

    .line 60
    iget v0, p0, Lo/fgk;->f:F

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 77
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "StripModel [mHeightId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/fgk;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mColorId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/fgk;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mHeight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/fgk;->e:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mStartX="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/fgk;->a:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mStartY="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/fgk;->b:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mEndX="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/fgk;->f:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mEndY="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/fgk;->i:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/fgk;->h:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
