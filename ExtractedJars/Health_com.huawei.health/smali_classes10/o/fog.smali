.class public Lo/fog;
.super Lo/fnv;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lo/fmw;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1}, Lo/fnv;-><init>(Lo/fmw;)V

    .line 29
    return-void
.end method


# virtual methods
.method public a(JILo/fmu;)V
    .locals 10

    .line 34
    move-wide v6, p1

    .line 35
    iput-wide v6, p4, Lo/fmu;->b:J

    .line 36
    const-wide/16 v0, 0x2

    div-long v0, v6, v0

    iput-wide v0, p4, Lo/fmu;->c:J

    .line 37
    iget-wide v0, p4, Lo/fmu;->c:J

    const-wide/16 v2, 0x32

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    iput-wide v0, p4, Lo/fmu;->a:J

    .line 38
    iget-wide v0, p4, Lo/fmu;->a:J

    iput-wide v0, p4, Lo/fmu;->e:J

    .line 39
    iget-wide v0, p4, Lo/fmu;->b:J

    iget-wide v2, p4, Lo/fmu;->e:J

    const-wide/16 v4, 0x4

    mul-long/2addr v2, v4

    add-long v8, v0, v2

    .line 40
    invoke-virtual {p4}, Lo/fmu;->n()V

    .line 42
    invoke-virtual {p4, v8, v9}, Lo/fmu;->e(J)V

    .line 43
    return-void
.end method

.method public b(JLo/fmb;I)V
    .locals 3

    .line 76
    invoke-virtual {p0, p3}, Lo/fog;->e(Lo/fmb;)Lo/fmu;

    move-result-object v1

    .line 77
    invoke-virtual {v1, p3}, Lo/fmu;->c(Lo/fmb;)I

    move-result v2

    .line 79
    const/4 v0, 0x3

    if-eq v2, v0, :cond_0

    const/4 v0, 0x2

    if-ne v2, v0, :cond_1

    .line 80
    :cond_0
    return-void

    .line 83
    :cond_1
    invoke-virtual {v1}, Lo/fmu;->g()V

    .line 84
    invoke-virtual {v1}, Lo/fmu;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    if-ne v2, v0, :cond_2

    .line 87
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lo/fmu;->b(Z)V

    .line 88
    invoke-virtual {p0, p1, p2, v2, v1}, Lo/fog;->a(JILo/fmu;)V

    goto :goto_0

    .line 91
    :cond_2
    invoke-virtual {p0, p1, p2, v2, v1}, Lo/fog;->d(JILo/fmu;)V

    .line 93
    :goto_0
    return-void
.end method

.method protected d(JILo/fmu;)V
    .locals 10

    .line 48
    move-wide v6, p1

    .line 50
    iget-wide v0, p4, Lo/fmu;->b:J

    iget-wide v2, p4, Lo/fmu;->b:J

    sub-long v2, v6, v2

    long-to-double v2, v2

    const-wide/high16 v4, 0x3fc0000000000000L    # 0.125

    mul-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    add-long/2addr v0, v2

    iput-wide v0, p4, Lo/fmu;->b:J

    .line 52
    iget-wide v0, p4, Lo/fmu;->b:J

    iget-wide v2, p4, Lo/fmu;->c:J

    sub-long/2addr v0, v2

    cmp-long v0, v6, v0

    if-gez v0, :cond_0

    .line 53
    iget-wide v0, p4, Lo/fmu;->c:J

    long-to-double v0, v0

    const-wide/high16 v2, 0x3fef000000000000L    # 0.96875

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    iget-wide v2, p4, Lo/fmu;->b:J

    sub-long v2, v6, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    move-result-wide v2

    long-to-double v2, v2

    const-wide/high16 v4, 0x3fa0000000000000L    # 0.03125

    mul-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    add-long/2addr v0, v2

    iput-wide v0, p4, Lo/fmu;->c:J

    goto :goto_0

    .line 55
    :cond_0
    iget-wide v0, p4, Lo/fmu;->c:J

    long-to-double v0, v0

    const-wide/high16 v2, 0x3fe8000000000000L    # 0.75

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    iget-wide v2, p4, Lo/fmu;->b:J

    sub-long v2, v6, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    move-result-wide v2

    long-to-double v2, v2

    const-wide/high16 v4, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    add-long/2addr v0, v2

    iput-wide v0, p4, Lo/fmu;->c:J

    .line 57
    :goto_0
    iget-wide v0, p4, Lo/fmu;->c:J

    iget-wide v2, p4, Lo/fmu;->a:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 58
    iget-wide v0, p4, Lo/fmu;->c:J

    iput-wide v0, p4, Lo/fmu;->a:J

    .line 59
    iget-wide v0, p4, Lo/fmu;->a:J

    iget-wide v2, p4, Lo/fmu;->e:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 60
    iget-wide v0, p4, Lo/fmu;->a:J

    iput-wide v0, p4, Lo/fmu;->e:J

    .line 63
    :cond_1
    iget-wide v0, p4, Lo/fmu;->a:J

    iget-wide v2, p4, Lo/fmu;->e:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_2

    .line 64
    iget-wide v0, p4, Lo/fmu;->e:J

    long-to-double v0, v0

    const-wide/high16 v2, 0x3fe8000000000000L    # 0.75

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    iget-wide v2, p4, Lo/fmu;->a:J

    long-to-double v2, v2

    const-wide/high16 v4, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    add-long/2addr v0, v2

    iput-wide v0, p4, Lo/fmu;->e:J

    .line 66
    :cond_2
    const-wide/16 v0, 0x32

    iput-wide v0, p4, Lo/fmu;->a:J

    .line 67
    iget-wide v0, p4, Lo/fmu;->b:J

    iget-wide v2, p4, Lo/fmu;->e:J

    const-wide/16 v4, 0x4

    mul-long/2addr v2, v4

    add-long v8, v0, v2

    .line 69
    invoke-virtual {p4}, Lo/fmu;->n()V

    .line 71
    invoke-virtual {p4, v8, v9}, Lo/fmu;->e(J)V

    .line 72
    return-void
.end method
