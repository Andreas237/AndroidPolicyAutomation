.class public Lo/fgd;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:F

.field private b:F

.field private c:F

.field private d:F

.field private e:Lo/fgk;

.field private f:F

.field private g:Lo/fgk;

.field private i:F

.field private k:Lo/fgg;


# virtual methods
.method public a()Lo/fgk;
    .locals 1

    .line 59
    iget-object v0, p0, Lo/fgd;->e:Lo/fgk;

    return-object v0
.end method

.method public a(F)V
    .locals 0

    .line 55
    iput p1, p0, Lo/fgd;->a:F

    .line 56
    return-void
.end method

.method public b()F
    .locals 1

    .line 31
    iget v0, p0, Lo/fgd;->d:F

    return v0
.end method

.method public c()F
    .locals 1

    .line 43
    iget v0, p0, Lo/fgd;->c:F

    return v0
.end method

.method public c(F)V
    .locals 0

    .line 79
    iput p1, p0, Lo/fgd;->i:F

    .line 80
    return-void
.end method

.method public d()F
    .locals 1

    .line 35
    iget v0, p0, Lo/fgd;->b:F

    return v0
.end method

.method public e()Lo/fgk;
    .locals 1

    .line 63
    iget-object v0, p0, Lo/fgd;->g:Lo/fgk;

    return-object v0
.end method

.method public e(F)V
    .locals 0

    .line 71
    iput p1, p0, Lo/fgd;->f:F

    .line 72
    return-void
.end method

.method public g()F
    .locals 1

    .line 75
    iget v0, p0, Lo/fgd;->i:F

    return v0
.end method

.method public i()F
    .locals 1

    .line 67
    iget v0, p0, Lo/fgd;->f:F

    return v0
.end method

.method public k()Lo/fgg;
    .locals 1

    .line 83
    iget-object v0, p0, Lo/fgd;->k:Lo/fgg;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 88
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SlideStripParamModel [mMinValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/fgd;->b:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mMaxValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/fgd;->c:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mCurrentValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/fgd;->a:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mBackgroundStrip="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fgd;->e:Lo/fgk;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mForegroundStrip="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fgd;->g:Lo/fgk;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mCursorModel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fgd;->k:Lo/fgg;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mWidth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/fgd;->f:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mHeight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/fgd;->i:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
