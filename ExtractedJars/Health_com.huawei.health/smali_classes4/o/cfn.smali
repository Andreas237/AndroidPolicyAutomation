.class public Lo/cfn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Lo/cdx;


# instance fields
.field private d:F

.field private e:J


# direct methods
.method public constructor <init>(JF)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-wide p1, p0, Lo/cfn;->e:J

    .line 31
    iput p3, p0, Lo/cfn;->d:F

    .line 32
    return-void
.end method


# virtual methods
.method public a()F
    .locals 2

    .line 43
    iget v0, p0, Lo/cfn;->d:F

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    const v1, 0x40666666    # 3.6f

    mul-float/2addr v0, v1

    return v0
.end method

.method public b()Lo/cfk;
    .locals 4

    .line 68
    new-instance v0, Lo/cfk;

    iget-wide v1, p0, Lo/cfn;->e:J

    invoke-virtual {p0}, Lo/cfn;->c()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lo/cfk;-><init>(JI)V

    return-object v0
.end method

.method public c()F
    .locals 4

    .line 52
    iget v0, p0, Lo/cfn;->d:F

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3ee4f8b588e368f1L    # 1.0E-5

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    .line 53
    iget v0, p0, Lo/cfn;->d:F

    const v1, 0x461c4000    # 10000.0f

    div-float v0, v1, v0

    return v0

    .line 55
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public d()F
    .locals 1

    .line 35
    iget v0, p0, Lo/cfn;->d:F

    return v0
.end method

.method public e()J
    .locals 2

    .line 78
    iget-wide v0, p0, Lo/cfn;->e:J

    return-wide v0
.end method

.method public g()Lo/cfp;
    .locals 5

    .line 72
    new-instance v0, Lo/cfp;

    iget-wide v1, p0, Lo/cfn;->e:J

    invoke-virtual {p0}, Lo/cfn;->a()F

    move-result v3

    float-to-double v3, v3

    invoke-direct {v0, v1, v2, v3, v4}, Lo/cfp;-><init>(JD)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 60
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v1, p0, Lo/cfn;->e:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/cfn;->d:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
