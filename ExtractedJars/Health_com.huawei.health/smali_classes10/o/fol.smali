.class public Lo/fol;
.super Lo/fnv;
.source "SourceFile"


# instance fields
.field private b:I


# direct methods
.method public constructor <init>(Lo/fmw;)V
    .locals 1

    .line 31
    invoke-direct {p0, p1}, Lo/fnv;-><init>(Lo/fmw;)V

    .line 32
    const/4 v0, 0x0

    iput v0, p0, Lo/fol;->b:I

    .line 33
    return-void
.end method


# virtual methods
.method public a(JILo/fmu;)V
    .locals 6

    .line 53
    invoke-virtual {p0, p4, p1, p2}, Lo/fol;->a(Lo/fmu;J)V

    .line 54
    long-to-double v0, p1

    const-wide/high16 v2, 0x3ffc000000000000L    # 1.75

    mul-double/2addr v0, v2

    double-to-long v4, v0

    .line 55
    invoke-virtual {p4, v4, v5}, Lo/fmu;->e(J)V

    .line 56
    return-void
.end method

.method public a(Lo/fmu;J)V
    .locals 2

    .line 42
    iget-object v0, p1, Lo/fmu;->g:[J

    iget v1, p0, Lo/fol;->b:I

    aput-wide p2, v0, v1

    .line 43
    iget v0, p0, Lo/fol;->b:I

    add-int/lit8 v0, v0, 0x1

    rem-int/lit8 v0, v0, 0x2

    iput v0, p0, Lo/fol;->b:I

    .line 44
    return-void
.end method

.method public b(Lo/fmu;)J
    .locals 4

    .line 47
    iget-object v0, p1, Lo/fmu;->g:[J

    const/4 v1, 0x0

    aget-wide v0, v0, v1

    iget-object v2, p1, Lo/fmu;->g:[J

    const/4 v3, 0x1

    aget-wide v2, v2, v3

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-object v0, p1, Lo/fmu;->g:[J

    const/4 v1, 0x0

    aget-wide v0, v0, v1

    goto :goto_0

    :cond_0
    iget-object v0, p1, Lo/fmu;->g:[J

    const/4 v1, 0x1

    aget-wide v0, v0, v1

    :goto_0
    return-wide v0
.end method

.method public b(JLo/fmb;I)V
    .locals 3

    .line 79
    invoke-virtual {p0, p3}, Lo/fol;->e(Lo/fmb;)Lo/fmu;

    move-result-object v1

    .line 80
    invoke-virtual {v1, p3}, Lo/fmu;->c(Lo/fmb;)I

    move-result v2

    .line 82
    const/4 v0, 0x3

    if-eq v2, v0, :cond_0

    const/4 v0, 0x2

    if-ne v2, v0, :cond_1

    .line 83
    :cond_0
    return-void

    .line 88
    :cond_1
    invoke-virtual {v1}, Lo/fmu;->g()V

    .line 89
    invoke-virtual {v1}, Lo/fmu;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    if-ne v2, v0, :cond_2

    .line 92
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lo/fmu;->b(Z)V

    .line 93
    invoke-virtual {p0, p1, p2, v2, v1}, Lo/fol;->a(JILo/fmu;)V

    goto :goto_0

    .line 96
    :cond_2
    invoke-virtual {p0, p1, p2, v2, v1}, Lo/fol;->d(JILo/fmu;)V

    .line 98
    :goto_0
    return-void
.end method

.method protected d(JILo/fmu;)V
    .locals 8

    .line 61
    invoke-virtual {p0, p4, p1, p2}, Lo/fol;->a(Lo/fmu;J)V

    .line 62
    iget-wide v0, p4, Lo/fmu;->k:J

    sub-long v0, p1, v0

    long-to-double v0, v0

    long-to-double v2, p1

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    iput-wide v0, p4, Lo/fmu;->d:D

    .line 63
    iget-wide v0, p4, Lo/fmu;->d:D

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    mul-double/2addr v0, v2

    iget-wide v2, p4, Lo/fmu;->h:D

    const-wide v4, 0x3feeaaaaaaaaaaabL    # 0.9583333333333334

    mul-double/2addr v2, v4

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    iput-wide v0, p4, Lo/fmu;->h:D

    .line 64
    iget-wide v0, p4, Lo/fmu;->k:J

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    iput-wide v0, p4, Lo/fmu;->i:J

    .line 65
    invoke-virtual {p0, p4}, Lo/fol;->b(Lo/fmu;)J

    move-result-wide v0

    const-wide/16 v2, 0x64

    add-long/2addr v0, v2

    iput-wide v0, p4, Lo/fmu;->f:J

    .line 67
    invoke-virtual {p4}, Lo/fmu;->i()J

    move-result-wide v0

    long-to-double v0, v0

    const-wide v2, 0x3feeaaaaaaaaaaabL    # 0.9583333333333334

    mul-double/2addr v0, v2

    iget-wide v2, p4, Lo/fmu;->h:D

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    add-double/2addr v2, v4

    iget-wide v4, p4, Lo/fmu;->i:J

    long-to-double v4, v4

    mul-double/2addr v2, v4

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    double-to-long v6, v0

    .line 68
    iget-wide v0, p4, Lo/fmu;->i:J

    const-wide/16 v2, 0x64

    add-long/2addr v0, v2

    invoke-static {v6, v7, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    iget-wide v2, p4, Lo/fmu;->f:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    .line 69
    invoke-virtual {p4}, Lo/fmu;->l()V

    .line 71
    iput-wide p1, p4, Lo/fmu;->k:J

    .line 73
    invoke-virtual {p4, v6, v7}, Lo/fmu;->e(J)V

    .line 74
    return-void
.end method
