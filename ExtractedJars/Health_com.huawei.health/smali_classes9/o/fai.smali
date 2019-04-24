.class public Lo/fai;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:F

.field private b:F

.field private c:F

.field private d:F

.field private e:F

.field private k:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()F
    .locals 1

    .line 56
    iget v0, p0, Lo/fai;->e:F

    return v0
.end method

.method public a(F)V
    .locals 0

    .line 44
    iput p1, p0, Lo/fai;->a:F

    .line 45
    return-void
.end method

.method public b()F
    .locals 1

    .line 48
    iget v0, p0, Lo/fai;->c:F

    return v0
.end method

.method public b(F)V
    .locals 0

    .line 36
    iput p1, p0, Lo/fai;->b:F

    .line 37
    return-void
.end method

.method public b(I)V
    .locals 0

    .line 28
    iput p1, p0, Lo/fai;->k:I

    .line 29
    return-void
.end method

.method public c()F
    .locals 1

    .line 40
    iget v0, p0, Lo/fai;->a:F

    return v0
.end method

.method public c(F)V
    .locals 0

    .line 68
    iput p1, p0, Lo/fai;->d:F

    .line 69
    return-void
.end method

.method public d()F
    .locals 1

    .line 32
    iget v0, p0, Lo/fai;->b:F

    return v0
.end method

.method public d(F)V
    .locals 0

    .line 60
    iput p1, p0, Lo/fai;->e:F

    .line 61
    return-void
.end method

.method public e()F
    .locals 1

    .line 64
    iget v0, p0, Lo/fai;->d:F

    return v0
.end method

.method public e(F)V
    .locals 0

    .line 52
    iput p1, p0, Lo/fai;->c:F

    .line 53
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 73
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SleepChartData{mDeepSleepValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/fai;->b:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mLightSleepValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/fai;->a:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mNoonSleepValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/fai;->c:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mDreamSleepValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/fai;->e:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mWakeSleepValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/fai;->d:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
